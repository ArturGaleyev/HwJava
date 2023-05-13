package HwClass14;

public class task1 {
    void hello (String country) {
        switch (country) {
            case "USA":
                System.out.println("Hello");
                break;
            case "Mexico":
                System.out.println("Hola");
                break;
            case "Russian":
                System.out.println("Привет");
                break;
            case "France":
                System.out.println("Bonjour!");
                break;
            case "China":
                System.out.println("Nǐ hǎo!");
            default:
                System.out.println("I don't know the language in that "+country);
        }
    }

    public static void main(String[] args) {

        task1 language = new task1();
        language.hello("USA");
        language.hello("Mexico");
        language.hello("Russian");
        language.hello("France");
        language.hello("China");



    }
}
