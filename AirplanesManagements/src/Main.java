public class Main {

    public static void defineNewUser(DataBase dataBase) {
        SystemChecks systemChecks = new SystemChecks();
        System.out.println("Define a new user:");
        User newUser = new User();
        System.out.println("Enter your username:");
        while (!systemChecks.isUserNameValid(ScannerWrapper.getInstance().next().trim())) {
            System.out.println("Username is not valid");
            System.out.println("Please try again");
        }
        System.out.println("Enter your password:");
        while (!systemChecks.isPassWordValid(ScannerWrapper.getInstance().next())) {
            System.out.println("Password is not valid");
            System.out.println("Please try again");
        }
        System.out.println("Enter your email:");
        while (!systemChecks.isEmailValid(ScannerWrapper.getInstance().next())) {
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
        System.out.println("");
        ticket.
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
