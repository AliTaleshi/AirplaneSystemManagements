import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SystemChecks {

    private static SystemChecks instance = new SystemChecks();

    public static SystemChecks getInstance() {
        return instance;
    }

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

    public boolean isAirplaneIDValid(DataBase dataBase, String airplaneID) {
        for (int i = 0; i < dataBase.getAirplanes().size(); i++) {
            if (dataBase.getAirplanes().get(i).getID().equals(airplaneID)) {
                return false;
            }
        }

        return true;
    }

    public boolean isSrcCityNameValid(DataBase dataBase, String srcCityName) {
        for (int i = 0; i < dataBase.getTickets().size(); i++) {
            if (dataBase.getTickets().get(i).getSrcCityName().equals(srcCityName)) {
                return false;
            }
        }

        return true;
    }

    public boolean isDestCityNameValid(DataBase dataBase, String destCityName) {
        for (int i = 0; i < dataBase.getTickets().size(); i++) {
            if (dataBase.getTickets().get(i).getDestCityName().equals(destCityName)) {
                return false;
            }
        }

        return true;
    }
}
