/**
 * @author (Atharva Manjrekar) 
 * @version (11/6/15)
 */
import java.util.Random;
public class Die
{
    static void die()
    {        
        Dice dice = new Dice();
        DiceWar dicewar = new DiceWar();
        CasinoWar casinowar = new CasinoWar();
        int roll = dice.roll();
        int sum = dice.sum();
        int alphabet = dice.alphabet();
        dicewar.roll();
        casinowar.roll();
    }
}