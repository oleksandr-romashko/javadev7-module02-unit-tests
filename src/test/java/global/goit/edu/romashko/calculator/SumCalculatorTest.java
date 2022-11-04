package global.goit.edu.romashko.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {
    private SumCalculator calculator;

    @BeforeEach
    void init() {
        calculator = new SumCalculator();
    }

    @AfterEach
    void teardown() {
        calculator = null;
    }

    @Test
    public void shouldReturnOneWhenInputIsOne() {
        int actual = calculator.sum(1);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnSumWhenInputIsMoreThanOne() {
        int actual = calculator.sum(3);
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenInputIsZero() {
        String expectedMessage = "bad value - value is less than 1";

        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> calculator.sum(0));
        assertEquals(expectedMessage, exception.getMessage());
    }
}
