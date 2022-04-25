package _19_string_regex.exercise.validate_phone_number;

import _19_string_regex.exercise.validate_class_name.ValidateClassName;

public class ValidatePhoneNumberTest {
    public static void main(String[] args) {
        String[] arr = {"84-0789456789", "84-8412254586"};
        for (String temp : arr) {
            boolean isValidate = ValidatePhoneNumber.validate(temp);
            System.out.println("Phone number " + temp + " is validate :" + isValidate);
        }
    }
}

