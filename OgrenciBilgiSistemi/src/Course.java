public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int examNote;
    int quizNote;
    double lessonAverage;


    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.examNote = 0;
        this.quizNote = 0;
        this.lessonAverage = 0.0;
    }

    void calcLessonAvarage(){
        this.lessonAverage = (0.2*this.quizNote)+(0.8*this.examNote);
        System.out.println("------------------------------------");
        System.out.println(this.name + " dersinin sınav notu :\t " + this.examNote);
        System.out.println(this.name + " dersinin sözlü notu :\t " + this.quizNote);
        System.out.println("Dersin ortalamsı : " + this.lessonAverage);
        System.out.println("------------------------------------");
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }else{
            System.out.println("Öğretmen ve ders uyuşmuyor.");
        }
    }
    void printTeacherInfo(){
        this.teacher.print();
    }
}
