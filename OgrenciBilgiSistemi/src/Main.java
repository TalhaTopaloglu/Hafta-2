public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut","043423123","TRH");
        Teacher t2 = new Teacher("Ergin","Aslan","FZK");
        Teacher t3 = new Teacher("Külyutmaz","123","BIO");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik","101","FZK");
        fizik.addTeacher(t2);
        Course biyoloji = new Course("Biyoloji","101","BIO");
        biyoloji.addTeacher(t3);

        Student s1 = new Student("İnek Şaban","123","4",tarih,fizik,biyoloji);
        s1.addBulkExamNote(100,50,82);
        s1.addBulkQuizNote(100,90,34);
        s1.printNote();

    }
}