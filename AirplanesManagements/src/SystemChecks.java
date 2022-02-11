import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SystemChecks {

    public boolean isUserNameValid(String username) {

        String regex = "^[A-Za-z]\\w{5,29}$";

        Pattern pattern = Pattern.compile(regex);

        if (username == null) {
            return false;
        }

        Matcher matcher = pattern.matcher(username);

        return matcher.matches();
    }

    public boolean isPassWordValid(String password) {

        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";

        Pattern pattern = Pattern.compile(regex);

        if (password == null) {
            return false;
        }

        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }

    public boolean isEmailValid(String email) {

        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pattern = Pattern.compile(emailRegex);

        if (email == null) {
            return false;
        }

        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }
}
