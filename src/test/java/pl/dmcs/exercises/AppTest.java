package pl.dmcs.exercises;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void testPrimeFactors() {
        checkPrimeFactors(1, new int[]{});
        checkPrimeFactors(2, new int[]{2});
        checkPrimeFactors(3, new int[]{3});
        checkPrimeFactors(4, new int[]{2, 2});
        checkPrimeFactors(5, new int[]{5});
        checkPrimeFactors(6, new int[]{2, 3});
        checkPrimeFactors(7, new int[]{7});
        checkPrimeFactors(8, new int[]{2, 2, 2});
        checkPrimeFactors(9, new int[]{3, 3});
        checkPrimeFactors(10, new int[]{2, 5});
        checkPrimeFactors(11, new int[]{11});
        checkPrimeFactors(12, new int[]{2, 2, 3});
        checkPrimeFactors(228, new int[]{2, 2, 3, 19});
        checkPrimeFactors(456432, new int[]{2, 2, 2, 2, 3, 37, 257});
    }

    public void checkPrimeFactors(int number, int[] expectedResults) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : expectedResults) {
            list.add(i);
        }
        System.out.println("Rozklad liczby: " + number + " : " + PrimeFactorsCalculator.getPrimeFactors(number));
        assertEquals(PrimeFactorsCalculator.getPrimeFactors(number), list);
    }
}
