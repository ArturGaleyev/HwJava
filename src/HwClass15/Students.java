package HwClass15;

public class Students {


        String name;
        String id;
        static int numberOfStudents;

        public static void main(String[] args) {
            Students studentOne= new Students();
            studentOne.name="Carlos";
            studentOne.id="sA112324";
            Students.numberOfStudents++;

            Students studentTwo= new Students();
            studentTwo.name="Antony";
            studentTwo.id="s35745";
            Students.numberOfStudents++;

            Students studentThree= new Students();
            studentThree.name="Jay";
            studentThree.id="s34443";
            Students.numberOfStudents++;

            System.out.println(Students.numberOfStudents);
        }
}
