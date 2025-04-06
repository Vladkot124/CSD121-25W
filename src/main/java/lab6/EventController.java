package lab6;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class EventController implements EventHandler<ActionEvent> {
    private final TextField input;
    private final ComboBox<String> currencySelector;
    private final Label output;
    private final Converter converter;

    public EventController(TextField input, ComboBox<String> currencySelector, Label output, Converter converter) {
        this.input = input;
        this.currencySelector = currencySelector;
        this.output = output;
        this.converter = converter;
    }

    @Override
    public void handle(ActionEvent event) {
        try {
            double amount = Double.parseDouble(input.getText());
            String currency = currencySelector.getValue();
            double result = converter.convert(amount, currency);
            output.setText(String.format("Converted: %.2f %s", result, currency));
        } catch (NumberFormatException e) {
            output.setText("Please enter a valid number.");
        }
    }
}