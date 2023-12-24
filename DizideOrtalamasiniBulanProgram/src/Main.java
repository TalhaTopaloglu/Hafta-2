public class Main {
    public static void main(String[] args) {

        int[] list = {1,2,3,4,5};

        int n = list.length;
        double harmonicSum = 0.0;

        for(double x : list){
            harmonicSum += 1/x;
        }

        System.out.println("Harmonik Seri : " + harmonicSum);
        System.out.println("Eleman Sayısı : " + n);
        double harmonicAverage = n/harmonicSum;

        System.out.println("Harmonik Ortalama : " + harmonicAverage);

    }
}