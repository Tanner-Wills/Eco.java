

public class Fly {

    // ***** Fly Variables *****
    private double mass;
    private double speed;

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
        Fly myFly1 = new Fly();
        Fly myFly2 = new Fly(12, 12);
        System.out.println(myFly1.toString());
        System.out.println(myFly2.toString());
    }

    // ***** Fly Constructors *****

    public Fly(){
        this(5, 10);
    }
    public Fly(double mass){
        this(mass, 10);
    }
    public Fly(double mass, double speed){
        this.mass = mass;
        this.speed = speed;
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

    // ***** Fly Methods Override *****
    public String toString(){
        if (this.mass == 0){
            return "I'm DEAD but I used to be a fly with a speed of " + String.format("%.2f", speed) + ".";
        } else {
            return "I'm a speedy fly with " + String.format("%.2f", speed) + " speed and " + String.format("%.2f", mass) + " mass.";

        }
    }

    // ***** Fly Methods *****
    public void grow(int addMass){
        if (this.mass + addMass < 20){
            this.speed += addMass;

        } else if (mass > 20){
            this.speed -= (addMass * 0.5);

        } else {
            this.speed += (20 - this.mass);
            this.speed -= (((this.mass + addMass) - 20) * 0.5);
        }
        this.mass += addMass;
    }

    public boolean isDead(){
        if(this.mass == 0){
            return true;
        } else {
            return false;
        }
    }

}
