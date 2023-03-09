package isp.lab2;

public class Exercise6 {

    /**
     * This method should generate the required vector non-recursively
     *
     * @param n the length of teh generated vector
     * @return the generated vector
     */
    public static int[] generateVector(int n) {
        int first = 1,second = 2;
        int[] vector = new int[n];
        vector[0]=first;
        vector[1]=second;
        int k=2;
        for (int i = 0; i<n-2; ++i)
        {
            int sum = first * second;
            first = second;
            second = sum;
            vector[k]=sum;
            k++;
        }
        return vector;
        //throw new UnsupportedOperationException();
    }

    /**
     * This method should generate the required vector recursively
     *
     * @param n the length of teh generated vector
     * @return the generated vector
     */
    public static int fibonaccitimes(int n) {

        if(n==1)
            return 1;
        else if(n==2)
            return 2;
        else
            return fibonaccitimes(n-1) * fibonaccitimes(n-2);

    }
    public static int[] generateRandomVectorRecursively(int n) {
        int[] vector = new int[n];
        int i;
        for(i=0;i<n;i++)
            vector[i]=fibonaccitimes(i+1);
        return vector;
        //throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        // TODO: print the vectors
        int[] vector1=generateVector(5);
        int[] vector2=generateRandomVectorRecursively(7);
        for(int i=0;i<5;i++)
        {
            System.out.print(vector1[i]+" ");
        }
        System.out.println();
        for(int i=0;i<7;i++)
        {
            System.out.println(vector2[i]);
        }
    }
}
