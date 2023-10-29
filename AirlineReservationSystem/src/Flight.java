import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Flight extends Observable implements AirlineReservationSystem {
    private List<String> availableSeats = new ArrayList<>();

    public void addAvailableSeat(String seat) {
        availableSeats.add(seat);
        setChanged();
        notifyObservers("Seat " + seat + " is available.");
    }

    public void bookSeat(String seat) {
        availableSeats.remove(seat);
        setChanged();
        notifyObservers("Seat " + seat + " has been booked.");
    }

    public List<String> getAvailableSeats() {
        return availableSeats;
    }

    @Override
    public void removeObserver(Observer observer) {

    }

    @Override
    public void notifyObservers(String message) {

    }
}
