import java.util.Observer;

public interface AirlineReservationSystem {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);
}
