package isp.lab2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercise5 {

    /**
     * This method should generate an array that have 20 random nubers between -1000 and 1000
     *
     * @return the random numbers
     */
    public static int[] generateRandomNumbers() {
        int i;
        int[] vector = new int[20];
        for(i=0;i<20;i++)
        {
            vector[i]= ThreadLocalRandom.current().nextInt(-1000,1000);
        }
        return vector;
        //throw new UnsupportedOperationException();
    }

    /**
     * This method should sort the given random numbers
     *
     * @param randomNumbers numbers generated random
     * @return sorted int array
     */
    public static int[] getSortedNumbers(int[] randomNumbers) {
        int i,j;
        for(i=0;i<randomNumbers.length-1;i++) {
            for (j = i + 1; j < randomNumbers.length; j++) {
                if (randomNumbers[i] > randomNumbers[j]) {
                    int aux = randomNumbers[i];
                    randomNumbers[i] = randomNumbers[j];
                    randomNumbers[j] = aux;
                }
            }
        }
        return randomNumbers;
        //throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        // display the random generated numbers
        int[] randomNumbers = generateRandomNumbers();
        System.out.println("The random generated numbers are:");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i] + ", ");
        }
        int[] sortedNumbers = getSortedNumbers(randomNumbers);
        // display the sorted numbers
        System.out.println("The sorted numbers are:");
        for (int i = 0; i < sortedNumbers.length; i++) {
            System.out.print(sortedNumbers[i] + ", ");
        }
    }
}
