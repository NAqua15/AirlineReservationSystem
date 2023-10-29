public class EconomyTicket implements Ticket {
    private String seatNumber;

    public EconomyTicket(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public void printTicket() {
        System.out.println("Economy Class Ticket: Seat " + seatNumber);
    }
}
