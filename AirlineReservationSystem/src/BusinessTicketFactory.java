public class BusinessTicketFactory implements TicketFactory {
    @Override
    public Ticket createTicket(String seatNumber) {
        return new BusinessTicket(seatNumber);
    }
}
