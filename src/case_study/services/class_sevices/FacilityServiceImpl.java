package case_study.services.class_sevices;

import case_study.models_house.Facility;
import case_study.models_house.House;
import case_study.models_house.Room;
import case_study.models_house.Villa;
import case_study.services.interface_services.FacilityService;
import case_study.until.RegexData;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

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







    Map<Facility, Integer> map = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayFacility() {
        for (Map.Entry<Facility, Integer> temp : map.entrySet() ) {
            System.out.println("service"+temp.getKey()+"so lan thue"+temp.getValue());
        }
    }

    @Override
    public void adđNewVila() {
        System.out.println("nhap id vila");
        String id = RegexData.regexData(REGEX_ID_VILA,scanner.nextLine(),"bạn đã nhập id sai- id:SVVL-XXXX(number) ");
        System.out.println("name service ");
        String name = RegexData.regexData(REGEX_NAME_SERVICE,scanner.nextLine(),"viết hoa chữ cái đầu ");
        System.out.println("nhap area");
        double area = Double.parseDouble( RegexData.regexData(REGEX_AREA,scanner.nextLine(),"Area is num &&> 30 "));
        System.out.println("nhap gia thue ");
        double price = Double.parseDouble(RegexData.regexData(REGEX_PRICE,scanner.nextLine(),"price ís num &&>0"));
        System.out.println("nhap so nguoi thue");
        int people = Integer.parseInt(RegexData.regexData(REGEX_PEOPLE,scanner.nextLine(),"0< is num <20"));
        System.out.println("kiểu thuê  ");
        String rental = RegexData.regexData(REGEX_NAME_SERVICE,scanner.nextLine(),"viết hoa chữ cái đầu ");
        System.out.println("kiểu phong can thue");
        String room = RegexData.regexData(REGEX_NAME_SERVICE,scanner.nextLine(),"viết hoa chữ cái đầu ");
        System.out.println(" area pool  ");
        double areaPool =  Double.parseDouble( RegexData.regexData(REGEX_AREA,scanner.nextLine(),"Area pool is number > 30"));
        System.out.println("nhap so so tang ");
        int floor = Integer.parseInt(RegexData.regexData(REGEX_FLOOR,scanner.nextLine(),"0 < floor is num < 99"));

        Facility villa = new Villa(id, name, area, price, people, rental,room ,areaPool, floor);
        map.put(villa, 0);
    }

    @Override
    public void adđNewRoom() {
        System.out.println("nhap id room");
        String id = RegexData.regexData(REGEX_ID_ROOM,scanner.nextLine(),"bạn đã nhập id sai- id:SVRO-XXXX(number) ");
        System.out.println("name service ");
        String name = RegexData.regexData(REGEX_NAME_SERVICE,scanner.nextLine(),"viết hoa chữ cái đầu ");
        System.out.println("nhap area");
        double area = Double.parseDouble( RegexData.regexData(REGEX_AREA,scanner.nextLine(),"Area is num > 30"));
        System.out.println("nhap gia thue ");
        double price = Double.parseDouble(RegexData.regexData(REGEX_PRICE,scanner.nextLine(),"is num >0"));
        System.out.println("nhap so nguoi thue");
        int people = Integer.parseInt(RegexData.regexData(REGEX_PEOPLE,scanner.nextLine(),"0< is num <20"));
        System.out.println("kiểu thuê  ");
        String rental = RegexData.regexData(REGEX_NAME_SERVICE,scanner.nextLine(),"viết hoa chữ cái đầu ");
        System.out.println("service free");
        String service = (scanner.nextLine());


        Facility room = new Room(id, name, area, price, people, rental,service);
        map.put(room, 0);

    }

    @Override
    public void adđNewHouse() {
        System.out.println("nhap id house");
        String id = RegexData.regexData(REGEX_ID_HOUSE,scanner.nextLine(),"bạn đã nhập id sai- id:SVHO-XXXX(number) ");
        System.out.println("name service ");
        String name = RegexData.regexData(REGEX_NAME_SERVICE,scanner.nextLine(),"viết hoa chữ cái đầu ");
        System.out.println("nhap area");
        double area = Double.parseDouble( RegexData.regexData(REGEX_AREA,scanner.nextLine(),"Area is num > 30"));
        System.out.println("nhap gia thue ");
        double price = Double.parseDouble(RegexData.regexData(REGEX_PRICE,scanner.nextLine(),"is num >0"));
        System.out.println("nhap so nguoi thue");
        int people = Integer.parseInt(RegexData.regexData(REGEX_PEOPLE,scanner.nextLine(),"0< is num <20"));
        System.out.println("kiểu thuê  ");
        String rental = RegexData.regexData(REGEX_NAME_SERVICE,scanner.nextLine(),"viết hoa chữ cái đầu ");
        System.out.println("kiểu phong can thue");
        String room = RegexData.regexData(REGEX_NAME_SERVICE,scanner.nextLine(),"viết hoa chữ cái đầu ");
        System.out.println("nhap so so tang ");
        int floor = Integer.parseInt(RegexData.regexData(REGEX_FLOOR,scanner.nextLine(),"0 < floor is num < 99"));

        Facility house = new House(id, name, area, price, people, rental,room,floor);
        map.put(house, 0);

    }

    @Override
    public void maintenanceList() {


    }


}

