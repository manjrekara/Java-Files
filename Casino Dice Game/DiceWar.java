/**
 * @author (Atharva Manjrekar) 
 * @version (11/6/15)
 */
import java.util.Random;
import java.util.Scanner;
public class DiceWar
{
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    public void roll()
    {
        int choicePoint; int choiceSide; 
        int player1Score=0; int player2Score=0;//Both players start with 0 points

        System.out.println("Till how many points do you want to play?");
        choicePoint = scanner.nextInt(); //Asks for how many points to play till

        System.out.println("With which sided die would you like to play?");
        System.out.println("Please enter any number >= 4: ");
        choiceSide = scanner.nextInt();//Asks for what die should be used

        while (choiceSide >= 4){//Only works when input for the type of die is >= 4
            int player1 = (int) (Math.random()*choiceSide);//Makes Player1 choose randomly from the type of sided die 
            int player2 = (int) (Math.random()*choiceSide);//Makes Player2 choose randomly from the type of sided die
            if (player1 > player2){
                System.out.println("Player1 rolled "+player1+"");
                System.out.println("Player2 rolled "+player2+"");
                System.out.println("Player1 wins this round"+'\n');
                player1Score ++;//Adds a point
                System.out.println("Player1 Score is " +player1Score+"");  
                System.out.println("Player2 Score is " +player2Score+"");
            }
            else if (player1 < player2){
                System.out.println("Player1 rolled "+player1+"");
                System.out.println("Player2 rolled "+player2+"");
                System.out.println("Player2 wins this round"+'\n');
                player2Score ++;
                System.out.println("Player1 Score is " +player1Score+"");
                System.out.println("Player2 Score is " +player2Score+"");  
            }
            else{
                System.out.println("Player1 rolled "+player1+"");
                System.out.println("Player2 rolled "+player2+"");
                System.out.println("Its a tie");//No point is added
                System.out.println("No Player wins this round!"+'\n');
                System.out.println("Player1 Score is " +player1Score+"");
                System.out.println("Player2 Score is " +player2Score+""); 
            }
            if (player1Score == choicePoint){
                System.out.println("Player1 wins!");
                System.exit(0);
            }
            else if (player2Score == choicePoint){
                System.out.println("Player2 wins!");
                System.exit(0);
            }
            else if (player1Score == player2Score){
                System.out.println("Its a tie!");                
            }
        }
    }
}