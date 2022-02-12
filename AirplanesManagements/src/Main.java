import java.time.LocalDate;

public class Main {

    public static void defineNewUser(DataBase dataBase) {
        System.out.println("Define a new user:");
        User newUser = new User();
        System.out.println("Enter your username:");
        while (!SystemChecks.getInstance().isUserNameValid(
                ScannerWrapper.getInstance().next().trim())) {
            System.out.println("Username is not valid");
            System.out.println("Please try again");
        }
        System.out.println("Enter your password:");
        while (!SystemChecks.getInstance().isPassWordValid(
                ScannerWrapper.getInstance().next())) {
            System.out.println("Password is not valid");
            System.out.println("Please try again");
        }
        System.out.println("Enter your email:");
        while (!SystemChecks.getInstance().isEmailValid(
                ScannerWrapper.getInstance().next())) {
            System.out.println("Email is not valid");
            System.out.println("Please try again");
        }

        dataBase.addUser(newUser);
    }

    public static void userLogIn(DataBase dataBase) {
        System.out.println("Enter your username:");
        String username = ScannerWrapper.getInstance().next();
        System.out.println("Enter your password:");
        String password = ScannerWrapper.getInstance().next();
        while (!dataBase.isLoggedIn(username, password)) {
            System.out.println("User not found\n" + "Please try again");
            System.out.println("Enter your username:");
            username = ScannerWrapper.getInstance().next();
            System.out.println("Enter your password:");
            password = ScannerWrapper.getInstance().next();
        }
    }

    public static void defineNewTicket(DataBase dataBase) {
        Ticket ticket = new Ticket();

        if (ticket.getCapacity() == 0) {
            return;
        }

        System.out.println("Enter the ID of the airplane:");
        String airplaneID = ScannerWrapper.getInstance().next();
        while (!SystemChecks.getInstance().isAirplaneIDValid(dataBase,
                airplaneID)) {
            System.out.println("Airplane ID exists\n" +
                    "Please try again");
            System.out.println("Enter the airplane ID again:");
        }
        ticket.getAirplane().setID(airplaneID);

        System.out.println("Which type Airplane class do you prefer?\n" +
                "1.Economy\n" + "2.Business\n" + "3.First\n" + "Enter the number:");
        switch (ScannerWrapper.getInstance().nextInt()) {
            case (1):
                ticket.setAirplaneClass(AirplaneClass.ECONOMY);
                break;
            case (2):
                ticket.setAirplaneClass(AirplaneClass.BUSINESS);
                break;
            case (3):
                ticket.setAirplaneClass(AirplaneClass.FIRST);
                break;
            default:
                break;
        }

        System.out.println("Enter the date of flight:\n" + "YYYY-MM-dd");
        ticket.setDateOfFlight(LocalDate.parse(ScannerWrapper.getInstance().next()));


        System.out.println("Enter the name of the source city:");
        String srcCityName = ScannerWrapper.getInstance().next();
        while (!SystemChecks.getInstance().isSrcCityNameValid(dataBase,
                srcCityName)) {
            System.out.println("Source city name exists\n" + "Please try again");
            System.out.println("Enter the name of the source city:");
        }
        ticket.setSrcCityName(srcCityName);

        System.out.println("Enter the name of the destination city:");
        String destCityName = ScannerWrapper.getInstance().next();
        while (!SystemChecks.getInstance().isDestCityNameValid(dataBase,
                destCityName)) {
            System.out.println("Destination city name exists\n" + "Please try again");
            System.out.println("Enter the name of the destination city:");
        }
        ticket.setDestCityName(destCityName);

    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
