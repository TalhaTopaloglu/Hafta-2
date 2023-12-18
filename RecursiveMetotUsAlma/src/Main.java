import java.util.Scanner;

public class Main {

    static int power(int base, int exponent){                    // return edilen bir metot tanımlıyoruz.
        if(exponent == 0){                                       // Üs kısım 0'a denk olduğunda 1'i return ediyoruz.
            return 1;
        }
        return base * power(base, exponent-1);          // Aldığımız base ile recursive'den aldığımız base'i çarpıyoruz.
    }

    public static void main(String[] args) {
        int base,exponent;
        Scanner inp = new Scanner(System.in);
        System.out.print("Taban Değerini Giriniz : ");          // Kullanıcıdan taban değeri alıyoruz.
        base = inp.nextInt();
        System.out.print("Üs Değerini Giriniz : ");             // Kullanıcıdan üs değeri alıyoruz.
        exponent = inp.nextInt();

        System.out.println("Sonuç : " + power(base,exponent));  // main'in içinde oluşturduğumuz base ve exponent değişkenlerini power() methodunda çalıştırıyoruz.

    }
}