package case_study.models_house;

public class Room extends Facility {
private String serviceFree;

    public Room() {

    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    public Room(String id, String nameService, double area, double price, int peopleMax, String rentalType, String serviceFree) {
        super(id, nameService, area, price, peopleMax, rentalType);
        this.serviceFree = serviceFree;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString()+
                "serviceFree='" + serviceFree + '\'' +
                '}';
    }

    @Override
    public String getValue() {
        return "room"+","+ super.getValue()+","+this.getServiceFree();
    }

}
