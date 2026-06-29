public class Bus {

    private int id;
    private String busType;
    private String seatType;
    private int totalSeats;
    private boolean[] seats;

    public Bus(int id,
               String busType,
               String seatType,
               int totalSeats) {
    }

    public int getId() {}

    public String getBusType() {}

    public String getSeatType() {}

    public int getTotalSeats() {}

    public int getAvailableSeats() {}

    public boolean bookSeat(int seatNumber) {}

    public boolean cancelSeat(int seatNumber) {}

    public void showAvailableSeats() {}

    @Override
    public String toString() {}

}