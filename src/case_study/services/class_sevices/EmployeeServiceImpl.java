package case_study.services.class_sevices;

import case_study.models.models_person.Employee;
import case_study.services.interface_services.EmployeeService;
import case_study.until.ReadAndWriteFile;
import case_study.until.RegexData;

import java.io.File;
import java.util.*;

public class EmployeeServiceImpl implements EmployeeService {
    public static final String REGEX_AGE = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";

    Scanner scanner = new Scanner(System.in);
    List<Employee> listOj;
    List<String[]> listStringArr;
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    Employee employee;
    String line = "";

    public static final String REGEX_NUM = "^[0-9]{0,}$";

    @Override
    public void displayEmployee() {
        listOj = new ArrayList<>();
        listStringArr = readAndWriteFile.readFile("case_study\\file\\employee1.csv");
        for (String[] arr : listStringArr) {
            employee = new Employee(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3],
                    Integer.parseInt(arr[4]), Integer.parseInt(arr[5]), arr[6], arr[7], arr[8], Double.parseDouble(arr[9]));
            listOj.add(employee);
        }
        for (Employee arr : listOj) {
            System.out.println(arr);
        }


    }

    @Override
    public void addEmployee() {

        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();


        System.out.println("id");
        int id = Integer.parseInt(RegexData.regexData(REGEX_NUM, scanner.nextLine(), "sai định dạng"));
        System.out.println("name");
        String name = scanner.nextLine();
        System.out.println("date of birth ");
        String birth = (RegexData.regexAge(REGEX_AGE, scanner.nextLine()));
        System.out.println("gender");
        String gender = scanner.nextLine();
        System.out.println("Passport");
        int passport = Integer.parseInt(RegexData.regexData(REGEX_NUM, scanner.nextLine(), "sai định dạng"));
        System.out.println("phone number");
        int phone = Integer.parseInt(RegexData.regexData(REGEX_NUM, scanner.nextLine(), "sai định dạng"));
        System.out.println("email");
        String email = (scanner.nextLine());
        System.out.println("level");
        String level = (scanner.nextLine());
        System.out.println("position");
        String position = scanner.nextLine();
        System.out.println("salary");
        double salary = Double.parseDouble(RegexData.regexData(REGEX_NUM, scanner.nextLine(), "sai định dạng"));

//        line = id + "," + name + "," + birth + "," + gender + "," + passport + "," + phone + "," + email + "," + level + "," + position + "," +
//                salary;
        List<String> list = new ArrayList<>();
        list.add(id + "," + name + "," + birth + "," + gender + "," + passport + "," + phone + "," + email + "," + level + "," + position + "," +
                salary);

        readAndWriteFile.writeFile("case_study\\file\\employee1.csv", list);
    }


    @Override
    public void editEmployee() {
        listStringArr = readAndWriteFile.readFile("case_study\\file\\employee1.csv");
        File file = new File("case_study\\file\\employee1.csv");
        file.delete();
        listOj = new ArrayList<>();
        for (String[] arr : listStringArr) {
            listOj.add(new Employee(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3],
                    Integer.parseInt(arr[4]), Integer.parseInt(arr[5]), arr[6], arr[7],
                    arr[8], Double.parseDouble(arr[9])));
        }

        System.out.println("enter id want to edit");
        int id = Integer.parseInt(scanner.nextLine());
        int index = -1;
        for (int i = 0; i < listOj.size(); i++) {
            if (id == (listOj.get(i).getId())) {
                index = i;
            }
        }

        System.out.println("id");
        listOj.get(index).setId(Integer.parseInt(RegexData.regexData(REGEX_NUM, scanner.nextLine(), "sai định dạng")));
        System.out.println("name");
        listOj.get(index).setName(scanner.nextLine());
        System.out.println("date of birth ");
        listOj.get(index).setDateOfBirth(RegexData.regexAge(REGEX_AGE, scanner.nextLine()));
        System.out.println("gender");
        listOj.get(index).setGender(scanner.nextLine());
        System.out.println("Passport");
        listOj.get(index).setPassport(Integer.parseInt(RegexData.regexData(REGEX_NUM, scanner.nextLine(), "sai định dạng")));
        System.out.println("phone number");
        listOj.get(index).setPhoneNumber(Integer.parseInt(RegexData.regexData(REGEX_NUM, scanner.nextLine(), "sai định dạng")));
        System.out.println("email");
        listOj.get(index).setEmail(scanner.nextLine());
        System.out.println("level");
        listOj.get(index).setLevel(scanner.nextLine());
        System.out.println("position");
        listOj.get(index).setPosition(scanner.nextLine());
        System.out.println("salary");
        listOj.get(index).setSalary(Double.parseDouble(RegexData.regexData(REGEX_NUM, scanner.nextLine(), "sai định dạng")));


        List<String> list = new ArrayList<>();
        for (Employee arr1 : listOj) {
            list.add(arr1.getId() + "," + arr1.getName() + "," + arr1.getDateOfBirth() + ","
                    + arr1.getGender() + "," + arr1.getPassport() + "," + arr1.getPhoneNumber()
                    + "," + arr1.getEmail() + "," + arr1.getLevel() + ","
                    + arr1.getPosition() + "," + arr1.getSalary());
        }
        readAndWriteFile.writeFile("case_study\\file\\employee.csv", list);

    }


    @Override
    public void removeEmployee() {
        System.out.println("enter id deleter");
        int id = Integer.parseInt(scanner.nextLine());
        Employee temp = new Employee();
        for (int i = 0; i < listOj.size(); i++) {
            if (listOj.get(i).getId() == id) {
                listOj.remove(i);
            }
        }


    }


}
