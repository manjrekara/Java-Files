/** 
 * @author (Atharva Manjrekar) 
 * @version (1.0)
 */
import java.util.Scanner;
public class Bill 
{
    public static void main() 
    {
        Item Chicken = new Item("Chicken");
        Chicken.itemDescription = ("Roasted Chicken with our authentic herbs and spices");
        Chicken.price = 25;
        Item Fish = new Item("Fish");
        Fish.itemDescription = ("Roasted Fish with our authentic herbs and spices");
        Fish.price = 30;
        Item Pizza = new Item("Pizza");
        Pizza.itemDescription = ("Peperoni Pizza with our authentic herbs and spices");
        Pizza.price = 35;
        Item Nachos = new Item("Nachos");
        Nachos.itemDescription = ("Spicy Nachos with our authentic herbs and spices");
        Nachos.price = 40;

        int choice = 0;
        double refund = 0;
        double money = 0;
        double tax = 0.0635; 
        double tip = 0.15; 
        double total; 

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Choose your meal: ");
        System.out.println("1 = Chicken: $25");
        System.out.println("2 = Fish: $30");
        System.out.println("3 = Pizza: $35");
        System.out.println("4 = Nachos: $40");
        choice = keyboard.nextInt();
        if (choice < 1 || choice > 4)
        {
            System.out.println("Invalid input provided!");
        }
        if (choice == 1)
        {
            System.out.println("You have chosen " +Chicken.itemDescription+ " for $" +Chicken.price+ "");
            System.out.println("Enter your price: ");
            money = keyboard.nextInt();
            if (money == 25)
            {
                tax = money * tax;
                tip = money * tip;
                total = money + tax + tip;
                total = Math.round(total * 100.0) / 100.0;
                System.out.println("Meal Charge: $" + money);
                System.out.println("Tax:         $" + tax);
                System.out.println("Tip:         $" + tip);
                System.out.println("Total:       $" + total);
                
            }
            if (money > 25)
            {
                tax = 25 * tax;
                tip = 25 * tip;
                total = 25 + tax + tip;
                total = Math.round(total * 100.0) / 100.0;
                refund = money - total;
                refund = Math.round(refund * 100.0) / 100.0;
                System.out.println("Meal Charge: $" + 25);
                System.out.println("Tax:         $" + tax);
                System.out.println("Tip:         $" + tip);
                System.out.println("Total:       $" + total);
                System.out.println("Refund:      $" + refund);
                
            }
            if (money < 25)
            {
                refund = 25 - money;
                System.out.println("You need: " +refund+ " more to buy our Chicken (exclusing taxes/tip).");
                System.out.println("Try again next time!");
                
            }
        }
        if (choice == 2)
        {
            System.out.println("You have chosen " +Fish.itemDescription+ " for $" +Fish.price+ "");
            System.out.println("Enter your price: ");
            money = keyboard.nextInt();
            if (money == 30)
            {
                tax = money * tax;
                tip = money * tip;
                total = money + tax + tip;
                total = Math.round(total * 100.0) / 100.0;
                System.out.println("Meal Charge: $" + money);
                System.out.println("Tax:         $" + tax);
                System.out.println("Tip:         $" + tip);
                System.out.println("Total:       $" + total);
                keyboard.close();
            }
            if (money > 30)
            {
                tax = 30 * tax;
                tip = 30 * tip;
                total = 30 + tax + tip;
                total = Math.round(total * 100.0) / 100.0;
                refund = money - total;
                refund = Math.round(refund * 100.0) / 100.0;
                System.out.println("Meal Charge: $" + 30);
                System.out.println("Tax:         $" + tax);
                System.out.println("Tip:         $" + tip);
                System.out.println("Total:       $" + total);
                System.out.println("Refund:      $" + refund);
            }
            if (money < 30)
            {
                refund = 30 - money;
                System.out.println("You need: " +refund+ " more to buy our Fish.");
                System.out.println("Try again next time!");
            }
        }
        if (choice == 3)
        {
            System.out.println("You have chosen " +Pizza.itemDescription+ " for $" +Pizza.price+ "");
            System.out.println("Enter your price: ");
            money = keyboard.nextInt();
            if (money == 35)
            {
                tax = money * tax;
                tip = money * tip;
                total = money + tax + tip;
                total = Math.round(total * 100.0) / 100.0;
                System.out.println("Meal Charge: $" + money);
                System.out.println("Tax:         $" + tax);
                System.out.println("Tip:         $" + tip);
                System.out.println("Total:       $" + total);
                keyboard.close();
            }
            if (money > 35)
            {
                tax = 35 * tax;
                tip = 35 * tip;
                total = 35 + tax + tip;
                total = Math.round(total * 100.0) / 100.0;
                refund = money - total;
                refund = Math.round(refund * 100.0) / 100.0;
                System.out.println("Meal Charge: $" + 35);
                System.out.println("Tax:         $" + tax);
                System.out.println("Tip:         $" + tip);
                System.out.println("Total:       $" + total);
                System.out.println("Refund:      $" + refund);
            }
            if (money < 35)
            {
                refund = 35 - money;
                System.out.println("You need: " +refund+ " more to buy our Pizza.");
                System.out.println("Try again next time!");
            }
        }
        if (choice == 4)
        {
            System.out.println("You have chosen " +Nachos.itemDescription+ " for $" +Nachos.price+ "");
            System.out.println("Enter your price: ");
            money = keyboard.nextInt();
            if (money == 40)
            {
                tax = money * tax;
                tip = money * tip;
                total = money + tax + tip;
                total = Math.round(total * 100.0) / 100.0;
                System.out.println("Meal Charge: $" + money);
                System.out.println("Tax:         $" + tax);
                System.out.println("Tip:         $" + tip);
                System.out.println("Total:       $" + total);
                keyboard.close();
            }
            if (money > 40)
            {
                tax = 40 * tax;
                tip = 40 * tip;
                total = 40 + tax + tip;
                total = Math.round(total * 100.0) / 100.0;
                refund = money - total;
                refund = Math.round(refund * 100.0) / 100.0;
                System.out.println("Meal Charge: $" + 40);
                System.out.println("Tax:         $" + tax);
                System.out.println("Tip:         $" + tip);
                System.out.println("Total:       $" + total);
                System.out.println("Refund:      $" + refund);
            }
            if (money < 40)
            {
                refund = 40 - money;
                System.out.println("You need: " +refund+ " more to buy our Nachos.");
                System.out.println("Try again next time!");
            }
        }
        }
    }