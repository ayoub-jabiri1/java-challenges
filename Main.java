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

//        Random random = new Random();
//
//        System.out.print("Enter a number: ");
//        int num = Integer.parseInt(scanner.nextLine());
//
//        int randomNum = random.nextInt(10) + 1;
//        boolean check = true;
//
//        while (check) {
//
//
//            if (num == randomNum) {
//                System.out.print("You guessed it right");
//                check = false;
//            } else {
//                System.out.println("You guessed it wrong,");
//                System.out.print("Try again: ");
//                num = Integer.parseInt(scanner.nextLine());
//            }
//        }

//        <-- Challenge 4 -->

        String choice;
        int total = 0;

        do {
            System.out.println("1. Consulter le solde");
            System.out.println("2. Dépôt");
            System.out.println("3. Retrait");
            System.out.println("4. Quitter");

            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Your balance is: " + total);
                    break;
                case "2":
                    System.out.print("Enter the amount: ");
                    int amount = Integer.parseInt(scanner.nextLine());

                    total += amount;
                    System.out.println("Deposit successfully completed.");
                    break;
                case "3":
                    System.out.print("Enter the withdraw amount: ");
                    int withdraw = Integer.parseInt(scanner.nextLine());

                    total -= withdraw;
                    System.out.println("withdraw successfully completed.");
                    break;
                case "4":
                    break;
                default:
                    System.out.println("The choice doesn't exists choose another!");

            }


        } while (!choice.equals("4"));
;
        scanner.close();

    }
}
