/** 
 * @author (Atharva Manjrekar) 
 * @version (1.0)
 */
public class Item
{
    String item;
    String itemDescription;
    double price;

    public Item (String item)
    {
        this.item = item;
    }

    public String itemDescription()
    {
        return itemDescription;
    }

    public double price()
    {
        return price;
    }

    public void itemPrice (double price)
    {
        this.price = price;     
    }        
}
