import java.util.Random;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeigth;
    int maxWeigth;

    Match(Fighter f1, Fighter f2, int minWeigth, int maxWeigth){
        this.f1= f1;
        this.f2 = f2;
        this.minWeigth = minWeigth;
        this.maxWeigth = maxWeigth;
    }
    void run(){
        if (isCheck()) {

            boolean isFirstFighter = isFirst();
            Fighter firstFighter = isFirstFighter ? f1 : f2;
            Fighter secondFighter = isFirstFighter ? f2 : f1;

            System.out.println("İlk dövüşçü: " + firstFighter.name);
            System.out.println("İkinci dövüşçü: " + secondFighter.name);


            while(firstFighter.health > 0 && secondFighter.health > 0) {

                secondFighter.health = firstFighter.hit(secondFighter);
                if(isWin()){
                    break;
                }
                firstFighter.health = secondFighter.hit(firstFighter);
                if(isWin()){
                    break;
                }
                System.out.println("Kalan Sağlık   " + firstFighter.name + " :" + firstFighter.health);
                System.out.println("Kalan Sağlık   " + secondFighter.name + " :" +secondFighter.health);
                System.out.println("======= YENİ ROUND ======= ");
            }
        } else {
            System.out.println("Sporcuların Sikletleri Uymuyor.");
        }
    }
    boolean isCheck(){
        return (this.f1.weight >= minWeigth && this.f1.weight <= maxWeigth ) &&(this.f2.weight >= minWeigth && this.f2.weight <= maxWeigth );
    }

    boolean isWin () {
        if (this.f1.health == 0) {
            System.out.println(f2.name + " kazandı !");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(f1.name + " kazandı !");
            return true;
        }
        return false;
    }
    boolean isFirst(){
        Random random = new Random();
        int randomNumber = random.nextInt(2); // 0 veya 1 döndürür
        return randomNumber == 0;

    }
}


