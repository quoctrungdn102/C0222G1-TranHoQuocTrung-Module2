package case_study.services.class_sevices;

import case_study.models_house.Facility;
import case_study.models_house.House;
import case_study.models_house.Room;
import case_study.models_house.Villa;
import case_study.services.interface_services.FacilityService;
import case_study.until.ReadAndWriteFile;
import case_study.until.RegexData;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


    }

    public static final String REGEX_ID_VILA = "^(SVVL)(-)[0-9]{4}$";
    public static final String REGEX_ID_HOUSE = "^(SVHO)(-)[0-9]{4}$";
    public static final String REGEX_ID_ROOM = "^(SVRO)(-)[0-9]{4}$";

    public static final String REGEX_NAME_SERVICE = "^[A-Z][a-zA-Z0-9]{1,}";
    public static final String REGEX_AREA = "^[3-9]\\d{1,}|\\d{3,}$";
    public static final String REGEX_PRICE = "^[1-9]|\\d{1,}$";
    public static final String REGEX_PEOPLE = "^[1-9]|(1)\\d$";
    public static final String REGEX_FLOOR = "^[1-9]|[1-9]\\d$";
    Scanner scanner = new Scanner(System.in);

    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    Villa villa;
    House house;
    Room room;

    int value;

    @Override
    public void displayFacility() {
        Map<Facility, Integer> map;
        map = returnMap();
        for (Map.Entry<Facility, Integer> temp : map.entrySet()) {
            System.out.println(temp.getKey().toString() + "so lan thue" + temp.getValue());
        }
    }

    public  Map<Facility,Integer> returnMap() {
        Map<Facility, Integer> map = new LinkedHashMap<>();
        List<String[]> listArrString = readAndWriteFile.readFile("case_study\\file\\facility.csv");
        for (String[] arr : listArrString) {
            if (arr[0].equals("vila")) {
                villa = new Villa(arr[1], arr[2], Double.parseDouble(arr[3]), Double.parseDouble(arr[4]),
                        Integer.parseInt(arr[5]), arr[6], arr[7], Double.parseDouble(arr[8]), Integer.parseInt(arr[9]));
                map.put(villa,Integer.parseInt(arr[10]));
            } else if (arr[0].equals("house")) {
                house = new House(arr[1], arr[2], Double.parseDouble(arr[3]), Double.parseDouble(arr[4]),
                        Integer.parseInt(arr[5]), arr[6], arr[7], Integer.parseInt(arr[8]));
                map.put(house, Integer.parseInt(arr[9]));
            } else if (arr[0].equals("room")) {
                room = new Room(arr[1], arr[2], Double.parseDouble(arr[3]), Double.parseDouble(arr[4]),
                        Integer.parseInt(arr[5]), arr[6], arr[7]);
                map.put(room, Integer.parseInt(arr[8]));
            }
        }
        return map;
    }

    @Override
    public void adđNewVila() {
        value++;
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        System.out.println("nhap id vila");
        String id = RegexData.regexData(REGEX_ID_VILA, scanner.nextLine(), "bạn đã nhập id sai- id:SVVL-XXXX(number) ");
        System.out.println("name service ");
        String name = RegexData.regexData(REGEX_NAME_SERVICE, scanner.nextLine(), "viết hoa chữ cái đầu ");
        System.out.println("nhap area");
        double area = Double.parseDouble(RegexData.regexData(REGEX_AREA, scanner.nextLine(), "Area is num &&> 30 "));
        System.out.println("nhap gia thue ");
        double price = Double.parseDouble(RegexData.regexData(REGEX_PRICE, scanner.nextLine(), "price ís num &&>0"));
        System.out.println("nhap so nguoi thue");
        int people = Integer.parseInt(RegexData.regexData(REGEX_PEOPLE, scanner.nextLine(), "0< is num <20"));
        System.out.println("kiểu thuê  ");
        String rental = RegexData.regexData(REGEX_NAME_SERVICE, scanner.nextLine(), "viết hoa chữ cái đầu ");
        System.out.println("kiểu phong can thue");
        String room = RegexData.regexData(REGEX_NAME_SERVICE, scanner.nextLine(), "viết hoa chữ cái đầu ");
        System.out.println(" area pool  ");
        double areaPool = Double.parseDouble(RegexData.regexData(REGEX_AREA, scanner.nextLine(), "Area pool is number > 30"));
        System.out.println("nhap so so tang ");
        int floor = Integer.parseInt(RegexData.regexData(REGEX_FLOOR, scanner.nextLine(), "0 < floor is num < 99"));
        value = 0;
        List<String> listString = new ArrayList<>();
        listString.add("vila" + "," + id + "," + name + "," + area + "," + price + "," + people + "," + rental + "," + room + "," + areaPool + "," + floor
                + "," + value);
        readAndWriteFile.writeFile("case_study\\file\\facility.csv", listString);
        readAndWriteFile.writeFile("case_study\\file\\vila.csv", listString);
    }


    @Override
    public void adđNewRoom() {
        System.out.println("nhap id room");
        String id = RegexData.regexData(REGEX_ID_ROOM, scanner.nextLine(), "bạn đã nhập id sai- id:SVRO-XXXX(number) ");
        System.out.println("name service ");
        String name = RegexData.regexData(REGEX_NAME_SERVICE, scanner.nextLine(), "viết hoa chữ cái đầu ");
        System.out.println("nhap area");
        double area = Double.parseDouble(RegexData.regexData(REGEX_AREA, scanner.nextLine(), "Area is num > 30"));
        System.out.println("nhap gia thue ");
        double price = Double.parseDouble(RegexData.regexData(REGEX_PRICE, scanner.nextLine(), "is num >0"));
        System.out.println("nhap so nguoi thue");
        int people = Integer.parseInt(RegexData.regexData(REGEX_PEOPLE, scanner.nextLine(), "0< is num <20"));
        System.out.println("kiểu thuê  ");
        String rental = RegexData.regexData(REGEX_NAME_SERVICE, scanner.nextLine(), "viết hoa chữ cái đầu ");
        System.out.println("service free");
        String service = (scanner.nextLine());

        List<String> listString = new ArrayList<>();
        Facility room = new Room(id, name, area, price, people, rental, service);
        int value = 0;
        listString.add("room" + "," + id + "," + name + "," + area + "," + price + "," + people + "," + rental + "," + service + "," +
                +value);
        readAndWriteFile.writeFile("case_study\\file\\facility.csv", listString);

    }

    @Override
    public void adđNewHouse() {
        System.out.println("nhap id house");
        String id = RegexData.regexData(REGEX_ID_HOUSE, scanner.nextLine(), "bạn đã nhập id sai- id:SVHO-XXXX(number) ");
        System.out.println("name service ");
        String name = RegexData.regexData(REGEX_NAME_SERVICE, scanner.nextLine(), "viết hoa chữ cái đầu ");
        System.out.println("nhap area");
        double area = Double.parseDouble(RegexData.regexData(REGEX_AREA, scanner.nextLine(), "Area is num > 30"));
        System.out.println("nhap gia thue ");
        double price = Double.parseDouble(RegexData.regexData(REGEX_PRICE, scanner.nextLine(), "is num >0"));
        System.out.println("nhap so nguoi thue");
        int people = Integer.parseInt(RegexData.regexData(REGEX_PEOPLE, scanner.nextLine(), "0< is num <20"));
        System.out.println("kiểu thuê  ");
        String rental = RegexData.regexData(REGEX_NAME_SERVICE, scanner.nextLine(), "viết hoa chữ cái đầu ");
        System.out.println("kiểu phong can thue");
        String room = RegexData.regexData(REGEX_NAME_SERVICE, scanner.nextLine(), "viết hoa chữ cái đầu ");
        System.out.println("nhap so so tang ");
        int floor = Integer.parseInt(RegexData.regexData(REGEX_FLOOR, scanner.nextLine(), "0 < floor is num < 99"));

        Facility house = new House(id, name, area, price, people, rental, room, floor);

        List<String> listString = new ArrayList<>();
        int value = 0;
        listString.add("house" + "," + id + "," + name + "," + area + "," + price + "," + people + "," + rental + "," + room
                + "," + floor +
                "," + value);
        readAndWriteFile.writeFile("case_study\\file\\facility.csv", listString);
    }


    @Override
    public void maintenanceList() {
        Map<Facility, Integer> map = new LinkedHashMap<>();
        map = returnMap();
        System.out.println("danh sách đang bảo trì ");
        for (Map.Entry<Facility,Integer> temp: map.entrySet()) {
            if (temp.getValue()==5){
                System.out.println(temp.getKey().toString()+"so lan su dung " + temp.getValue());
            }
        }

    }


}

