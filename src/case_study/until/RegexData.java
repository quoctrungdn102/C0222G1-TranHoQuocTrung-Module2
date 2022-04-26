package case_study.until;

import java.text.Format;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexData {
    static Scanner scanner = new Scanner(System.in);

    public static String regexData(String regex, String temp, String error) {

        boolean check = true;
        do {
            if (temp.matches(regex)) {
                check = false;
            } else {
                System.out.println(error);
                temp = scanner.nextLine();
            }
        } while (check);
        return temp;
    }

    public static String regexAge(String regex, String temp) {
        while (true) {
            try {
                if (temp.matches(regex)) {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate localDate = LocalDate.parse(temp, formatter);
                    int age = LocalDate.now().getYear() - localDate.getYear();
                    if (age > 18 && age < 100) {
                        return temp;
                    } else {
                        throw new Exception("18< age <100");
                    }
                } else {
                    throw new Exception("sai dinh dang dd/MM/yyyy");
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
                temp = scanner.nextLine();
            }
        }
    }
}
