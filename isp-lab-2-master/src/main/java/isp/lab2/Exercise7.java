package isp.lab2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise7 {

    public static Scanner keyboard = new Scanner(System.in);
    /**
     * This method should generate a random number which
     * represent the position in the given arrays,so
     * the random should be between 0 and 7
     *
     * @return the generated random
     */
    public static int generateARandom() {
        int RandomNum= ThreadLocalRandom.current().nextInt(0,7);
        return RandomNum;
        //throw new UnsupportedOperationException();
    }
    public static int guesses(int randomNum)
    {
        int[] answers=new int[5];
        int i;

        for(i=0;i<5;i++)
        {
            answers[i]=keyboard.nextInt();
            if(answers[i]==randomNum)
            {
                System.out.println("Congrats!You guessed the number");
                return 0;
            }
            else {
                if (answers[i] > randomNum) {
                    System.out.println("I'm sorry, your number is too high!You have " + (4 - i) + " tries left");
                } else {
                    System.out.println("I'm sorry, your number is too low!You have " + (4 - i) + " tries left");
                }
            }
            if(i>0&&answers[i]==answers[i-1])
            {
                System.out.println("Multiple inputs detected.Ending the program");
                return 0;
            }
        }
        System.out.println("I'm sorry, you lost!");
        return 0;
    }
    public static void main(String[] args) {
        int[] ucl = new int[]{1, 2, 3, 4, 5, 6, 7, 13};
        int[] answers = new int[]{10, 4, 2, 1, 2, 1, 1, 1};
        int times = generateARandom();
        guesses(times);
    }
}
