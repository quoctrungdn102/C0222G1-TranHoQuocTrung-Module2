package _16_io_file.exercise.read_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<String[]> readFile(String path) throws IOException {
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String[]> list = new ArrayList<>();
        String line = "";
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null && line != "") {
                String[] str = line.split(",");
                list.add(str);
            }
            return list;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
            fileReader.close();

        }
        return null;


    }

    public static void writeFile() throws IOException {
        FileWriter fileWriter = null;
        BufferedWriter bufferedReader = null;
        List<Country> list = new ArrayList<>();
        list.add(new Country(1, "au", "australia"));
        list.add(new Country(2, "cn", "china"));
        list.add(new Country(3, "jp", "japan"));
        list.add(new Country(4, "au", "australia"));
        try {
            fileWriter = new FileWriter("_16_io_file\\exercise\\read_file\\list_country.csv", true);
            bufferedReader = new BufferedWriter(fileWriter);
            for (Country arr : list) {
                bufferedReader.write(arr.toString());
                bufferedReader.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
            fileWriter.close();
        }

    }
}
