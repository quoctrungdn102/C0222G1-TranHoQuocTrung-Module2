package case_study.models_house;

public class House extends Facility {
    private String roomStandard;
    private int floor;

    public House(String id,
                 String nameService,
                 double area,
                 double price,
                 int peopleMax, String rentalType, String roomStandard, int floor) {
        super(id, nameService, area, price, peopleMax, rentalType);
        this.roomStandard = roomStandard;
        this.floor = floor;
    }

    public House() {

    }

    public House(String roomStandard, int floor) {
        this.roomStandard = roomStandard;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" +super.toString()+
                "roomStandard='" + roomStandard + '\'' +
                ", floor=" + floor +
                '}';
    }

    @Override
    public String getValue() {
        return "house"+","+ super.getValue()+","+this.getRoomStandard()+","+this.getFloor();
    }
}
