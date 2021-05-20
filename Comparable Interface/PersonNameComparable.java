/**
 * @author (Atharva Manjrekar) 
 * @version (1.0)
 */
public class PersonNameComparable implements Comparable<PersonNameComparable>
{
    private String name;
    private int age;
    public PersonNameComparable (String n, int a){
        name = n;
        age = a;
    }

    public String getName(){return name;}

    public int getAge(){return age;}

    public boolean equals (PersonNameComparable other)
    {	
        return this.getName() == other.getName();
    }

    public int compareTo(PersonNameComparable other)
    {           
        if (getName().compareTo(other.getName()) > 0)
        {
            return 1;
        }
        else if (getName().compareTo(other.getName()) < 0)
        {
            return -1;
        }
        else 
        {
            return 0;
        }
    }

    public String toString()
    {
        return "Name: " +getName()+ " = Age: " + getAge();
    }
}