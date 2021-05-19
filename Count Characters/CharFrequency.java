/**
 * @author (Atharva Manjrekar) 
 * @version (1.0)
 */
import java.io.*;
import java.util.Scanner;
public class CharFrequency 
{
    public static void main(String[] args)throws IOException 
    {
        File file1 = new File("input.txt");
        BufferedReader in = new BufferedReader (new FileReader (file1));

        int nextChar;
        int other = 0;
        char ch;
        int[] count = new int [26];

        while ((nextChar = in.read())!= -1) 
        {
            ch = ((char)nextChar);
            ch = Character.toLowerCase (ch);
            if (ch >= 'a' && ch <= 'z')
                count [ch- 'a']++;
            else
                other ++;
        }

        for (int i=0; i<26; i++)
        {
            System.out.printf ("%c = %d \n", i+ 'A', count [i]);
        }
        System.out.println ("Non-alphabetic characters: " + other);
        in.close ();
    }
}