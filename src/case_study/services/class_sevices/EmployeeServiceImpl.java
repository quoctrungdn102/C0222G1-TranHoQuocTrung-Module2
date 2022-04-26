package case_study.services.class_sevices;

import case_study.models.models_person.Customer;
import case_study.models.models_person.Employee;
import case_study.services.interface_services.EmployeeService;

import java.util.*;

public class EmployeeServiceImpl implements EmployeeService {

    Scanner scanner = new Scanner(System.in);
    List<Employee> list = new ArrayList<>();


    @Override
    public void displayEmployee() {
        for (Employee arr : list) {
            System.out.println(arr);
        }


    }

    @Override
    public void addEmployee() {
        System.out.println("id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("name");
        String name = scanner.nextLine();
        System.out.println("date of birth ");
        String birth = (scanner.nextLine());
        System.out.println("gender");
        String gender = scanner.nextLine();
        System.out.println("Passport");
        int passport = Integer.parseInt(scanner.nextLine());
        System.out.println("phone number");
        int phone = Integer.parseInt(scanner.nextLine());
        System.out.println("email");
        String email = (scanner.nextLine());
        System.out.println("level");
        String level = (scanner.nextLine());
        System.out.println("position");
        String position = scanner.nextLine();
        System.out.println("salary");
        double salary = Double.parseDouble(scanner.nextLine());




        Employee employee= new Employee(id, name, birth, gender, passport, phone, email, level, position,salary);

        list.add(employee);


    }

    @Override
    public void editEmployee() {
        System.out.println("enter id want to edit");
        int id = Integer.parseInt(scanner.nextLine());
        {
            for (Employee arr : list) {
                if (arr.getId() == id) {
                    System.out.println("id");
                    arr.setId(Integer.parseInt(scanner.nextLine()));
                    System.out.println("name");
                    arr.setName(scanner.nextLine());
                    System.out.println("date of birth ");
                    arr.setDateOfBirth(scanner.nextLine());
                    System.out.println("gender");
                    arr.setGender(scanner.nextLine());
                    System.out.println("Passport");
                    arr.setPassport(Integer.parseInt(scanner.nextLine()));
                    System.out.println("phone number");
                    arr.setPhoneNumber(Integer.parseInt(scanner.nextLine()));
                    System.out.println("email");
                    arr.setEmail(scanner.nextLine());
                    System.out.println("level");
                    arr.setLevel(scanner.nextLine());
                    System.out.println("position");
                    arr.setPosition(scanner.nextLine());
                    System.out.println("salary");
                    arr.setSalary(Double.parseDouble(scanner.nextLine()));
                }

            }


        }


    }


    @Override
    public void removeEmployee() {
        System.out.println("enter id deleter");
        int id = Integer.parseInt(scanner.nextLine());
        Employee temp = new Employee();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.remove(i);
            }
        }


    }


}
