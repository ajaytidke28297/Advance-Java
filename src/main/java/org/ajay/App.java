package org.ajay;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int size = 9;
        int d = 3;
        int arr[] = {1, 7, 8, 5, 4, 6, 0, 2, 3};

    }

    public int[] arrRotate(int input1, int[] input2, int input3) {

        if (input1 == 0 || input3 == 0)
            throw new UnsupportedOperationException("");
        int answerArray[] = new int[input1];
        int i, j = 0;

        for ( i = input3; i < input1; i++)
            answerArray[j++] = input2[i];

        for (int k = 0; k < input3; k++)
            answerArray[j++] = input2[k];

        return answerArray;
    }
}
