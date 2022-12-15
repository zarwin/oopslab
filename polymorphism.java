public class polymorphism {
    // methord overloading
    class Adder {
    static int add(int a, int b) {
    return a + b;
    }

    static float add(float a, float b, float c) {
    return a + b + c;
    }
    static double add(double a, double b, double c, double d){
    return a + b + c + d;
    }
    }
    // Meth Oevrriding
    // Bank is our Parent class
    static class Bank {
        int getRateOfInterest() {
            return 0;
        }
    }

    // Creating child classes.
    static class SBI extends Bank {
    int getRateOfInterest() {
    return 8;
    }
    }

    static class ICICI extends Bank {
    int getRateOfInterest() {
    return 7;
    }
    }

    static class AXIS extends Bank {
    int getRateOfInterest() {
    return 9;
    }
    }

    public static void main(String[] args) {
        // METHORD OVERLOADING
        System.out.println(Adder.add(10, 20));
        System.out.println(Adder.add(10, 20, 30));
        System.out.println(Adder.add(10.5, 20.5, 30.5, 40.5));
        
        
        // METHORD OVERRIDING
        AXIS axis = new AXIS();
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        System.out.println(sbi.getRateOfInterest());
        System.out.println(axis.getRateOfInterest());
        System.out.println(icici.getRateOfInterest());
    
    }}
