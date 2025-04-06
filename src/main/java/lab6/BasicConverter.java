package lab6;

public class BasicConverter implements Converter {

    @Override
    public double convert(double amount, String targetCurrency) {
        return switch (targetCurrency) {
            case "USD" -> amount * 0.73;
            case "EUR" -> amount * 0.68;
            case "JPY" -> amount * 108.50;
            default -> amount;
        };
    }
}