public class Pond {

    public static void main(String[] args) {

        Frog Peepo = new Frog("Peepo");
        Frog Pepe = new Frog("Pepe", 10, 15);
        Frog Peepaw = new Frog("Peepaw", 4.6, 5);
        Frog Smith = new Frog("Smith", 21, 25);

        Fly f1 = new Fly(1,3);
        Fly f2 = new Fly(6);
        Fly f3 = new Fly();

        Smith.setSpecies("1331 Frogs");         //1
        System.out.println(Peepo.toString());   //2
        Peepo.eat(f2);                          //3
        System.out.println(f2.toString());      //4
        Peepo.grow(8);                   //5
        Peepo.eat(f2);                          //6
        System.out.println(f2.toString());      //7
        System.out.println(Peepo.toString());   //8
        System.out.println(Smith.toString());   //9
        Peepaw.grow(4);                  //10
        System.out.println(Peepaw.toString());  //11
        System.out.println(Pepe.toString());

    }
}
