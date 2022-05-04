package case_study.models_house;

public class Villa extends Facility{
   private String roomStandard;
   private double areaPool;
   private int floor;

    public Villa(String id,
                 String nameService,
                 double area,
                 double price,
                 int peopleMax,
                 String rentalType,
                 String roomStandard,
                 double areaPool,
                 int floor) {
        super(id, nameService, area, price, peopleMax, rentalType);
        this.roomStandard = roomStandard;
        this.areaPool = areaPool;
        this.floor = floor;
    }

    public Villa() {

    }

    public Villa(String roomStandard, double areaPool, int floor) {
        this.roomStandard = roomStandard;
        this.areaPool = areaPool;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString()+
                ",roomStandard =" + roomStandard+
                ", areaPool=" + areaPool +
                ", floor = " + floor +
                '}';
    }

    @Override
    public String getValue() {
        return "vila"+","+super.getValue()+","+this.getRoomStandard()+","+this.getAreaPool()+","+this.getFloor();
    }

//    public String value(){
//        return this.getId()+","+this.getNameService()+","+this.getArea()+","+
//                this.getPrice()+","+this.getPeopleMax()+","+this.getRentalType()+","+
//                this.getRoomStandard()+","+this.getAreaPool()+","+this.getFloor();
//    }
}
