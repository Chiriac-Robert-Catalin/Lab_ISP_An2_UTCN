package isp.lab2;

import java.util.Arrays;

public class Exercise3 {

    /**
     * This method should verify if a number is prime
     *
     * @param number the number to check
     * @return true if number is prime and false otherwise
     */
    public static boolean isPrimeNumber(final int number) {

        int i;
        boolean ok=true;
        if(number<2)
            ok=false;
        for(i=2;i<=number/2;i++)
        {
            if(number%i==0)
                ok=false;
        }
        return ok;
    }

    /**
     * This method should calculate the sum of digits of a given number
     *
     * @param number the number used to calculate the sum of digits
     * @return an int representing the sum of digits of the given number
     */
    public static int calculateSumOfDigits(int number) {
        if(number==0)
            return 0;
        else
            return calculateSumOfDigits(number/10)+number%10;
    }

    /**
     * This method should extract the prime numbers from a given interval
     * using isPrimeNumber(final int number) method defined above
     * NOTE* a < b
     *
     * @param a the left end of the interval
     * @param b the right end of the interval
     * @return and int array consisting of the prime numbers from the given interval
     */
    public static int[] getPrimeNumbersFromInterval(int a, int b) {
        // TODO: Use isPrimeNumber(final int number)
        int i;
        int[] numere = new int[b-a+1];
        int poz=0;
        for(i=a;i<=b;i++)
        {
            if(isPrimeNumber(i)==true)
            {
                numere[poz]=i;
                poz++;
            }
        }
        numere= Arrays.copyOf(numere,poz);
        return numere;
       // throw new UnsupportedOperationException();
    }

    /**
     * This method should calculate the geometric mean of the given prime numbers
     *
     * @param primeNumbers the numbers used to calculate the geometric mean
     * @return the geometric mean of the given numbers
     */
    public static double calculateGeometricMean(int[] primeNumbers) {
        int i;
        double P=1;
        double divider= (P/primeNumbers.length);
        System.out.println(primeNumbers.length + "length");
        System.out.println(divider+ "divider");
        for(i=0;i<primeNumbers.length;i++)
            P=P*primeNumbers[i];
        P=Math.pow(P,divider);
        return P;
        //throw new UnsupportedOperationException();
    }

    /**
     * This method should calculate the number of prime numbers which
     * have the sum of digits an even number
     * NOTE* use calculateSumOfDigits(int number)
     *
     * @param primeNumbers prime numbers used for calculation
     * @return the numbers which respect the given condition
     */
    public static int numberOfPNWithEvenSumOfDigits(int[] primeNumbers) {
        // TODO: Use calculateSumOfDigits(int number)
        int i,S=0;
        for(i=0;i<primeNumbers.length;i++)
        {
            if(isPrimeNumber(primeNumbers[i])==true&&calculateSumOfDigits(primeNumbers[i])%2==0)
            {
                S++;
            }
        }
        return S;
        //throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 50;
        System.out.println("The geometric mean is: " + calculateGeometricMean(getPrimeNumbersFromInterval(a, b)));
        System.out.println("The number of prime numbers which have the sum of digits an even number is: " + numberOfPNWithEvenSumOfDigits(getPrimeNumbersFromInterval(a, b)));
    }
}
