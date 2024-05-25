package calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int Bubblegum = 202;
        int Toffee = 118;
        int Ice_cream = 2250;
        int Milk_chocolate = 1680;
        int Doughnut = 1075;
        int Pancake = 80;

        double total = Bubblegum+Toffee+Ice_cream+Milk_chocolate+Doughnut+Pancake;

        System.out.println("Earned amount:");

        System.out.println("Bubblegum: $" + Bubblegum);
        System.out.println("Toffee: $" + Toffee);
        System.out.println("Ice cream: $" + Ice_cream);
        System.out.println("Milk chocolate: $" + Milk_chocolate);
        System.out.println("Doughnut: $" + Doughnut);
        System.out.println("Pancake: $" + Pancake);
        System.out.println("\n Income: $" + total);
        System.out.println("Staff expenses:");
        double staffExpense = scanner.nextInt();
        System.out.println("Other expenses:");
        double otherExpense = scanner.nextInt();
        double netIncome = total - staffExpense - otherExpense;
        System.out.printf("Net income: $%.2f", netIncome );



    }
}