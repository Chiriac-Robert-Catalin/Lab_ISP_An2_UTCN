package isp.lab2;

public class Exercise4 {

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
        //throw new UnsupportedOperationException();
    }

    /**
     * This method should get the first(by position) odd number from the given array
     *
     * @param someNumbers the given int array
     * @return first odd number from the array
     */
    public static int firstOdd(int[] someNumbers) {
        int i;
        for(i=0;i< someNumbers.length;i++)
        {
            if(someNumbers[i]%2==1)
                return someNumbers[i];
        }
        System.out.println("There aren't Odd numbers");
        return -1;//throw new UnsupportedOperationException();
    }

    /**
     * This method should get the first(by position) even number from the given array
     *
     * @param someNumbers the given int array
     * @return first even number from the array
     */
    public static int firstEven(int[] someNumbers) {
        int i;
        for(i=0;i< someNumbers.length;i++)
        {
            if(someNumbers[i]%2==0)
                return someNumbers[i];
        }
        //throw new UnsupportedOperationException();
        System.out.println("There are no Even numbers");
        return -1;
    }

    /**
     * This method should get the first(by position) prime number from the given array
     *
     * @param someNumbers the given int array
     * @return first prime number from the array
     */
    public static int firstPrime(int[] someNumbers) {
        // TODO: Use isPrimeNumber(final int number)
        int i;
        for(i=0;i< someNumbers.length;i++)
        {
            if(isPrimeNumber(someNumbers[i])==true)
                return someNumbers[i];
        }
        //throw new UnsupportedOperationException();
        System.out.println("There aren't Prime numbers");
        return -1;
    }

    /**
     * Don't forget to also display the position of ech number
     */
    public static void main(String[] args) {
        int[] someNumbers = new int[]{15, 18, 13, 22, 21, 11, 57, 141, 563, 16};

        System.out.println("First odd number: " + firstOdd(someNumbers));
        System.out.println("First even number: " + firstEven(someNumbers));
        System.out.println("First prime number: " + firstPrime(someNumbers));
    }
}
