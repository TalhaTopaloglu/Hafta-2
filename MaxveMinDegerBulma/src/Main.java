import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        int lessThanFive = 0;
        int moreThanFive = 0;
        int number  = 5 ;


        for(int x : list){
            if(number > moreThanFive  ){
                moreThanFive = x;

            }
        }

        int index = Arrays.binarySearch(list , moreThanFive);
        lessThanFive = list[index-1];

        System.out.println(moreThanFive);

        System.out.println(lessThanFive);
    }
}