/**
 * @author (Atharva Manjrekar) 
 * @version (11/6/15)
 */
import java.util.Random;
public class Dice
{       
    Random random = new Random();
    static int roll()
    {       
        int roll = (int) (Math.random()*6)+1;
        System.out.println(roll);
        return roll;
    }

    static int sum()
    {       
        int sum = (int) (Math.random()*12)+1;
        System.out.println(sum);
        return sum;
    }

    static int alphabet()
    {       
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int a = alphabet.length();
        int b = (int) (Math.random()*a);
        System.out.println(alphabet.charAt(b));
        return b;
    }
}
