import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        TextField textField = new TextField();
        Label resultLabel = new Label("Result: ");
        Button convertToF = new Button("Convert to Fahrenheit");
        Button convertToC = new Button("Convert to Celsius");

        // Attach event handlers
        convertToF.setOnAction(new TemperatureConverter(textField, resultLabel, true));
        convertToC.setOnAction(new TemperatureConverter(textField, resultLabel, false));

        VBox root = new VBox(10, textField, convertToF, convertToC, resultLabel);
        Scene scene = new Scene(root, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Temperature Converter");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

