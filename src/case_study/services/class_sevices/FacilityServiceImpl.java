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


    List<String[]> listArrString;
    Map<Facility, Integer> map = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    List<String> listString = new ArrayList<>();
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    Villa villa;
    House house;
    Room room;

    int value;

    @Override
    public void displayFacility() {
        map = returnMap();
        for (Map.Entry<Facility, Integer> temp : map.entrySet()) {
            System.out.println(temp.getKey().toString() + "so lan thue" + temp.getValue());
        }
    }

    public  Map<Facility,Integer> returnMap() {
        listArrString = new ArrayList<>();
        listArrString = readAndWriteFile.readFile("case_study\\file\\facility.csv");
        for (String[] arr : listArrString) {
            if (arr[0].equals("vila")) {
                villa = new Villa(arr[1], arr[2], Double.parseDouble(arr[3]), Double.parseDouble(arr[4]),
                        Integer.parseInt(arr[5]), arr[6], arr[7], Double.parseDouble(arr[8]), Integer.parseInt(arr[9]));
                map.put(villa, value = Integer.parseInt(arr[10]));
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

    public void readFileVila() {
        returnMapVila();
        for (Map.Entry<Facility, Integer> temp : map.entrySet()) {
            System.out.println(temp.getKey().toString() + "so lan thue" + temp.getValue());
        }
    }

    public Map<Facility, Integer> returnMapVila() {
        map = new HashMap<>();
        listArrString = new ArrayList<>();
        listArrString = readAndWriteFile.readFile("case_study\\file\\vila.csv");
        for (String[] arr : listArrString) {
            villa = new Villa(arr[1], arr[2], Double.parseDouble(arr[3]), Double.parseDouble(arr[4]),
                    Integer.parseInt(arr[5]), arr[6], arr[7], Double.parseDouble(arr[8]), Integer.parseInt(arr[9]));
            map.put(villa, Integer.parseInt(arr[10]));
        }
        return map;
    }

    public void readFileRoom() {
        returnMapRoom();
        for (Map.Entry<Facility, Integer> temp : map.entrySet()) {
            System.out.println(temp.getKey().toString() + "so lan thue" + temp.getValue());
        }
    }

    public Map<Facility, Integer> returnMapRoom() {
        map = new HashMap<>();
        listArrString = new ArrayList<>();
        listArrString = readAndWriteFile.readFile("case_study\\file\\room.csv");
        for (String[] arr : listArrString) {
            room = new Room(arr[1], arr[2], Double.parseDouble(arr[3]), Double.parseDouble(arr[4]),
                    Integer.parseInt(arr[5]), arr[6], arr[7]);
            map.put(room, Integer.parseInt(arr[8]));
        }
        return map;
    }

    public void readFileHouse() {
        returnMapHouse();
        for (Map.Entry<Facility, Integer> temp : map.entrySet()) {
            System.out.println(temp.getKey().toString() + "so lan thue" + temp.getValue());
        }
    }

    public Map<Facility, Integer> returnMapHouse() {
        map = new HashMap<>();
        listArrString = new ArrayList<>();
        listArrString = readAndWriteFile.readFile("case_study\\file\\house.csv");
        for (String[] arr : listArrString) {
            house = new House(arr[1], arr[2], Double.parseDouble(arr[3]), Double.parseDouble(arr[4]),
                    Integer.parseInt(arr[5]), arr[6], arr[7], Integer.parseInt(arr[8]));
            map.put(house, Integer.parseInt(arr[9]));
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

        int value = 0;
        listString.add("house" + "," + id + "," + name + "," + area + "," + price + "," + people + "," + rental + "," + room
                + "," + floor +
                "," + value);
        readAndWriteFile.writeFile("case_study\\file\\facility.csv", listString);
    }


    @Override
    public void maintenanceList() {


    }


}

