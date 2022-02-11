import java.util.List;
import java.util.Objects;

public class User {

    private String username;
    private String password;
    private String email;
    private List<Ticket> tickets;
    private Long walletCredit;
    private boolean isLoggedIn;

    public User(String userName,
                String password,
                String email,
                List<Ticket> tickets,
                Long walletCredit,
                boolean isLoggedIn) {
        this.username = userName;
        this.password = password;
        this.email = email;
        this.tickets = tickets;
        this.walletCredit = walletCredit;
        this.isLoggedIn = isLoggedIn;
    }

    public User() {
    }

    public User(String userName,
                String password,
                String email,
                List<Ticket> tickets,
                Long walletCredit) {
        this.username = userName;
        this.password = password;
        this.email = email;
        this.tickets = tickets;
        this.walletCredit = walletCredit;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Long getWalletCredit() {
        return walletCredit;
    }

    public void setWalletCredit(Long walletCredit) {
        this.walletCredit = walletCredit;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return isLoggedIn == user.isLoggedIn && Objects.equals(username, user.username) && Objects.equals(password, user.password) && Objects.equals(email, user.email) && Objects.equals(tickets, user.tickets) && Objects.equals(walletCredit, user.walletCredit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, email, tickets, walletCredit, isLoggedIn);
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", tickets=" + tickets +
                ", walletCredit=" + walletCredit +
                ", isLoggedIn=" + isLoggedIn +
                '}';
    }
}
