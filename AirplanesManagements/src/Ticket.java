import java.time.LocalDate;

public class Ticket {

    private Airplane airplane;
    private Long cost;
    private LocalDate dateOfFlight;
    private TicketType ticketType;
    private Integer capacity;
    private AirplaneClass airplaneClass;

    public Ticket(Airplane airplane,
                  Long cost,
                  LocalDate dateOfFlight,
                  TicketType ticketType,
                  Integer capacity,
                  AirplaneClass airplaneClass) {
        this.airplane = airplane;
        this.cost = cost;
        this.dateOfFlight = dateOfFlight;
        this.ticketType = ticketType;
        this.capacity = capacity;
        this.airplaneClass = airplaneClass;
    }

    public Ticket() {
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public LocalDate getDateOfFlight() {
        return dateOfFlight;
    }

    public void setDateOfFlight(LocalDate dateOfFlight) {
        this.dateOfFlight = dateOfFlight;
    }

    public TicketType getTicketType() {
        return ticketType;
    }

    public void setTicketType(TicketType ticketType) {
        this.ticketType = ticketType;
    }

    public AirplaneClass getAirplaneClass() {
        return airplaneClass;
    }

    public void setAirplaneClass(AirplaneClass airplaneClass) {
        this.airplaneClass = airplaneClass;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Long getFinalCost(AirplaneClass airplaneClass) {
        long finalCost = 0;

        switch (airplaneClass) {
            case FIRST:
                finalCost = (long) (1.3 * this.cost);
                break;
            case ECONOMY:
                finalCost = (long) (1.1 * this.cost);
                break;
            case BUSINESS:
                finalCost = (long) (1.2 * this.cost);
                break;
            default:
                break;
        }

        return finalCost;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "airplane=" + airplane +
                ", cost=" + cost +
                ", dateOfFlight=" + dateOfFlight +
                ", ticketType=" + ticketType +
                ", capacity=" + capacity +
                ", airplaneClass=" + airplaneClass +
                '}';
    }
}
