package _19_string_regex.exercise.validate_phone_number;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidatePhoneNumber {
    public ValidatePhoneNumber() {
    }


    private static final String PHONE_NUMBER_REGEX = "^(84)(-)(0)[0-9]{9}$";
    public static boolean validate(String regex){
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
