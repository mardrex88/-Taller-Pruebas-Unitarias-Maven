package co.com.sofka.app.mydemo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicCalculatorTest {

    private final BasicCalculator basicCalculator = new BasicCalculator();


    @Test
    @DisplayName("Testeando sum: 1+1=2")
    public void sum() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.sum(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Testeando res: 20-15=5")
    public void res() {
        // Arrange
        Long number1 = 20L;
        Long number2 = 15L;
        Long expectedValue = 5L;

        // Act
        Long result = basicCalculator.res(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testeando multiply: 4 x 5=20")
    public void mult() {
        // Arrange
        Long number1 = 4L;
        Long number2 = 5L;
        Long expectedValue = 20L;

        // Act
        Long result = basicCalculator.multiply(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testeando split: 20 ÷ 5 = 4")
    public void split() {
        // Arrange
        Long number1 = 20L;
        Long number2 = 5L;
        Long expectedValue = 4L;

        // Act
        Long result = basicCalculator.split(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }
}
