package _16_io_file.exercise.copy_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFileText {
    public static String checkFile(String fileText) throws IOException {
        try {
            File file = new File(fileText);
            if (!file.exists()) {
                throw new FileNotFoundException();
            } else {
                return fileText;
            }
        } catch (FileNotFoundException e) {
            System.out.println("link ko co");
        }
        return null;

    }

    public static void copyFile(String fileText) throws IOException {
        File file = new File(fileText);
        FileReader fileReader ;
        BufferedReader bufferedReader;

        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            fileWriter = new FileWriter("_16_io_file\\exercise\\copy_file.txt", true);
            bufferedWriter = new BufferedWriter(fileWriter);

            String line;
            while ((line = bufferedReader.readLine()) != null && line != "") {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            bufferedWriter.close();
            fileWriter.close();
        }


    }
}



