import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AirlineReservationUI extends Application {
    private Flight flight;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        flight = new Flight();

        primaryStage.setTitle("Airline Reservation System");
        VBox root = new VBox();

        Label messageLabel = new Label("Messages:");
        TextField messageField = new TextField();
        messageField.setDisable(true);

        Button addButton = new Button("Add Available Seat");
        addButton.setOnAction(e -> {
            String seat = messageField.getText();
            flight.addAvailableSeat(seat);
            messageField.setText("Seat " + seat + " added.");
        });

        Button bookButton = new Button("Book Seat");
        bookButton.setOnAction(e -> {
            String seat = messageField.getText();
            flight.bookSeat(seat);
            messageField.setText("Seat " + seat + " booked.");
        });

        root.getChildren().addAll(messageLabel, messageField, addButton, bookButton);

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
