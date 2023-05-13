package HwClass14;

public class Task2 {
     /*
    Create a method createEmail(). Based on values of users firstName, lastName and email type,
     your method should return complete email Address.
     Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
     */


    String Email(String firstName,
                       String lastName,
                       String emailType){

        String Email=firstName.toLowerCase()+lastName.toLowerCase()+"@"+emailType.toLowerCase()+".com";
        return Email;
    }
    public static void main(String[] args) {
        Task2 obj = new Task2();
        String result= obj.Email("Artur","Galeyev","gmail");
        System.out.println(result);

    }

}
