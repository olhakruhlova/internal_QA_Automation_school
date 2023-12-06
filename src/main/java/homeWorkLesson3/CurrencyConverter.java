package homeWorkLesson3;

public class CurrencyConverter {

    private double commission;
    private double exchangeRate;

    public CurrencyConverter(double commission, double exchange) {
        this.commission = commission;
        this.exchangeRate = exchange;
    }

    private double convertUsdToUah(double amountUsd) {
        double amountUah = amountUsd * exchangeRate;
        return amountUah;
    }

    private double calculateCommission(double amountUsd) {
        double calculatedCommission = amountUsd * commission;
        return calculatedCommission;
    }

    public double calculateTotalAmount(double amountUsd) {
        double netAmountUsd = amountUsd - calculateCommission(amountUsd);
        return convertUsdToUah(netAmountUsd);
    }
}
