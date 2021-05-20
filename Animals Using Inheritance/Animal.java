/**
 * @author (Atharva Manjrekar) 
 * @version (1.0)
 */
public interface Animal
{
    public String toString();

    public String speak();

    public void chase(Animal a);

    public void chase(Animal a, Animal b);

    public void jump(Animal a);

    public boolean canJump();

    public Size getSize();

    public String getName();

    public String getType();
}
