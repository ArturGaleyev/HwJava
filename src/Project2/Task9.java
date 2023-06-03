package Project2;
/*
Task 9:

Create Registration Class in which you would have variables as
email, userName and password that have an access scope only
within its own class.

After creating an object of the class user should
be able to call methods and in each method separately pass values
to set users email, username and password.

Requirements:

A. Valid email consider to be only yahoo
B. Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also, valid password cannot contain
userName.
*/

public class Task9 {
    private String email;
    private String userName;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void Email() {
        if (this.email.endsWith("@yahoo.com")){
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email. Only Yahoo emails are allowed");
        }
    }

    public void userName() {
        if (userName != null && userName.length() > 6) {
            this.userName = userName;
            System.out.println("Valid Username");
        } else {
            System.out.println("Invalid Username. It can`t be empty & must be longer than 6 characters");
        }
    }

    public void password() {
        if (this.password != null && this.password.length() > 6 && !this.password.contains(userName)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password. It can`t be empty, should be longer than 6 characters, and can`t contain the Username");
        }
    }


}
class RegTester {
    public static void main(String[] args) {

        Task9 registration = new Task9();
        registration.setEmail("ArturGaleyev@yahoo.com");
        registration.setUserName("ArturGal");
        registration.setPassword("Pass@1234");

        registration.Email();
        registration.userName();
        registration.password();


    }
}
