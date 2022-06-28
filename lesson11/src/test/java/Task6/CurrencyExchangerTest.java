package Task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;

import java.util.stream.Stream;

class CurrencyExchangerTest {

    @ParameterizedTest
    @MethodSource("provideArgumentsForShouldSellPolishZlotyTest")
    void shouldSellPolishZloty(double amount, Currency currency, double expected) {
        // given
        ExchangeRateProvider exchangeRateProvider = Mockito.mock(ExchangeRateProvider.class);
        Mockito.when(exchangeRateProvider.getBuyingRate(Currency.EUR)).thenReturn(4.6593);
        Mockito.when(exchangeRateProvider.getBuyingRate(Currency.USD)).thenReturn(4.4227);
        Mockito.when(exchangeRateProvider.getBuyingRate(Currency.GBP)).thenReturn(5.4270);

        CurrencyExchanger currencyExchanger = new CurrencyExchanger(exchangeRateProvider);

        // when
        double actual = currencyExchanger.sellPolishZloty(amount, currency);

        // then
        Assertions.assertEquals(expected, actual);
    }

    private static Stream<Arguments> provideArgumentsForShouldSellPolishZlotyTest() {
        return Stream.of(
                Arguments.of(100, Currency.EUR, 21.462451441203616),
                Arguments.of(100, Currency.USD, 22.610622470436613),
                Arguments.of(100, Currency.GBP, 18.426386585590567)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForShouldBuyPolishZlotyTest")
    void shouldBuyPolishZloty(double amount, Currency currency, double expected) {
        // given
        ExchangeRateProvider exchangeRateProvider = Mockito.mock(ExchangeRateProvider.class);
        Mockito.when(exchangeRateProvider.getSellingRate(Currency.EUR)).thenReturn(4.7535);
        Mockito.when(exchangeRateProvider.getSellingRate(Currency.USD)).thenReturn(4.5121);
        Mockito.when(exchangeRateProvider.getSellingRate(Currency.GBP)).thenReturn(5.5366);

        CurrencyExchanger currencyExchanger = new CurrencyExchanger(exchangeRateProvider);

        // when
        double actual = currencyExchanger.buyPolishZloty(amount, currency);

        // then
        Assertions.assertEquals(expected, actual);
    }

    private static Stream<Arguments> provideArgumentsForShouldBuyPolishZlotyTest() {
        return Stream.of(
                Arguments.of(100, Currency.EUR, 21.037130535394972),
                Arguments.of(100, Currency.USD, 22.16262937434897),
                Arguments.of(100, Currency.GBP, 18.061626268829247)
        );
    }
}