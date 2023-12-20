public class Main {
    public static void main(String[] args) {
        Fighter f1 =new Fighter("Alex" , 15 , 100, 90, 21);
        Fighter f2 = new Fighter("Mark" , 10 , 95, 100, 21);

        Match match = new Match(f1,f2,85,100);
        match.run();
    }
}