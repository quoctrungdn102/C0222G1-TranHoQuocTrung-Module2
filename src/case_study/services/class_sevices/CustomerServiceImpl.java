package case_study.services.class_sevices;

import case_study.models.models_person.Customer;
import case_study.services.interface_services.CustomerService;
import case_study.until.RegexData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService  {
    public static final String REGEX_AGE ="^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";

    Scanner scanner = new Scanner(System.in);
    List<Customer> list = new ArrayList<>();

    @Override
    public void displayCustomer() {
        for (Customer arr : list) {
            System.out.println(arr);
        }

    }

    @Override
    public void addCustomer() {
        System.out.println("id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("name");
        String name = scanner.nextLine();
        System.out.println("date of birth ");
        String birth = RegexData.regexAge(REGEX_AGE,scanner.nextLine());
        System.out.println("gender");
        String gender = scanner.nextLine();
        System.out.println("Passport");
        int passport = Integer.parseInt(scanner.nextLine());
        System.out.println("phone number");
        int phone = Integer.parseInt(scanner.nextLine());
        System.out.println("email");
        String email = (scanner.nextLine());
        System.out.println("Type customer");
        String type = (scanner.nextLine());
        System.out.println("address");
        String address = scanner.nextLine();


        Customer customer = new Customer(id, name, birth, gender, passport, phone, email, type, address);

        list.add(customer);
    }

    @Override
    public void editCustomer() {
        System.out.println("enter id want to edit");
        int id = Integer.parseInt(scanner.nextLine());
        {
            for (Customer arr : list) {
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
                    System.out.println("Type customer");
                    arr.setCustomerType(scanner.nextLine());
                    System.out.println("address");
                    arr.setAddress(scanner.nextLine());
                }
            }
        }


    }

    @Override
    public void removeCustomer() {

    }
}
