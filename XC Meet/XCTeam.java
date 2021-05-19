/**
 * @author (Atharva Manjrekar) 
 * @version (3/16/16)
 */
import java.util.*;
public class XCTeam
{
    String name;
    ArrayList<Runner> runners;
    int score; int place;//to calc the team score and team place

    public XCTeam(String name, ArrayList<Runner> runners)
    {
        this.name = name;
        this.runners = runners;
        score = 0;//starts with 0
        place = 0;//starts with 0
    }

    public ArrayList<Runner> getRunners()
    {
        return runners;
    }

    public String getName()
    {
        return name;
    }

    public int getScore()
    {
        return score;
    }

    public int getTeamScore()
    {
        return score;
    }

    public int setTeamScore(int i)
    {
        score = i;
        return score;
    }

    public int getTeamPlace()
    {
        return place;
    }

    public int setTeamPlace(int i)
    {
        place = i;
        return place;
    }

    public void addTeamMember(Runner r)
    {
        runners.add(r);
    }

        public static Comparator<XCTeam> XCTeamScoreComparator = new Comparator<XCTeam>()
        {
            public int compare(XCTeam p1, XCTeam p2) 
            {
                int XCTeamNum1 = p1.getScore();
                int XCTeamNum2 = p2.getScore();
                return XCTeamNum1-XCTeamNum2;   
            }
        };

    public String toString()
    {
        return "Team Name: "+name+"\n Runners: "+runners+"\n Score: "+score+"\n Place:"+place+"\n";
    }
}