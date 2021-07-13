

public class Fly {

    // ***** Fly Variables *****
    private double mass = 5;
    private double speed = 10;

    //TODO: specify all decimal values to 2 decimal points

    // ***** Main Function *****
    public static void main(String[] args) {

        Fly pepe = new Fly(5);
        Fly joe =  new Fly();
        System.out.println(pepe);
        pepe.grow(10);
        System.out.println(pepe);
        pepe.grow(10);
        System.out.println(pepe);
        pepe.grow(10);
        System.out.println(pepe);
    }

    // ***** Fly Constructors *****
    public Fly(double mass, double speed){
        this.mass = mass;
        this.speed = speed;
    }
    public Fly(double mass){
        this(mass, 10);
    }
    public Fly(){
        this(5, 10);
    }


    // ***** Getters *****
    public double getMass(){
        return this.mass;
    }
    public double getSpeed(){
        return this.speed;
    }

    // ***** Setters *****
    public void setMass(double mass){
        this.mass = mass;
    }
    public void setSpeed(double speed){
        this.speed = speed;
    }

    // ***** Fly Methods *****
    public String toString(){
        if (this.mass == 0){
            return "I'm DEAD but I used to be a fly with a speed of " + String.format("%.2f", speed) + ".";
        } else {
            return "I'm a speedy fly with " + String.format("%.2f", speed) + " speed and " + String.format("%.2f", mass) + " mass.";

        }
    }

    public double grow(int addMass){
        if (mass + addMass < 20){
            speed += addMass;
            return mass += addMass;

        } else if (mass > 20){
            speed -= (addMass * 0.5);
            return mass += addMass;

        } else {
            speed += (20 - mass);
            speed -= (((mass + addMass) - 20) * 0.5);
            return mass += addMass;
        }
    }

    public boolean isDead(){
        if(mass == 0){
            return true;
        } else {
            return false;
        }
    }

}
