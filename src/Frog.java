import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Frog {

    // ***** Frog Variables *****
    private String name;
    private int age = 5; // age in number of months
    private double tongueSpeed = 5;
    private boolean isFroglet; // a Frog is a Froglet is its age > 1 month && age < 7 months. This variable must be changed whenever age changes.
    private static String species = "Rare Pepe"; // must be the same for all instances of Frog
    private double ageInYears = (double) age/12;

    // ***** Frog Constructor *****
    public Frog(String name, int age, double tongueSpeed){
        this.name = name;
        this.age = age;
        this.tongueSpeed = tongueSpeed;
    }

    public Frog(String name){
        this("Luis", 5, 5);
    }

    //public Frog(double ageInYears){
        //this.ageInYears = (double) age/12;
        //this("Bibi",ageInYears, 5);
    //}

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
    public double getAgeInYears() {
        return ageInYears;
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
    public void setAgeInYears(double ageInYears) {
        this.ageInYears = ageInYears;
    }

    // ***** Methods *****
    public int grow(int months){
        if(age > 30){
            tongueSpeed -= months;
            if(tongueSpeed < 5){
                tongueSpeed = 5;
            }
            isFroglet = false;
            return age += months;
        } else if (age > 12){
            if(tongueSpeed < 5){
                tongueSpeed = 5;
            }
            isFroglet = false;
            return age += months;
        } else {
            if((age+months) > 12){
                tongueSpeed += (12 - age);
            } else {
                tongueSpeed += months;
            }
            if(tongueSpeed < 5){
                tongueSpeed = 5;
            }
            age += months;
            if(age > 7){
                isFroglet = false;
            } else {
                isFroglet = true;
            }
            return age;
        }


    }



}
