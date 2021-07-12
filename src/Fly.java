

public class Fly {

    // ***** Fly Variables *****
    private double mass = 5;
    private double speed = 10;


    // ***** Main Function *****
    public static void main(String[] args) {

        Fly pepe = new Fly(4.1);
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



}
