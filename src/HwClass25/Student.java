package HwClass25;

import java.util.Arrays;
import java.util.HashSet;

public class Student {
    private String name;
    private String studentId;
    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }
    public String getName(){
        return name;
    }
    public String getStudentId(){
        return studentId;
    }
}
class StudentTester{
    public static void main(String [] args){
        HashSet<Student> students = new HashSet<>();
        students.addAll(Arrays.asList(new Student("Veronica","4321-11"),
                new Student("James","1231-11"),
                new Student("Alina","4565-11")));
        for(Student student:students){
            System.out.println(student.getName()+" "+student.getStudentId());
        }
    }
}
