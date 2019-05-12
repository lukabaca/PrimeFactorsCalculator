package pl.dmcs.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeFactorsCalculator {
    public static void main(String[] args) {
        System.out.println("Hello");
        int [] array = {1};
        System.out.println(Arrays.asList(array));
    }

    public static List<Integer> getPrimeFactors(int number) {
        List<Integer> primeFactors = new ArrayList<Integer>();
        if (number != 1 ) {
            for (int i = 2; i <= number; i++) {
                while (number % i == 0) {
                    number /= i;
                    primeFactors.add(i);
                }
            }
        }
        return primeFactors;
    }

    public static void printPrimeFactors(List<Integer> primeFactors) {
        System.out.println(primeFactors);
    }
}
