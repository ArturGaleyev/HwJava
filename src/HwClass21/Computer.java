package HwClass21;

public class Computer {

//Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
//Define common behavior within and some fields in parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Create objects of child classes and store them into array. Loop through each object and execute available methods.


    String name;
    int price;
    String edition;
    double RAM;

    public Computer(String name, int price, String edition , double RAM){
        this.name=name;
        this.price=price;
        this.edition=edition;
        this.RAM=RAM;
    }

    public void printInfo(){
        System.out.println(name + " " + price +" " + edition + " " + RAM);
    }

    void start(){
        System.out.println(" To start the computer it should pe plugged in");
    }
    void speed(){
        System.out.println("Delete all junk files from Computer to get high speed");
    }
    void close(){
        System.out.println(" Before Shut Down all windows should be closed");
    }
}
class Apple extends Computer {
    public Apple(String name, int price, String edition, double RAM) {
        super(name, price, edition, RAM);
    }

    @Override
    void start(){
        System.out.println("Starting Apple by  using different startup method");
    }
    @Override
    void speed(){
        System.out.println("checking the speed with use of Activity Monitor");
    }
    @Override
    void close(){
        System.out.println("After shutting down computer is not showing power light");
    }

    void upgrade(){
        System.out.println("It's getting hard to upgrade Apple computer because of storage drive");
    }
}
class Dell extends Computer{

    public Dell(String name, int price, String edition, double RAM) {
        super(name, price, edition, RAM);
    }


    @Override
    void start(){
        System.out.println("To start the Dell press the button beneath the screen");
    }
    @Override
    void speed(){
        System.out.println("We are checking the speed through Performance tool");
    }
    @Override
    void close(){
        System.out.println("shutting down after updating the computer");

    }

    void graphics(){
        System.out.println("computer is showing graphic processor needs to update new version");
    }
}
class HP extends Computer{
    public HP(String name, int price, String edition, double RAM) {
        super(name, price, edition, RAM);
    }

    @Override
    void start(){
        System.out.println("Starting Computer when plugged in");
    }
    @Override
    void speed(){
        System.out.println("We can check the speed of Lenovo by 5 different ways");
    }
    @Override
    void close(){
        System.out.println("going to close it by pressing only ALT+f4 together");

    }

    void security(){
        System.out.println("HP computer keeps showing security updates from last 2 days");
    }
}
class Lenovo extends Computer{
    public Lenovo(String name, int price,String edition, double RAM){
        super(name,price,edition,RAM);
    }

    @Override
    void start(){
        System.out.println("Starting Lenovo by using power button which is on the side panel");
    }
    @Override
    void speed(){
        System.out.println("checking the speed of Lenovo by 5 different ways");
    }
    @Override
    void close(){
        System.out.println("After shutting down computer it shows power light for few seconds");
    }

    void power(){
        System.out.println("Lenovo showing it has best power consumption function");
    }

}
class ComputerTester {
    public static void main(String[] args) {
        Computer [] computer ={ new Apple("Mac",1500,"2",24.00),
                new Lenovo("Legion",1200,"X Series",32),
                new HP("Pavilion",1250,"Elite",32),
                new Dell("Dell G15",1300,"XPS",64)

        };

        for(Computer laptop : computer){

            if(laptop instanceof Apple){
                ((Apple)laptop).upgrade();
            }else if (laptop instanceof Lenovo){
                ((Lenovo)laptop).power();
            }else if (laptop instanceof HP){
                ((HP)laptop).security();
            } else if (laptop instanceof Dell) {
                ((Dell)laptop).graphics();
            }

            laptop.start();
            laptop.speed();
            laptop.close();
        }
    }
}

