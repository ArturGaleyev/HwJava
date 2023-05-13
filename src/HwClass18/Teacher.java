package HwClass18;

/* Write a Java program called Teacher.
Identify features and 4 behaviour of that Class.
Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher .
Test all 4 classes*/
public class Teacher {
    String name;
    char gender;
    boolean isGraduated;

    void goingWork() {
        System.out.println("work");
    }
    void test () {
        System.out.println("testing the students");
    }
    void FinishDay () {
        System.out.println("Go home");
    }
    void LunchBreak () {
        System.out.println("eat");
    }
}
class ChemistryTeacher extends Teacher{

}
class MathTeacher extends Teacher {

}
class PianoTeacher extends Teacher {

}
class TeacherTester {
    public static void main(String[] args) {
        Teacher teacher= new Teacher();
        MathTeacher mathTeacher = new MathTeacher();
        ChemistryTeacher chemistryTeacher = new ChemistryTeacher();
        PianoTeacher pianoTeacher = new PianoTeacher();

        teacher.test();
        mathTeacher.FinishDay();
        chemistryTeacher.LunchBreak();
        pianoTeacher.goingWork();

    }
}