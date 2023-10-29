import java.util.Observer;

public interface Passenger extends Observer {
    void update(String message);
}
