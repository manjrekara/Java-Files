/**
 * @author (Atharva Manjrekar) 
 * @version (3/16/16) 
 */
import java.util.*;
public class Runner 
{
    String school;
    String name;
    int bib;
    int grade;
    int overallPlace;
    int overallScore; 

    public Runner(String school, String name, int bib, int grade)
    {
        this.school = school;
        this.name = name;
        this.bib = bib;
        this.grade = grade;
    }

    public void setPlace(int i)
    {
        overallPlace = i;
    }

    public String getName()
    {
        return name;
    }

    public String getTeam()
    {
        return school;
    }

    public int getPlace()
    {
        return overallPlace;
    }

    public String toString()
    {
        return ""+overallPlace+"\t"+school+"\t"+name+"\t"+bib+"\t"+grade+"";
    }

    public int setTeamScore(int i)
    {
        overallScore = i;
        return overallScore;
    }

    public int setTeamPlace(int i)
    {
        i = overallPlace;
        return overallPlace;
    }

    public int getTeamScore()
    {
        return overallScore;
    }

    public static Comparator<Runner> RunnerScoreComparator = new Comparator<Runner>() 
        {
            public int compare(Runner p1, Runner p2) 
            {
                int RunnerNum1 = p1.getPlace();
                int RunnerNum2 = p2.getPlace();
                return RunnerNum1-RunnerNum2;   
            }
        };
}
