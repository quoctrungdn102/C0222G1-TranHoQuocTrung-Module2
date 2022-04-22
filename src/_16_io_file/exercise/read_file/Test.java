package _16_io_file.exercise.read_file;

import c_r_u_d.add_ex.Student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        List<Country> list1 = new ArrayList<>();
        ReadAndWrite.writeFile();
        List<String[]> list = ReadAndWrite.readFile("_16_io_file\\exercise\\read_file\\list_country.csv");
        Country country;
        for (String[] temp : list) {
            country = new Country((Integer.parseInt(temp[0])), temp[1], temp[2]);
            list1.add(country);
        }
        for (Country arr : list1) {
            System.out.println(arr);
        }


    }
}
