import java.util.Scanner;

public class Main {

    public static void pattern(int number) {
        //sayı 0 veya 0dan küçükse geri döndürme işlemi yapıyoruz
        if (number <= 0) {
            return;
        }
        // 5 çıkartıyoruz
        number -= 5;
        System.out.print(" " + number);

        // Recursive çağrı
        pattern(number);

        // 5 ekliyoruz
        number += 5;
        System.out.print(" " + number);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N Sayısı : ");
        int number = scanner.nextInt();

        System.out.print("Çıktısı : " + number);
        pattern(number);
    }
}
