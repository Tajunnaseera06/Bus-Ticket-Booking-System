import java.util.List;

public class Ticket {

    private int id;
    private List<Integer> bookedSeats;
    private Bus bus;
    private int numberOfTickets;
    private double fare;
    private int customerId;

    public Ticket(int id,
                  List<Integer> bookedSeats,
                  Bus bus,
                  int numberOfTickets,
                  double fare,
                  int customerId) {
    }

    public void addBookedSeat(int seatNumber) {}

    public int getId() {}

    public List<Integer> getBookedSeats() {}

    public Bus getBus() {}

    public int getNumberOfTickets() {}

    public double getFare() {}

    public int getCustomerId() {}

    @Override
    public String toString() {}

}