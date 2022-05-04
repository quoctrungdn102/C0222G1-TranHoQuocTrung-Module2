package case_study.controllers;

import case_study.models.Contract;
import case_study.models_house.Facility;
import case_study.services.class_sevices.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FuramaController {
    static Scanner scanner = new Scanner(System.in);
    public static FacilityServiceImpl facilityService = new FacilityServiceImpl();

    public static void main(String[] args) {
        displayMainMenu();
    }

    static int chose = -1;

    public static void displayMainMenu() {


        while (true) {

            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management ");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6.Exit");
            System.out.println(" your chose");
            try {
                chose = Integer.parseInt(scanner.nextLine());
                if (chose > 6 || chose < 1) {
                    System.err.println("vui lòng nhập đúng menu");
                }
            } catch (NumberFormatException e) {
                System.err.println(" nhập lại sai định dạng");
            }


            switch (chose) {
                case 1:
                    employeeManagement();
                    break;
                case 2:
                    customerManagement();
                    break;
                case 3:
                    facilityManagement();
                    break;
                case 4:
                    bookingManagement();
                    break;
                case 6:
                    System.exit(0);
            }
        }


    }

    public static void employeeManagement() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();

        while (true) {
            System.out.println("1\tDisplay list employees");
            System.out.println("2\tAdd new employee");
            System.out.println("3\tEdit employee");
            System.out.println("4\tReturn main menu");
            try {
                chose = Integer.parseInt(scanner.nextLine());
                if (chose > 4 || chose < 1) {
                    System.err.println("vui lòng nhập đúng menu");
                }
            } catch (NumberFormatException e) {
                System.err.println(" nhập lại sai định dạng");
            }


            switch (chose) {
                case 1:
                    employeeService.displayEmployee();
                    break;
                case 2:
                    employeeService.addEmployee();
                    break;
                case 3:
                    employeeService.editEmployee();
                    break;
                case 4:
                    displayMainMenu();
                    break;
            }
        }

    }

    public static void customerManagement() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();

        while (true) {
            System.out.println("1.\tDisplay list customers");
            System.out.println("2.\tAdd new customer");
            System.out.println("3.\tEdit customer");
            System.out.println("4\tReturn main menu");
            try {
                chose = Integer.parseInt(scanner.nextLine());
                if (chose > 4 || chose < 1) {
                    System.err.println("vui lòng nhập đúng menu");
                }
            } catch (NumberFormatException e) {
                System.err.println(" nhập lại sai định dạng");
            }
            switch (chose) {
                case 1:
                    customerService.displayCustomer();
                    break;
                case 2:
                    customerService.addCustomer();
                    break;
                case 3:
                    customerService.editCustomer();
                    break;
                case 4:
                    displayMainMenu();
                    break;
            }
        }
    }

    public static void facilityManagement() {


        while (true) {
            System.out.println("1.\tDisplay list facility");
            System.out.println("2.\tAdd new facility");
            System.out.println("3.List maintenance");
            System.out.println("4\tReturn main menu");
            try {
                chose = Integer.parseInt(scanner.nextLine());
                if (chose > 4 || chose < 1) {
                    System.err.println("vui lòng nhập đúng menu");
                }
            } catch (NumberFormatException e) {
                System.err.println(" nhập lại sai định dạng");
            }
            switch (chose) {
                case 1:
                    facilityService.displayFacility();
                    break;
                case 2:
                    addNewFacility();
                    break;
                case 3:
                    facilityService.maintenanceList();
                    break;
                case 4:
                    displayMainMenu();
                    break;
            }
        }
    }

    public static void addNewFacility() {

        while (true) {
            System.out.println("1.vila");
            System.out.println("2.room");
            System.out.println("3.house");
            System.out.println("4\tReturn main menu");
            try {
                chose = Integer.parseInt(scanner.nextLine());
                if (chose > 4 || chose < 1) {
                    System.err.println("vui lòng nhập đúng menu");
                }
            } catch (NumberFormatException e) {
                System.err.println(" nhập lại sai định dạng");
            }
            switch (chose) {
                case 1:
                    facilityService.adđNewVila();
                    break;
                case 2:
                    facilityService.adđNewRoom();
                    break;
                case 3:
                    facilityService.adđNewHouse();
                    break;
                case 4:
                    facilityManagement();
                    break;

            }

        }

    }
   public static BookingServiceImpl bookingService= new BookingServiceImpl();
    public static ContractServicelmpl contractServicelmpl = new ContractServicelmpl();
    public static void bookingManagement() {
        while (true) {
            System.out.println("1.\tAdd new booking");
            System.out.println("2.\tDisplay list booking");
            System.out.println("3.\tCreate new constracts");
            System.out.println("4.\tDisplay list contracts");
            System.out.println("5.\tEdit contracts");
            System.out.println("6.\tReturn main menu");

            try {
                chose = Integer.parseInt(scanner.nextLine());
                if (chose > 6 || chose < 1) {
                    System.err.println("vui lòng nhập đúng menu");
                }
            } catch (NumberFormatException e) {
                System.err.println(" nhập lại sai định dạng");
            }
            switch (chose) {
                case 1:
//                    bookingService = new BookingServiceImpl();
                    bookingService.addNewBooking();
                    break;

                case 2:
                    bookingService.displayBooking();
                    break;
                case 3:
                    ContractServicelmpl.createNewConstracts();
                    break;
                case 4:
                    ContractServicelmpl.displayListContracts();
                    break;
                case 6:
                    displayMainMenu();
                    break;
            }
        }
    }

    public static void PromotionManagement() {
        while (true) {
            System.out.println("1.\tDisplay list customers use service");
            System.out.println("2.\tDisplay list customers get voucher");
            System.out.println("3\tReturn main menu");
            try {
                chose = Integer.parseInt(scanner.nextLine());
                if (chose > 3 || chose < 1) {
                    System.err.println("vui lòng nhập đúng menu");
                }
            } catch (NumberFormatException e) {
                System.err.println(" nhập lại sai định dạng");
            }
            switch (chose) {
                case 1:
                case 2:
                case 3:
                    displayMainMenu();
                    break;
            }
        }
    }

}
