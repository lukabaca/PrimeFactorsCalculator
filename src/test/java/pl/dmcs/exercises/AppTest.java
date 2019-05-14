package pl.dmcs.exercises;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testPrimeFactors() {
        checkPrimeFactors(1, Collections.<Integer>emptyList());
        checkPrimeFactors(2, Arrays.asList(2));
        checkPrimeFactors(3, Arrays.asList(3));
        checkPrimeFactors(4, Arrays.asList(2, 2));
        checkPrimeFactors(5, Arrays.asList(5));
        checkPrimeFactors(6, Arrays.asList(2, 3));
        checkPrimeFactors(7, Arrays.asList(7));
        checkPrimeFactors(8, Arrays.asList(2, 2, 2));
        checkPrimeFactors(9, Arrays.asList(3, 3));
        checkPrimeFactors(10, Arrays.asList(2, 5));
        checkPrimeFactors(11, Arrays.asList(11));
        checkPrimeFactors(12, Arrays.asList(2, 2, 3));
        checkPrimeFactors(228, Arrays.asList(2, 2, 3, 19));
        checkPrimeFactors(456432, Arrays.asList(2, 2, 2, 2, 3, 37, 257));
    }

    private void checkPrimeFactors(int number, List<Integer> expectedResults) {
        PrimeFactorsCalculator primeFactorsCalculator = new PrimeFactorsCalculator();
        assertEquals(primeFactorsCalculator.getPrimeFactors(number), expectedResults);
    }
}
