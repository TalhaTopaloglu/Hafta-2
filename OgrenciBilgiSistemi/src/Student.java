public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarange;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.isPass = false;
    }

    void addBulkExamNote(int examNote1, int examNote2, int examNote3) {
        if (examNote1 >= 0 && examNote1 <= 100) {
            this.c1.examNote = examNote1;
        }
        if (examNote2 >= 0 && examNote2 <= 100) {
            this.c2.examNote = examNote2;
        }
        if (examNote2 >= 0 && examNote2 <= 100) {
            this.c3.examNote = examNote3;
        }
    }

    void addBulkQuizNote(int quizNote1, int quizNote2, int quizNote3) {
        if (quizNote1 >= 0 && quizNote1 <= 100) {
            this.c1.quizNote = quizNote1;
        }
        if (quizNote2 >= 0 && quizNote2 <= 100) {
            this.c2.quizNote = quizNote2;
        }
        if (quizNote3 >= 0 && quizNote3 <= 100) {
            this.c3.quizNote = quizNote3;
        }
    }


    void isPass() {
        this.avarange = (this.c1.lessonAverage + this.c2.lessonAverage + this.c3.lessonAverage) / 3.0;
        if (this.avarange > 55) {
            System.out.println("Sınıfı başarılı şekilde geçtiniz.");
        } else {
            System.out.println("Sınıfta kaldınız...");
        }
        System.out.println("Ortalamanız: " + this.avarange);
    }


    void printNote(){
        this.c1.calcLessonAvarage();
        this.c2.calcLessonAvarage();
        this.c3.calcLessonAvarage();
        System.out.println(c1.name + " notu :\t" +c1.lessonAverage);
        System.out.println(c2.name + " notu :\t" +c2.lessonAverage);
        System.out.println(c3.name + " notu :\t" +c3.lessonAverage);
        isPass();
    }
}

