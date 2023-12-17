import java.util.Scanner;

public class Main {

    static void plus() {
        Scanner inp = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.println(i++ + ". sayı :");
            number = inp.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void minus() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = inp.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ".sayı :");
            number = inp.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void times() {
        int result = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç sayı girilecek : ");
        int number = inp.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.print(i + ". sayıyı giriniz : ");
            int value = inp.nextInt();
            result *= value;
        }
        System.out.println("Sonuç : " + result + "\n");
    }

    static void divided() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = inp.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = inp.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void power() {

        int result = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Taban Giriniz :");
        int base = inp.nextInt();
        System.out.print("Üs Giriniz : ");
        int exponent = inp.nextInt();

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        System.out.println("Sonuç : " + result);
    }

    static void factoriel() {
        int result = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz : ");
        int number = inp.nextInt();

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        System.out.println(number + "! = " + result);
    }

    static void mod() {
        int result;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz : ");
        int number = inp.nextInt();
        System.out.print("Mod Sayısını Giriniz : ");
        int modNumber = inp.nextInt();
        result = number % modNumber;
        System.out.println("Sonuç : " + result);
    }

    static void rectangleArea() {
        int area, perimeter;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kısa Kenarı Giriniz : ");
        int firstEdge = inp.nextInt();
        System.out.print("Uzun Kenarı Giriniz : ");
        int secondEdge = inp.nextInt();

        area = (firstEdge * secondEdge);
        perimeter = 2 * (firstEdge + secondEdge);

        System.out.println("Dikdörtgenin Alanı = " + area);
        System.out.println("Dikdörtgenin Çevresi = " + perimeter);

    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int select;

        String menu = "1 - Toplam İşlemi\n"
                + "2 - Çıkarma İşlemi\n"
                + "3 - Çarpma İşlemi\n"
                + "4 - Bölme İşlemi\n"
                + "5 - Üslü Sayı Hesaplama\n"
                + "6 - Faktöryel Hesaplama\n"
                + "7 - Mod Alma\n"
                + "8 - Dikdörtgen Alanı ve Çevresi\n"
                + "0 - Çıkış Yap \n";

        do {
            System.out.println(menu);
            System.out.print("Lüften Bir İşlem Seçiniz: ");
            select = inp.nextInt();

            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factoriel();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangleArea();
                    break;
                case 0:
                    System.out.println("Başarılı şekilde çıkış yapıldı.");
                    break;
                default:
                    System.out.println("Geçersiz Sayı Girdiniz");
                    break;
            }
        } while (select != 0);

    }
}