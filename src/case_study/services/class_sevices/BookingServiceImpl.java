package case_study.services.class_sevices;

import case_study.models.Booking;
import case_study.models.models_person.Customer;
import case_study.models_house.Facility;
import case_study.models_house.House;
import case_study.models_house.Room;
import case_study.models_house.Villa;
import case_study.services.interface_services.BookingService;
import case_study.until.ReadAndWriteFile;
import case_study.until.RegexData;

import java.io.File;
import java.util.*;

public class BookingServiceImpl implements BookingService {
    List<String[]> listStringArr = new ArrayList<>();
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    CustomerServiceImpl customerService = new CustomerServiceImpl();
    Scanner scanner = new Scanner(System.in);
    FacilityServiceImpl facilityService = new FacilityServiceImpl();
    Facility facility;
    int index;
    Customer customer;
    public static final String REGEX_AGE = "^(0?[1-9]{2}|[12][0-9]|3[01])[\\/\\-](0?[1-9]{2}|1[012])[\\/\\-]\\d{4}$";

    public static final String REGEX_ID_FACILITY = "^(SVRO|SVHO|SVVL)(-)[0-9]{4}$";

    public BookingServiceImpl() {
    }

//    private Set<Bookin   Set<Booking> set ;g> set = new TreeSet<>();
Set<Booking> set ;
    Booking booking;

    @Override
    public void displayBooking() {

       set = returnSetBooking();
        for (Booking tempt : set) {
            System.out.println(tempt.toString());
            System.out.println("---------------------------------------------");
        }

    }

    public Set<Booking> returnSetBooking() {
        Set<Booking> set = new TreeSet<>();
        listStringArr = readAndWriteFile.readFile("case_study\\file\\booking.csv");
        for (String[] arr : listStringArr) {
            customer = new Customer(Integer.parseInt(arr[3]), arr[4], arr[5], arr[6],
                    Integer.parseInt(arr[7]), Integer.parseInt(arr[8]), arr[9], arr[10], arr[11]);
            if (arr[12].equals("vila")) {
                facility = new Villa(arr[13], arr[14], Double.parseDouble(arr[15]), Double.parseDouble(arr[16]),
                        Integer.parseInt(arr[17]), arr[18], arr[19], Double.parseDouble(arr[20]), Integer.parseInt(arr[21]));
                booking = new Booking(Integer.parseInt(arr[0]), arr[1], arr[2], customer, facility);
                set.add(booking);
            } else if (arr[12].equals("house")) {
                facility = new House(arr[13], arr[14], Double.parseDouble(arr[15]), Double.parseDouble(arr[16]),
                        Integer.parseInt(arr[17]), arr[18], arr[19], Integer.parseInt(arr[20]));
                booking = new Booking(Integer.parseInt(arr[0]), arr[1], arr[2], customer, facility);
                set.add(booking);

            } else if (arr[12].equals("room")) {
                facility = new Room(arr[13], arr[14], Double.parseDouble(arr[15]), Double.parseDouble(arr[16]),
                        Integer.parseInt(arr[17]), arr[18], arr[19]);
                booking = new Booking(Integer.parseInt(arr[0]), arr[1], arr[2], customer, facility);
                set.add(booking);
            }
        }
        return set;
    }


    @Override
    public void addNewBooking() {
        List<Customer> list = new ArrayList<>();

        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        customerService.displayCustomer();
        boolean flash = true;

        do {
            System.out.println("nhap id customer");
            try {
                int id = Integer.parseInt(scanner.nextLine());
                index = -1;
                list = customerService.returnList2();
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getId() == id) {
                        index = i;
                        flash = false;

                    }
                }
                if (flash) {
                    System.out.println("id khong ton tai");

                }
            } catch (Exception e) {
                System.err.println("sai dinh dang ");
            }
        } while (flash);

        facilityService.displayFacility();
        String id;
        Map<Facility, Integer> map;
        do {
        ;
            System.out.println("nhap id Facility");
            id = RegexData.regexData(REGEX_ID_FACILITY, scanner.nextLine(), "sai dinh dang id: SVXX-YYYY ");
            map = facilityService.returnMap();
            File file = new File("case_study\\file\\facility.csv");
            file.delete();
            List<String> listString2 = new ArrayList<>();
            for (Map.Entry<Facility, Integer> tempt : map.entrySet()) {
                if (tempt.getKey().getId().equals(id) && tempt.getValue()<5) {

                    facility = tempt.getKey();
                    tempt.setValue((tempt.getValue()+1));

                    System.out.println("nhap id boking ");
                    int idBooking = Integer.parseInt(scanner.nextLine());
                    String starDay="";
                    String endDay="";
                    try {
                        System.out.println("nhap star day  ");
                        starDay = RegexData.regexData(REGEX_AGE, scanner.nextLine(), "sai dinh dang dd/MM/yyyy");
                        System.out.println("nhap end day  ");
                         endDay = RegexData.regexData(REGEX_AGE, scanner.nextLine(), "sai dinh dang dd/MM/yyyy");
                    }catch (Exception e){
                        System.out.println("sai dinh dang ");

                    }

                    List<String> listString = new ArrayList<>();
                    listString.add(idBooking + "," + starDay + "," + endDay + "," + list.get(index).value() + "," + facility.getValue());
                    readAndWriteFile.writeFile("case_study\\file\\booking.csv", listString);


                    for (Map.Entry<Facility,Integer> temp: map.entrySet()) {
                        listString2.add(temp.getKey().getValue()+","+temp.getValue());
                    }
                    readAndWriteFile.writeFile("case_study\\file\\facility.csv",listString2);
                    flash = true;
                    break;
                }
                else if (tempt.getValue() >=5){
                    System.out.println("phong dang bao tri ");
                    for (Map.Entry<Facility,Integer> temp: map.entrySet()) {
                        listString2.add(temp.getKey().getValue()+","+temp.getValue());
                    }
                    readAndWriteFile.writeFile("case_study\\file\\facility.csv",listString2);
                    flash = true;
                    break;

                }
            }
            if (!flash) {
                System.err.println("id khong ton tai");

            }
        } while (!flash);




    }

}
