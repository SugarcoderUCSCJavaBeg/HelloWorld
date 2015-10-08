import java.util.Random;
import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello World\n" +
                "and Java Class!");



        final int hSize = 30;
        final int vSize = 30;


        int count = 0;

        while (count++ < hSize)
            System.out.print("-");
        System.out.printf("\n");


        int count2 = 0;
        while (count2++ < hSize - 20) {
            System.out.println("|");

            count = 0;
            while (count++ < vSize - 1)
                System.out.print(" ");
            System.out.println("|");

        }


        count = 0;

        while (count++ < hSize)
            System.out.print("-");
        System.out.printf("\n");


        int randomNumber = new Random().nextInt(10) + 1;
        System.out.println(randomNumber);




        // if ...else if...else Example

        int age;

        Scanner readInput = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        age = readInput.nextInt();

        if(age >= 20) {
            System.out.println("You are old enough to drink");
        } else if (age <= 20) {
            System.out.println("You are not old enough to drink yet, wait one more year.");
        } else {
            System.out.println("You are too young to drink.");
        }


    }


}
