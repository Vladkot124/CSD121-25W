package lab6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class CurrencyConverter extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label titleLabel = new Label("Currency Converter");

        TextField amountField = new TextField();
        amountField.setPromptText("Enter amount in CAD");

        ComboBox<String> currencyBox = new ComboBox<>();
        currencyBox.getItems().addAll("USD", "EUR", "JPY");
        currencyBox.setValue("USD");

        Button convertBtn = new Button("Convert");

        Label resultLabel = new Label();

        BasicConverter converter = new BasicConverter();
        EventController controller = new EventController(amountField, currencyBox, resultLabel, converter);
        convertBtn.setOnAction(controller);

        VBox centerBox = new VBox(10, amountField, currencyBox, convertBtn, resultLabel);
        centerBox.setStyle("-fx-padding: 20; -fx-alignment: center;");

        BorderPane root = new BorderPane();
        root.setTop(titleLabel);
        BorderPane.setAlignment(titleLabel, javafx.geometry.Pos.CENTER);
        root.setCenter(centerBox);

        Scene scene = new Scene(root, 400, 250);
        primaryStage.setTitle("Lab 6 - JavaFX OOP");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}