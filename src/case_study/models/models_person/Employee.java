package case_study.models.models_person;

import case_study.models.models_person.Person;

public class Employee extends Person implements Comparable<Employee> {
    private String level;
    private String position;
    private double salary;

    public Employee() {
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int id,
                    String name,
                    String dateOfBirth,
                    String gender,
                    int passport,
                    int phoneNumber,
                    String email,
                    String level,
                    String position,
                    double salary) {
        super(id, name, dateOfBirth, gender, passport, phoneNumber, email);
        this.level = level;
        this.position = position;
        this.salary = salary;

    }

    @Override
    public String toString() {
        return "Employee{" + super.toString()+
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        if (this.getId() > o.getId()) {
            return 1;
        } else if (this.getId() < o.getId()) {
            return -1;
        } else {
            return 0;
        }
    }
}
