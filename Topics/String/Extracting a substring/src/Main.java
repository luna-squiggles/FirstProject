import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int val1 = scanner.nextInt(), val2 = scanner.nextInt();
        String output = input.substring(val1,val2+1);
        System.out.println(output);
    }
}