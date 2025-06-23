import java.util.*;

public class basic {
    public static void main(String args[]) {

        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of PCM");
        marks[0] = sc.nextInt();// physic marks
        marks[1] = sc.nextInt();// chemistry marks
        marks[2] = sc.nextInt();// maths marks

        System.out.println("physic : " + marks[0]);
        System.out.println("chemistry : " + marks[1]);
        System.out.println("maths: " + marks[2]);

        marks[2] = 100;
        System.out.println("update marks of math : " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage is : " + percentage + "%");

        // length of array
        System.out.println("length of array : " + marks.length);
        sc.close();

    }

}
