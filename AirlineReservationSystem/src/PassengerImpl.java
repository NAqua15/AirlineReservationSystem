import java.util.Observable;

public class PassengerImpl implements Passenger {
    private String name;

    public PassengerImpl(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof String) {
            String message = (String) arg;
            System.out.println(name + " received a notification: " + message);
        }
    }

    @Override
    public void update(String message) {

    }
}
