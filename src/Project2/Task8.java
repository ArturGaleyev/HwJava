package Project2;

public class Task8 {
    /*
Create a Class Car that would have the following fields: price and color, and method calculateSalePrice()
which should be returning a price of the car.

Create 2 subclasses: Sedan and Truck. The Truck class has a field as weight and has its own implementation
of calculateSalePrice() method in which returned price is calculated as following: if weight>2000 then
returned car price should include 10% discount, otherwise 20% discount.

The Sedan class has field as length and also does it its own implementation of calculateSalePrice():
if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
*/

    private double carPrice;
    private String color;

    public Task8(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    public double calculateSalePrice() {
        return carPrice;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Sedan extends Task8 {

    private double length;

    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double calculateSalePrice() {
        if (length > 20) {
            return getCarPrice() * 0.95;
        } else {
            return getCarPrice() * 0.9;
        }
    }
}

class Truck extends Task8 {
    private double weight;

    public Truck(double price, String color, double weight) {
        super(price, color);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double calculateSalePrice() {
        if (weight > 2000) {
            return getCarPrice() * 0.9;
        } else {
            return getCarPrice() * 0.8;
        }
    }
}
class CarTester {

    public static void main(String[] args) {

        Sedan sedan = new Sedan(27000, "red", 15);
        sedan.setCarPrice(45000);
        sedan.setColor("white");
        sedan.setLength(18);
        System.out.println("Sedan with started price " + sedan.getCarPrice() + " and color " + sedan.getColor() + " with length " + sedan.getLength() + ": final price with discount is " + sedan.calculateSalePrice());

        Truck truck = new Truck(70000, "white", 3500);
        truck.setCarPrice(75000);
        truck.setColor("red");
        truck.setWeight(6500);
        System.out.println("Truck with started price " + truck.getCarPrice() + " and color " + truck.getColor() + " with weight " + truck.getWeight() + ": final price with discount is " + truck.calculateSalePrice());


    }
}
