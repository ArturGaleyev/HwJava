package HwClass17;

public class Students {

        /* Write a java Class Students that have a constructor which takes students name and 3 subject grades.
         Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different
         students with different marks. Your program should print an average mark of each students name.*/
        String name;
        int subject1;
        int subject2;
        int subject3;

        public Students(String name, int subject1, int subject2, int subject3) {
            this.name = name;
            this.subject1 = subject1;
            this.subject2 = subject2;
            this.subject3 = subject3;
            System.out.println(name+" has an average grade "+calAverage());
        }
        int calAverage(){
            return (subject1+subject2+subject3)/3;
        }

    }

