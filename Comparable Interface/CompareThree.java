/**
 * @author (Atharva Manjrekar) 
 * @version (1.0)
 */
public class CompareThree
{
    public static Comparable maxOfThree(Comparable s1, Comparable s2, Comparable s3)
    {
        Comparable max = s1;
        if(s2.compareTo(max)>0)
            max=s2;
        if(s3.compareTo(max)>0)
            max=s3;
        return max;
    }

    public static Comparable minOfThree(Comparable s1, Comparable s2, Comparable s3)
    {
        Comparable min = s1;
        if(s2.compareTo(min)<0)
            min=s2;
        if(s3.compareTo(min)<0)
            min=s3;
        return min;
    }
}
