import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Frog {

    // ***** Frog Variables *****
    private String name;
    private int age; // age in number of months
    private double tongueSpeed;
    private boolean isFroglet; // a Frog is a Froglet is its age > 1 month && age < 7 months. This variable must be changed whenever age changes.
    private static String species = "Rare Pepe"; // must be the same for all instances of Frog

    public static void main(String[] args) {
        Frog f1 = new Frog("pong");
        Frog f2 = new Frog("bibi", 12.0, 5.5);
        Frog f3 = new Frog("jones", 3, 10.0);
        System.out.println(f3);
        f3.grow();
        System.out.println(f3);

    }

    // ***** Frog Constructor *****
    public Frog(String name){
        this(name, 5, 5);
    }

    public Frog(String name, double ageInYears, double tongueSpeed){
        this(name, (int) (ageInYears*12), tongueSpeed);
    }

    public Frog(String name, int age, double tongueSpeed){
        this.name = name;
        this.age = age;
        this.tongueSpeed = tongueSpeed;
        if (this.age >= 1 && this.age <7){
            isFroglet = true;
        } else {
            isFroglet = false;
        }
    }


    // ***** Getters *****
    public String getSpecies(){
        return this.species;
    }

    // ***** Setters *****
    public void setSpecies(String species){
        this.species = species;
    }

    // ***** Methods *****
    public void grow(){
        grow(1);
    }

    public void grow(int months){
        if(age > 30){
            tongueSpeed -= months;

        } else if (age >= 12){
            if((age + months) > 30){
                tongueSpeed -= ((age + months) - 30);
            }
        } else {
            if ((age + months) > 12) {
                tongueSpeed += (12 - age);
            } else {
                tongueSpeed += months;
            }
        }
        age += months;
        isFroglet = age <= 7 && age >= 1;
        if (tongueSpeed < 5) {
            tongueSpeed = 5;
        }
    }

    public String toString(){
        if(isFroglet){
            return "My name is " + name + " and I’m a rare froglet. I’m " + age + " months old and my tongue has a speed of " + String.format("%.2f", tongueSpeed) + ".";
        } else {
            return "My name is " + name + " and I’m a rare frog. I’m " + age + " months old and my tongue has a speed of " + String.format("%.2f", tongueSpeed) + ".";
        }
    }

    public void eat(Fly Fly){
        if(Fly.isDead()){
            return;
        }
        //The Fly is caught if tongueSpeed is greater than the speed of the Fly.
        if(Fly.getSpeed() < tongueSpeed){
            if(Fly.getMass() >= age*0.5){
                grow();
            }
            Fly.setMass(0);
        } else {
            Fly.grow(1);
        }
    }

}
