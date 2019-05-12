package pl.dmcs.exercises;
import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsCalculator {

    public static List<Integer> getPrimeFactors(int number) {
        List<Integer> primeFactors = new ArrayList<Integer>();
        if (number > 1 ) {
            for (int i = 2; i <= number; i++) {
                while (number % i == 0) {
                    number /= i;
                    primeFactors.add(i);
                }
            }
        }
        return primeFactors;
    }

}
