import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        <-- Challnege 1 -->

//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//
//        System.out.println("Hello " + name);
//
//        scanner.close();

//        <-- Challnege 2 -->

//        System.out.print("Enter a number: ");
//
//        int num = Integer.parseInt(scanner.nextLine());
//
//        for (int i = num; i >= 0; i--) {
//            System.out.print(i + " ");
//        }

//        <-- Challenge 3 -->

        Random random = new Random();

        System.out.print("Enter a number: ");
        int num = Integer.parseInt(scanner.nextLine());

        int randomNum = random.nextInt(10) + 1;
        boolean check = true;

        while (check) {


            if (num == randomNum) {
                System.out.print("You guessed it right");
                check = false;
            } else {
                System.out.println("You guessed it wrong,");
                System.out.print("Try again: ");
                num = Integer.parseInt(scanner.nextLine());
            }
        }

        scanner.close();

    }
}
