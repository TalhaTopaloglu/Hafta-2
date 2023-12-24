import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Satır Sayısı Giriniz : ");        // Satır sayısını alıyoruz.
        int rowNumber = input.nextInt();
        System.out.print("Sütun Sayısı Giriniz : ");        // Sütun sayısını alıyoruz.
        int columbNumber = input.nextInt();

        int[][] matrix = new int[rowNumber][columbNumber];      // Yani bir liste belirliyoruz.
        int number = 1;

        for (int i = 0; i < matrix.length; i++) {               // matrise 1den başlayarak numaralandırma
            int[] row = matrix[i];
            for (int j = 0; j < row.length; j++) {
                row[j] = number;
                number++;
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
            }
            System.out.println(Arrays.toString(matrix[row]));
        }

        System.out.println("----------GİRİLEN DİZİNİN TRANSPOZU------------");

        toTranspose(matrix);
    }

    public static void toTranspose(int[][] matrix) {

        int[][] list = new int[matrix[0].length][matrix.length];        // transpoz algoritmasında satırların[i] ve sütunların[j] yeri değişiyor.
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                list[i][j] = matrix[j][i];
            }
            System.out.println(Arrays.toString(list[i]));
        }
    }
}

