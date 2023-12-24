import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};

        Arrays.sort(arr);

        frekansFind(arr);
    }

    public static void frekansFind(int[] arr) {
        System.out.println("Tekrar Sayıları:");

        int n = arr.length;
        int counter = 1;

        for (int i = 1; i < n; i++) {
            // Ardışık elemanları kontrol et
            if (arr[i] == arr[i - 1]) {
                counter++;
            } else {
                System.out.println( arr[i - 1] + " sayısı " + counter + " kez tekrar edildi.");
                counter = 1;
            }

            // Dizi sonuna gelindiğinde işlemi tekrarla
            if (i == n - 1) {
                System.out.println( arr[i] + " sayısı " + counter + " kez tekrar edildi.");
            }
        }
    }
}


 