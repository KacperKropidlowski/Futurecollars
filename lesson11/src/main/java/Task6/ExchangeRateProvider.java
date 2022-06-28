package Task6;

public interface ExchangeRateProvider {

    double getSellingRate(Currency currency);

    double getBuyingRate(Currency currency);
}
