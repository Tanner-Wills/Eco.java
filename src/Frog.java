import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Frog {

    // ***** Frog Variables *****
    private String name;
    private int age = 5; // age in number of months
    private double tongueSpeed = 5;
    private boolean isFroglet; // a Frog is a Froglet is its age > 1 month && age < months. This variable must be changed whenever age changes.
    private static String species = "Rare Pepe"; // must be the same for all instances of Frog
    private double ageInYears = (double) (age/12);

    // ***** Frog Constructor *****
    public Frog(String name, int age, double tongueSpeed){
        this.name = name;
        this.age = age;
        this.tongueSpeed = tongueSpeed;
    }

    public Frog(String name){
        this("Luis", 5, 5);
    }

    public Frog(double ageInYears){
        this.ageInYears = (double) (age/12);
        this("Bibi", ageInYears, 5);
    }

    // ***** Getters *****
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public double getTongueSpeed(){
        return this.tongueSpeed;
    }
    public boolean getIsFroglet(){
        return this.isFroglet;
    }


    // ***** Setters *****
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setTongueSpeed(double tongueSpeed){
        this.tongueSpeed = tongueSpeed;
    }
    public void setIsFroglet(boolean isFroglet){
        this.isFroglet = isFroglet;
    }

}
