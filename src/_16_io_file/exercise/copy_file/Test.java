package _16_io_file.exercise.copy_file;

import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap link file nguồn");
        String link = CopyFileText.checkFile(scanner.nextLine());
        CopyFileText.copyFile(link);
            }
        }



