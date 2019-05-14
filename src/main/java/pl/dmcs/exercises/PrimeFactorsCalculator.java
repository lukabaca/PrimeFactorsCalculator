package pl.dmcs.exercises;
import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsCalculator {

    public List<Integer> getPrimeFactors(int number) {
        List<Integer> primeFactors = new ArrayList<Integer>();
        if (number > 1 ) {
            for (int divider = 2; divider <= number; divider++) {
                while (number % divider == 0) {
                    number /= divider;
                    primeFactors.add(divider);
                }
            }
        }
        return primeFactors;
    }

}
