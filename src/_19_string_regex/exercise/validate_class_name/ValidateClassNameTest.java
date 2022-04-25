package _19_string_regex.exercise.validate_class_name;

public class ValidateClassNameTest {
    public static void main(String[] args) {
        String[] arr = {"C0318G", "M0318G"};
        for (String temp : arr) {
            boolean isValidate = ValidateClassName.validate(temp);
            System.out.println("Class name " + temp + " is validate :" + isValidate);
        }
    }
}
