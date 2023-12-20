import java.util.Scanner;

public class Main {

    static boolean isPrime(int number, int divider) { // boolean bir kontrol metodu tanımlıyoruz.

        if (number <= 1) {
            return false;
        }

        if (divider > Math.sqrt(number)) {
            return false;                             // Temel durum: Sayı asal olduğunda true döndür
        }

        if (number % divider == 0) {                  // if kontrolü ile sayı bölünlere bölünüyorsa true yani asal değil.
            return true;
        }

        return isPrime(number, divider + 1);  // recursive ile divider değişkenin bir arttırarak bölenlerine bakıyoruz.

    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz : ");      // kullanıcıdan sayı alıyoruz.
        int number = inp.nextInt();
        boolean result = isPrime(number,2); // divider değişkenini 2den başlatıyoruz.
        if (result == false) {
            System.out.println(number + " sayısı ASALDIR !");
        } else {
            System.out.println(number + " sayısı ASAL değildir! ");
        }
    }
}