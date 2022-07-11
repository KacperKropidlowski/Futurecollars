package Task6;

public class CurrencyExchanger {
    private ExchangeRateProvider exchangeRateProvider;

    public CurrencyExchanger(ExchangeRateProvider exchangeRateProvider) {
        this.exchangeRateProvider = exchangeRateProvider;
    }

    public double sellPolishZloty(double amount, Currency currency) {
        return amount / this.exchangeRateProvider.getBuyingRate(currency);
    }

    public double buyPolishZloty(double amount, Currency currency) {
        return amount / this.exchangeRateProvider.getSellingRate(currency);
    }
}
