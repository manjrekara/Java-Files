/**
 * @author (Atharva Manjrekar) 
 * @version (1.0)
 */
public class Driver
{
    public static void main()
    {
        Dog bob = new Dog("Bob", Size.LARGE, "Woof");
        Cat amy  = new Cat("Amy", Size.MEDIUM, "Meow");
        Crow sam = new Crow("Sam", Size.SMALL, "Kaaww");
        Lion max = new Lion("Max", Size.LARGE, "Rawr");
        Elephant tim = new Elephant("Tim", Size.XL, "Bruuhh!");

        System.out.println("amy size "+amy.getSize()+"");
        System.out.println("bob size "+bob.getSize()+"");
        System.out.println("sam size "+sam.getSize()+"");
        System.out.println("max size "+max.getSize()+"");
        System.out.println("tim size "+tim.getSize()+"\n\n");

        System.out.println(""+amy.speak()+"");
        amy.chase(sam, tim);
        amy.jump(bob);

        System.out.println(""+bob.speak()+"");
        bob.chase(sam, max);
        bob.jump(tim);

        System.out.println(""+sam.speak()+"");
        sam.chase(bob, tim);
        sam.jump(bob);

        System.out.println(""+max.speak()+"");
        max.chase(sam);
        max.chase(sam, tim);
        max.jump(bob);

        System.out.println(""+tim.speak()+"");
        tim.chase(sam);
        tim.chase(sam, bob);
        tim.jump(bob);

        amy.chase(amy);
        amy.chase(bob);
        amy.chase(sam);
        amy.chase(max);
        amy.chase(tim);

        bob.chase(amy);
        bob.chase(bob);
        bob.chase(sam);
        bob.chase(max);
        bob.chase(tim);

        sam.chase(amy);
        sam.chase(bob);
        sam.chase(sam);
        sam.chase(max);
        sam.chase(tim);

        max.chase(amy);
        max.chase(bob);
        max.chase(sam);
        max.chase(max);
        max.chase(tim);

        tim.chase(amy);
        tim.chase(bob);
        tim.chase(sam);
        tim.chase(max);
        tim.chase(tim);
    }
}
