package case_study.until;

import case_study.models.models_person.Customer;
import case_study.models.models_person.Person;
import case_study.models_house.Facility;

import java.io.*;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ReadAndWriteFile {
    public void writeFile(String path, List<String>  list) {
        try {
            FileWriter fileWriter = new FileWriter(path,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String arr: list) {
                bufferedWriter.write(arr);
                bufferedWriter.newLine();
            }

                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException ioException) {
            ioException.printStackTrace();
        }


        }


    public List<String[]> readFile(String path) {
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            List<String[]> list = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
           String[] str = line.split(",");
                list.add(str);
            }
            bufferedReader.close();
            fileReader.close();
            return list;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
//    public void writeFile1(String path, Map<Facility,Integer> list) {
//        try {
//            FileWriter fileWriter = new FileWriter(path,true);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            for (Map.Entry<Facility,Integer> arr : list.entrySet()) {
//                bufferedWriter.write(arr.toString());
//                bufferedWriter.newLine();
//            }
//            bufferedWriter.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        }


    }


