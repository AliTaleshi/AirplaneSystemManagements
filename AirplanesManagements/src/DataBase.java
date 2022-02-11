import java.util.List;

public class DataBase implements LogIn{

    private List<User> users;
    private List<Ticket> tickets;
    private List<Airplane> airplanes;

    public DataBase(List<User> users,
                    List<Ticket> tickets) {
        this.users = users;
        this.tickets = tickets;
    }

    public DataBase() {
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public List<Airplane> getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(List<Airplane> airplanes) {
        this.airplanes = airplanes;
    }

    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public boolean isLoggedIn(String username, String password) {

        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                user.setLoggedIn(true);
                System.out.println("Logged in");
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return "DataBase{" +
                "users=" + users +
                ", tickets=" + tickets +
                ", airplanes=" + airplanes +
                '}';
    }
}
