package case_study.models;

import case_study.models.models_person.Customer;
import case_study.models_house.Facility;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Booking implements Comparable<Booking> {
    private int idBooking;
    private String starDay;
    private String endDay;
    private Customer customerS;
    private Facility facility;

    public Booking() {
    }

    public Booking(int idBooking,
                   String starDay,
                   String endDay,
                   Customer customerS,
                   Facility facility) {
        this.idBooking = idBooking;
        this.starDay = starDay;
        this.endDay = endDay;
        this.customerS = customerS;
        this.facility = facility;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getStarDay() {
        return starDay;
    }

    public void setStarDay(String starDay) {
        this.starDay = starDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public Customer getCustomerS() {
        return customerS;
    }

    public void setCustomerS(Customer customerS) {
        this.customerS = customerS;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking=" + idBooking +
                ", starDay='" + starDay + '\'' +
                ", endDay='" + endDay + "\n"
                + customerS.toString() + "\n" + facility.toString() +
                '}';
    }

    @Override
    public int compareTo(Booking o) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate1 = LocalDate.parse(this.getStarDay(),formatter);
        LocalDate localDate2 = LocalDate.parse(this.getEndDay(),formatter);
        LocalDate localDate3 = LocalDate.parse(o.getStarDay(),formatter);
        LocalDate localDate4 = LocalDate.parse(o.getEndDay(),formatter);

        if (localDate1.compareTo(localDate3) > 0) {
            ;
            return 1;
        } else if (localDate1.compareTo(localDate3) < 0) {
            return -1;
        } else {
            if (localDate2.compareTo(localDate4) > 0) {
                ;
                return 1;
            } else if (localDate2.compareTo(localDate4) < 0) {
                return -1;

            }
            return 0;
        }
    }
}
