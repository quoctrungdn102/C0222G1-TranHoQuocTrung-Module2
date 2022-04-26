package case_study.models_house;

public abstract class  Facility {
    private String id;
    private String nameService;
    private double area;
    private double price;
    private int peopleMax;
    private String rentalType;

    public Facility() {
    }

    public Facility(String id,
                    String nameService,
                    double area,
                    double price,
                    int peopleMax,
                    String rentalType) {
        this.id = id;
        this.nameService = nameService;
        this.area = area;
        this.price = price;
        this.peopleMax = peopleMax;
        this.rentalType = rentalType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPeopleMax() {
        return peopleMax;
    }

    public void setPeopleMax(int peopleMax) {
        this.peopleMax = peopleMax;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", nameService='" + nameService + '\'' +
                ", area='" + area + '\'' +
                ", price=" + price +
                ", peopleMax=" + peopleMax +
                ", rentalType='" + rentalType + '\''
                ;
    }
}

