package HwClass26;

import java.util.TreeMap;

public class Person {
    private String name, lastName;
    private int age, salary;
    public Person(String name, String lastName, int age, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    @Override
    public String toString(){
        String output = "The person's full name is: "+name+" "+lastName+". He is "+age+" years old and he has "+salary+" salary.";
        return output;
    }
}
class PersonTester{
    public static void main(String [] args){
        var person = new TreeMap<>();
        person.put(1, new Person("John","G",31,120000));
        person.put(2, new Person("Andy","D",28,125000));
        person.put(3, new Person("Adam","J",37,150000));
        person.put(4, new Person("Juan","C",45,135000));

        for(var per:person.entrySet()){
            System.out.println(per.getKey()+" "+per.getValue());
        }


    }
}
