public class Airplane {

    private String ID;
    private Integer capacity;
    private Ticket ticket;

    public Airplane(String ID,
                    Integer capacity,
                    Ticket ticket) {
        this.ID = ID;
        this.capacity = capacity;
        this.ticket = ticket;
    }

    public Airplane() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "ID='" + ID + '\'' +
                ", capacity=" + capacity +
                ", ticket=" + ticket +
                '}';
    }
}
