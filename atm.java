import java.util.*;

import javax.swing.text.StyledEditorKit;

public class java {

    static Scanner sc = new Scanner(System.in);
    static int pin = 4040;
    static int balance = 500000;

    public static void main(String[] args) {
        System.out.println("welcome to ATM");
        boolean iscorrect1 = iscorrect();
        if (iscorrect1) {
            showmenu();
            System.out.println("hi");
        } else {
            System.out.println("invalid pin");
        }

    }

    private static boolean iscorrect() {
        System.out.print("enter the pin : ");
        int enterdpin = sc.nextInt();
        boolean isvalidpin = enterdpin == (int) enterdpin;
        if (isvalidpin && enterdpin == pin) {
            return true;
        }
        return false;
    }

    private static void showmenu() {
        while (true) {
            System.out.println("----------------------------------");
            System.out.println("1.check balance ");
            System.out.println("2.withdraw money");
            System.out.println("3. deposit amount");
            System.out.println("4. change pin ");
            System.out.println("5.exit");
            System.out.println("----------------------------------");

            int choice = sc.nextInt();
            boolean validchoice = choice == (int) choice;
            if (!validchoice || choice < 1 || choice > 5) {
                System.out.println("invalid choice");
                continue;

            }
            switch (choice) {
                case 1:
                    checkbalance();
                    break;
                case 2:
                    withdraw();
                    break;

                case 3:
                    deposit();
                    break;
                case 4:
                    changepin();
                    break;
                case 5:

                    // return false;
                    System.out.println("thank you for visting");
                    break;

            }
        }

    }

    private static void checkbalance() {
        System.out.println("current balance inn your account:" + balance);
    }

    private static void withdraw() {
        System.out.print("enter widtdraw amount :");
        int withdrawamt = sc.nextInt();
        boolean isamtint = withdrawamt == (int) withdrawamt;
        if (!isamtint || withdrawamt <= 0 || withdrawamt % 100 != 0) {
            System.out.println("enter valid amount");
        }
        if (withdrawamt > balance) {
            System.out.println("Insufficient balance");
        } else {
            int currentbalance = balance - withdrawamt;
            System.out.println("current balance:" + currentbalance);
        }
    }

    private static void deposit() {

        System.out.println("enter your deposit amount :");

        int depositmoney = sc.nextInt();
        boolean isdeposit = depositmoney == (int) depositmoney;

        if (!isdeposit || depositmoney <= 0) {
            System.out.println("enter correct amount  ");

        } else {
            balance += depositmoney;
            System.out.println("current balance : " + balance);

        }

    }

    private static void changepin() {

        System.out.println("enter your current pin :");
        int currentpin = sc.nextInt();
        boolean iscorrectpin = currentpin == (int) currentpin;

        if (currentpin != pin) {
            System.out.println("Invalid pin");

        }
        System.out.print("Enter new pin : ");
        int newpin = sc.nextInt();
        if (newpin < 1000 || newpin > 9999) {
            System.out.println("pin must be 4 digits ");

        } else {
            pin = newpin;
            System.out.println("sucessfully changed your pin");

        }
    }

}