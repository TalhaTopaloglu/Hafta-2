public class Employee {
    String name;    // Nitelikleri tanımlıyoruz.
    double salary;  // Nitelikleri tanımlıyoruz.
    int workHours;  // Nitelikleri tanımlıyoruz.
    int hireYear;   // Nitelikleri tanımlıyoruz.

    Employee(String name, double salary, int workHours,int hireYears ){ // Constructor Metodumuzu oluşturuyoruz.
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYears;
    }

    double tax(){                                // Vergi hesabı yapan fonsiyonu tanımlıyoruz.

        if(this.salary > 1000.0){                // 1000 TL den büyükse %3 vergi hesaplıyoruz.
            double totalTax = this.salary*0.03;  //
            return totalTax;
        }
        else{
            return 0;                            // Değilse 0 olarak dönüyoruz.
        }
    }

    int bonus(){                                    // Bonus hesabı yapan foksiyonu tanımlıyoruz.
        int totalWorkHours= this.workHours - 40;    // 40 saatten büyük olup olmadığını bi değiğşeken tanımlıyoruz.//
        if(totalWorkHours > 0){
            return  totalWorkHours *30;             // Saat başı 30 ile çarpıyoruz.
        }
        else{
            return 0;                               // Eğer 40 saatei geçmediyse boonus vermiyoruz.
        }
    }

    double raiseSalary(){                               // Çalışma yılı hesabı yapan fonksiyonu tanımlıyoruz.
        double totalYear = 2021 -this.hireYear;         // Kaç yıl olduğunu bir değişkene tanımlıyoruz.
        double salaryIncrease;                          // bu değişkene de yapılşacak zamları tanımlıyoruz.
        if(totalYear >= 19){                            // 19 yıl üzeri %15 zam.
            salaryIncrease = this.salary *1.15;
            return salaryIncrease;
        }
        else if(totalYear <19 && totalYear >=10){       //10-19 yıl arası %10 zam.
            salaryIncrease = this.salary * 1.10;
            return salaryIncrease;
        }
        else{
            salaryIncrease = this.salary * 1.05;        //10 yıldan az %5 zam.
            return salaryIncrease;
        }
    }
    public String toString(){                           // son olarak toString ile bir String ifade return ediyoruz.
        return
        "Adı : \t\t\t\t" + this.name + "\n" +
        "Maaşı : \t\t\t" + this.salary + "\n" +
        "Çalışma Saati : \t" + this.workHours + "\n" +
        "Başlangıç Yılı : \t" + this.hireYear + "\n" +
        "Vergi : \t\t\t" + tax() + "\n" +
        "Bonus : \t\t\t" + bonus() + "\n" +
        "Maaş Artışı : \t\t" + (raiseSalary()-this.salary) + "\n" +                             // maaş artışı için zamdan önceki maaşı çıkartıyoruyz.
        "Vergi ve Bonuslar ile birlikte maaş : \t" + (this.salary + bonus() -tax()) + "\n" +    // zamsız toplam maaş için bonusu toplayıp vergiyi çıkartıyoruz.
        "Toplam maaş : \t\t" + ((bonus() -tax() + raiseSalary())) + "\n";                       // tüm maaşı hesaplıyoruz.
    }
    }

