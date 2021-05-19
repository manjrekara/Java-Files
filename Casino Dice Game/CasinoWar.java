/**
 * @author (Atharva Manjrekar) 
 * @version (11/6/15)
 */
import java.util.Random;
import java.util.Scanner;
public class CasinoWar
{
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    public void roll()
    {
        int player1Score=0; int player2Score=0;//Both players start with 0 points
        int counter=0; //Used to store the vlaue of Player2
        System.out.println("Start the game; 1 = Yes: ");
        int input = scanner.nextInt();
        while (input == 1){//Starts the game when the user presses 1
            int player1 = (int)(Math.random()*12);//Player1 rolls 2 6 sided dies which mean a total of 12 sides 
            int player2 = (int)(Math.random()*12);//Player2 rolls 2 6 sided dies which mean a total of 12 sides 
            if (player1 > player2){
                System.out.println("Player1 rolled "+player1+"");
                System.out.println("Player2 rolled "+player2+"");
                System.out.println("Player1 wins this round"+'\n');
                player1Score ++;//Adds a point
                System.out.println("Player1 Score is " +player1Score+"");  
                System.out.println("Player2 Score is " +player2Score+'\n');
            }
            else if (player1 < player2){
                System.out.println("Player1 rolled "+player1+"");
                System.out.println("Player2 rolled "+player2+"");
                System.out.println("Player2 wins this round"+'\n');
                player2Score ++;//Adds a point
                System.out.println("Player1 Score is " +player1Score+"");
                System.out.println("Player2 Score is " +player2Score+'\n');  
            }
            else{
                System.out.println("Player1 rolled "+player1+"");
                System.out.println("Player2 rolled "+player2+"");
                System.out.println("Its a tie");//No point is added
                System.out.println("No Player wins this round!"+'\n');
                System.out.println("Player1 Score is " +player1Score+"");
                System.out.println("Player2 Score is " +player2Score+'\n'); 
            }
            if (player2 == 7){
                counter ++;
            }
            else if (player2 != 7){
                counter = 0;
            }
            if (player1 == 12)//When Player1 rolls a sum of 12, player wins
            {
                System.out.println("Player1 wins!");
                System.exit(0);
            }
            else if (counter == 2)//When the counter has two rolls of 7 it lets Player2 win
            {
                System.out.println("Player2 wins!");
                System.exit(0);
            }
        }
        while (player1Score == 1000){
            if (player2Score < player1Score){
                System.out.println("Player1 wins!");
                int sum = (player2Score-player1Score)/(player1Score)*100;//Percent Error
                System.out.println(sum);
                System.exit(0);
            }
            else if (player2Score == 1000){
                System.out.println("Player2 wins!");
                int sum = (player1Score-player2Score)/(player2Score)*100;//Percent Error
                System.out.println(sum);
                System.exit(0);
            }
            else if (player1Score == player2Score){
                System.out.println("Its a tie!");                
            }
        }
    }
}