import java.util.*;

public class largest {
    public static int getlargest(int numbers[]) {

        int Largest = Integer.MIN_VALUE;// minus Infinity
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > Largest) {
                Largest = numbers[i];// updation lof largest from n=minus infinity

            }

        }
        return Largest;
    }

    public static void main(String args[]) {

        int numbers[] = { 2, 5, 8, 3, 9, 4, };
        System.out.println("largest number is : " + getlargest(numbers));

    }

}