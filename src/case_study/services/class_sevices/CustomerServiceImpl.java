package case_study.services.class_sevices;

import case_study.models.models_person.Customer;
import case_study.services.interface_services.CustomerService;
import case_study.until.ReadAndWriteFile;
import case_study.until.RegexData;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    public static final String REGEX_AGE = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";

    Scanner scanner = new Scanner(System.in);
    List<String[]> listStringArr;
    Customer customer;
    List<Customer> list2;
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    List <String> listString = new ArrayList<>();

    @Override
    public void displayCustomer() {
        list2 =  returnList2();
        for (Customer arr : list2) {
            System.out.println(arr);
        }

    }

    public List<Customer> returnList2() {
        listStringArr = readAndWriteFile.readFile("case_study\\file\\customer.csv");
        list2 = new ArrayList<>();
        for (String[] arr : listStringArr) {
            customer = new Customer(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3],
                    Integer.parseInt(arr[4]), Integer.parseInt(arr[5]), arr[6], arr[7], arr[8]);
            list2.add(customer);
        }
        return list2;
    }

    @Override
    public void addCustomer() {

        System.out.println("id");
        int id = Integer.parseInt(RegexData.regexData(EmployeeServiceImpl.REGEX_NUM, scanner.nextLine(),
                "sai định dạng"));
        System.out.println("name");
        String name = scanner.nextLine();
        System.out.println("date of birth ");
        String birth = RegexData.regexAge(REGEX_AGE, scanner.nextLine());
        System.out.println("gender");
        String gender = scanner.nextLine();
        System.out.println("Passport");
        int passport = Integer.parseInt(RegexData.regexData(EmployeeServiceImpl.REGEX_NUM,
                scanner.nextLine(), "sai định dạng"));
        System.out.println("phone number");
        int phone = Integer.parseInt(RegexData.regexData(EmployeeServiceImpl.REGEX_NUM,
                scanner.nextLine(), "sai định dạng"));
        System.out.println("email");
        String email = (scanner.nextLine());
        System.out.println("Type customer");
        String type = (scanner.nextLine());
        System.out.println("address");
        String address = scanner.nextLine();
        listString.add( id + "," + name + "," + birth + "," + gender + "," + passport + "," + phone + "," + email + "," + type + "," + address);
        readAndWriteFile.writeFile("case_study\\file\\customer.csv", listString);
    }

    @Override
    public void editCustomer() {
        File file = new File("case_study\\file\\customer.csv");
        listStringArr = readAndWriteFile.readFile("case_study\\file\\customer.csv");
        file.delete();

        list2 = new ArrayList<>();
        for (String[] arr : listStringArr) {
            customer = new Customer(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3],
                    Integer.parseInt(arr[4]), Integer.parseInt(arr[5]), arr[6], arr[7], arr[8]);
            list2.add(customer);
        }

        System.out.println("enter id want to edit");
        int id = Integer.parseInt(scanner.nextLine());
        int index = -1;
        for (int i = 0; i < list2.size(); i++) {
            if (id == (list2.get(i).getId())) {
                index = i;
            }
        }
        System.out.println("id");
        list2.get(index).setId(Integer.parseInt(RegexData.regexData(EmployeeServiceImpl.REGEX_NUM,
                scanner.nextLine(), "sai định dạng")));
        System.out.println("name");
        list2.get(index).setName(scanner.nextLine());
        System.out.println("date of birth ");
        list2.get(index).setDateOfBirth(RegexData.regexAge(REGEX_AGE,scanner.nextLine()));
        System.out.println("gender");
        list2.get(index).setGender(scanner.nextLine());
        System.out.println("Passport");
        list2.get(index).setPassport(Integer.parseInt(RegexData.regexData(EmployeeServiceImpl.REGEX_NUM,
                scanner.nextLine(), "sai định dạng")));
        System.out.println("phone number");
        list2.get(index).setPhoneNumber(Integer.parseInt(RegexData.regexData(EmployeeServiceImpl.REGEX_NUM,
                scanner.nextLine(), "sai định dạng")));
        System.out.println("email");
        list2.get(index).setEmail(scanner.nextLine());
        System.out.println("Type customer");
        list2.get(index).setCustomerType(scanner.nextLine());
        System.out.println("address");
        list2.get(index).setAddress(scanner.nextLine());

        for (Customer arr : list2) {
            listString.add( customer.value());
        }
        readAndWriteFile.writeFile("case_study\\file\\customer.csv", listString);
    }

    public  Customer getCustomer(int id){
        List<String[]> list  = readAndWriteFile.readFile("case_study\\file\\customer.csv");
        Customer customer;
        for (String[] arr: list) {
            if (Integer.parseInt(arr[0])==id){
                customer= new Customer(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3],Integer.parseInt(arr[4]),
                        Integer.parseInt(arr[5]),arr[6],arr[7],arr[8]);
                return customer;
            }
        }
       return null;
    }


    @Override
    public void removeCustomer() {

    }
}
