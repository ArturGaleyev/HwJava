package HwClass25;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Insurance {

        String insuranceName;
        public Insurance(String insuranceName) {
            this.insuranceName = insuranceName;
        }
        abstract double getQuote();
        abstract void cancelInsurance();
    }
    class Car extends Insurance {
        String carModel;
        public Car(String insuranceName, String carModel){
            super(insuranceName);
            this.carModel = carModel;
        }
        @Override
        double getQuote(){
            return 1435.00;
        }
        @Override
        void cancelInsurance(){
            System.out.println("The insurance of the car "+insuranceName+" is cancelled");
        }
    }
    class Pet extends Insurance{
        String petType;

        public Pet(String insuranceName, String petType) {
            super(insuranceName);
            this.petType = petType;
        }
        @Override
        double getQuote(){
            return 430.99;
        }
        void cancelInsurance(){
            System.out.println("The insurance of the pet "+insuranceName+" is cancelled");
        }
    }
    class Health extends Insurance{
        public Health(String insuranceName) {
            super(insuranceName);
        }
        @Override
        double getQuote(){
            return 400.76;
        }

        @Override
        void cancelInsurance(){
            System.out.println("The insurance of health "+insuranceName+" is cancelled");
        }
    }
    class HW01InsuranceTester{
        public static void main(String [] args){
            List<Insurance> insurance = new ArrayList<>();
            insurance.add(new Car("SafeDrive","Honda"));
            insurance.add(new Pet("SafePet", "Horse"));
            insurance.add(new Health("SafeHealth"));

            //using enhance for loop
            System.out.println("-------------Ehnhance for loop--------------");
            for (Insurance insure:insurance){
                System.out.println(insure.insuranceName);
                System.out.println("Annual quotation is: "+insure.getQuote());
                insure.cancelInsurance();
            }
            //using iterator
            System.out.println("-------------Iterator--------------");
            Iterator<Insurance> insure = insurance.iterator();
            while(insure.hasNext()){
                Insurance i = insure.next();
                System.out.println("Annual quotation is: "+i.getQuote());
                i.cancelInsurance();
            }

        }
    }

