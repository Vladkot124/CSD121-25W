import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TemperatureConverter implements EventHandler<ActionEvent> {
    private TextField textField;
    private Label resultLabel;
    private boolean toFahrenheit;

    public TemperatureConverter(TextField textField, Label resultLabel, boolean toFahrenheit) {
        this.textField = textField;
        this.resultLabel = resultLabel;
        this.toFahrenheit = toFahrenheit;
    }

    @Override
    public void handle(ActionEvent event) {
        try {
            double temperature = Double.parseDouble(textField.getText());

            double result;
            if (toFahrenheit) {
                result = (temperature * 9 / 5) + 32;
                resultLabel.setText("Result: " + result + " °F");
            } else {
                result = (temperature - 32) * 5 / 9;
                resultLabel.setText("Result: " + result + " °C");
            }
        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid input!");
        }
    }
}
