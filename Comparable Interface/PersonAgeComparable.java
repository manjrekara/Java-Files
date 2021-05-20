/**
 * @author (Atharva Manjrekar) 
 * @version (1.0)
 */
public class PersonAgeComparable implements Comparable<PersonAgeComparable>
{
    private String name;
    private int age;
    public PersonAgeComparable (String n, int a){
        name = n;
        age = a;
    }

    public String getName(){return name;}

    public int getAge(){return age;}

    public boolean equals (PersonAgeComparable other)
    {	
        return this.getAge() == other.getAge();
    }

    public int compareTo(PersonAgeComparable other)
    {           
        if (getAge() > other.getAge())
        {
            return 1;
        }
        else if (getAge() < other.getAge())
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