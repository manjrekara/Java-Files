/**
 * Create a program that will output all of the prime numbers between 2 and a provided value, inclusive. While this would be a lot of numbers to check by hand, it takes a computer just a second.
 * @author (Atharva Manjrekar) 
 * @version (3/21/16)
 */
import java.util.Scanner;
public class SieveOfEratosthenes
{
    public static void main() 
    {
        Scanner s = new Scanner(System.in);
        SieveOfEratosthenes sieve = new SieveOfEratosthenes();//object of the class
        System.out.println("Enter a number to find its primes: ");
        int num = s.nextInt();//store the input in int num
        sieve.getPrimes(num);//calls the getPrimes method which would calculates the prime and also displays it        
    }

    static long[] calcPrimes(int max)
    {
        long[] prime = new long[max + 1];
        for (int i = 2; i <= Math.sqrt(max); i++)
        {
            if (prime[i] == 0)
            {
                for (int j = i * i; j <= max; j += i)
                {
                    prime[j] = 1;
                }
            }
        }
        return prime;
    }

    void display(long[] primes)//method which would display the output in a single line
    {
        System.out.print("The primes of integer provided are:\n");
        for (int i = 2; i < primes.length; i++)
        {
            if (primes[i] == 0)
            {
                System.out.print(i +" ");
            }
        }
        System.out.println();
    }

    void getPrimes(int max)
    {
        long[] primes = calcPrimes(max);
        display(primes);
    }


}
