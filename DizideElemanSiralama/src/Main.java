import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutu n : ");
        int n = input.nextInt();

       int[] list = new int[n];

        System.out.println("Dizinin elemanlarını giriniz : ");
       for(int i = 0; i<list.length; i++){
           System.out.print(i+1 + ". elemanı giriniz : ");
           list[i] = input.nextInt();
       }
       Arrays.sort(list);

        System.out.print("Sıralama : ");
       for(int x : list){
           System.out.print(x + " ");
       }
    }
}