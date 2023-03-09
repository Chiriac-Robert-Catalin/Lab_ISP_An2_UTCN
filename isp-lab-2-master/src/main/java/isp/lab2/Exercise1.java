package isp.lab2;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
public class Exercise1 {
    public static Scanner keyboard = new Scanner(System.in);
    /**
     * This method should generate an random number between 2 and 10 then
     * should ask user to enter that amount of numbers from keyboard and
     * store the numbers in an int array which should be returned
     *
     * @return the array of numbers read from keyboard
     */
    private static int randomNum=ThreadLocalRandom.current().nextInt(2,10);
    private static int[] getUserNumbers(int randomNum) {
        int i;
        int[] vector = new int[randomNum];
        System.out.println("Introdu "+randomNum+" numere");
        System.out.println(vector.length);
        for(i=0;i<randomNum;i++)
        {
            vector[i]=keyboard.nextInt();
        }
        return vector;
    }

    /**
     * This method should compute the arithmetical mean of the given numbers
     *
     * @param userNumbers the numbers used to calculate the arithmetical mean
     * @return the arithmetical mean of the given numbers
     */
    protected static double computeTheArithmeticalMean(int[] userNumbers) {
        int i;
        Double S= Double.valueOf(0);
        for(i=0;i< userNumbers.length;i++) {
            S += userNumbers[i];
        }
        double mean=S/ userNumbers.length;
        return mean;
    }

    public static void main(String[] args) {
        int[] userNumbers = getUserNumbers(randomNum);
        System.out.println("Mean number is: " + computeTheArithmeticalMean(userNumbers));
    }


}
