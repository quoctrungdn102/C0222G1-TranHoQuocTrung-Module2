package _16_io_file.exercise.read_file;

import _07_abstract_interface.exercise.resizeable.Resizeable;

public class Country  {
    private int id;
    private String code;
    private String name;

    public Country() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return +id + "," +
                code + "," +
                name
                ;
    }
}
