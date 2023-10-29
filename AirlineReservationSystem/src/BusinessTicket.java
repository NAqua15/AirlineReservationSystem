public class BusinessTicket implements Ticket {
    private String seatNumber;

    public BusinessTicket(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public void printTicket() {
        System.out.println("Business Class Ticket: Seat " + seatNumber);
    }
}
