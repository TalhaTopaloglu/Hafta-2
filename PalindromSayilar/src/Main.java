import java.util.Scanner;

public class Main {
    static boolean isPalindrom() {

        Scanner inp = new Scanner(System.in);

        int number;
        System.out.print("Bir sayı giriniz: ");
        number = inp.nextInt();

        int temp = number, reverseNumber = 0, lastNUmber;
        while (temp != 0) {
//          System.out.println("Temp : " +temp);
            lastNUmber = temp % 10;
//          System.out.println("LastNumber : " + lastNUmber);
            reverseNumber = (reverseNumber * 10) + lastNUmber;
//          System.out.println("reverseNumber : " + reverseNumber);
            temp /= 10;
        }
        return number == reverseNumber;

    }

    public static void main(String[] args) {

        if(isPalindrom()){
            System.out.println("Bu bir palindrom sayıdır.");
        }
        else {
            System.out.println("Bu bir palindrom sayı değildir.");
        }
    }
}