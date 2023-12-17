import java.util.Scanner;

public class Main {

    public static int fibonacci(int fibonacciNumber) {
        if (fibonacciNumber == 1 || fibonacciNumber == 2) {
            return 1;
        }
        return fibonacci(fibonacciNumber - 1) + fibonacci(fibonacciNumber - 2);
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Numara giriniz : ");
        int number = inp.nextInt();
        System.out.print("0");

        for (int i = 1; i <= number; i++) {
            System.out.print(" " + fibonacci(i));
        }
    }
}