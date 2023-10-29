public class EconomyTicketFactory implements TicketFactory {
    @Override
    public Ticket createTicket(String seatNumber) {
        return new EconomyTicket(seatNumber);
    }
}
