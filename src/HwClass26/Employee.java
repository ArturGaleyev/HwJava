package HwClass26;

import java.util.TreeMap;

public class Employee {
    public static void main(String[] args) {

        TreeMap<String, Integer> employee = new TreeMap<>();
        employee.put("Michel",57000);
        employee.put("Juan",62000);
        employee.put("James",45000);
        employee.put("John",110000);

        int highestSalary = 0;
        String highestPaidEmployee="";

        for (var emp: employee.entrySet()){
            if(emp.getValue()>highestSalary){
                highestSalary = emp.getValue();
                highestPaidEmployee = emp.getKey();
            }
        }

        System.out.println(highestPaidEmployee+" "+highestSalary);
    }
}
