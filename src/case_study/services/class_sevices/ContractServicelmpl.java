package case_study.services.class_sevices;

import _16_io_file.exercise.read_file.ReadAndWrite;
import case_study.controllers.FuramaController;
import case_study.models.Booking;
import case_study.models.Contract;
import case_study.models.models_person.Customer;
import case_study.until.ReadAndWriteFile;

import java.util.*;

public class ContractServicelmpl {
    static Scanner scanner = new Scanner(System.in);
    static Contract contract = new Contract();
    static List<Contract> list = new ArrayList<>();
    static ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();

    public static void displayListContracts() {
        List<String[]> listString = new ArrayList<>();
        listString = readAndWriteFile.readFile("case_study\\file\\contract.csv");
        for (String[] temp : listString) {
            contract = new Contract(Integer.parseInt(temp[0]), Integer.parseInt(temp[1])
                    , Double.parseDouble(temp[2]), Double.parseDouble(temp[3]));
            list.add(contract);
        }
        for (Contract tem : list) {
            System.out.println(tem.toString());
        }
    }


    public static void createNewConstracts() {
        Queue<Booking> queue = new LinkedList<>();
        Set<Booking> set = FuramaController.bookingService.returnSetBooking();
        for (Booking arr : set) {
            if (!arr.getFacility().getId().substring(0, arr.getFacility().getId().indexOf("-")).equals("SVRO")) {
                queue.add(arr);
            }
        }
        for (Booking arr : queue) {
            System.out.println(arr.toString());
            System.out.println("-----------------------");
        }

        Booking booking;
        Contract contract;

        List<String> listString = new ArrayList<>();
        while (!queue.isEmpty()) {
            int id = checkId();

            System.out.println("tien tra truoc");
            double deposit = Double.parseDouble(scanner.nextLine());
            System.out.println("tong thanh toan");
            double total = Double.parseDouble(scanner.nextLine());

            booking = queue.poll();
            System.out.println("  tao hop dong thanh cong cho booking" + booking);
            assert booking != null;
            contract = new Contract(id, booking.getIdBooking(), deposit, total);
           listString.add( id + "," + booking.getIdBooking() + "," + deposit + "," + total);
            readAndWriteFile.writeFile("case_study\\file\\contract.csv", listString);
        }


    }

    public static int checkId() {
        List<String[]> list = readAndWriteFile.readFile("case_study\\file\\contract.csv");
        boolean flag;
        int id ;
        do {
            flag = false;
            System.out.println("nhap id contract");
             id = Integer.parseInt(scanner.nextLine());
            for (String[] arr : list) {
                if (id == Integer.parseInt(arr[0])) {
                    flag = true;
                }
            }
        } while (flag);
        return id;
    }
}
