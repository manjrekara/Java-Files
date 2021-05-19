/**
 * @author (Atharva Manjrekar) 
 * @version (3/16/16)
 */
import java.util.*;
import java.io.*;
public class XCMeet
{
    ArrayList<Runner> runners;      // runners who enter a race
    ArrayList<Runner> finishers;    // runners who finish the race
    ArrayList<XCTeam> teams;        // every runner belongs to a team.  A solo runner would simple have a team with only one runner

    ArrayList<Runner> soloRunners;
    ArrayList<Runner> teamRunners;
    ArrayList<XCTeam> eligibleTeams;

    public static void main() throws IOException
    {
        XCMeet meet = new XCMeet();

        meet.race();        // simulate running the race
        meet.score();       // score the meet

        // print overall individual results
        meet.printResults();

        System.out.println("");
        // print team results
    }

    public XCMeet() throws FileNotFoundException
    {
        runners = new ArrayList<Runner>(60);
        finishers = new ArrayList<Runner>(60);
        teams = new ArrayList<XCTeam>(20);

        soloRunners = new ArrayList<>();
        teamRunners = new ArrayList<>();
        eligibleTeams = new ArrayList<>();

        getRunners();       // import data
    }

    public void getRunners() throws FileNotFoundException
    {
        Scanner scTxt = new Scanner(new File("RegisteredRunners.txt"), "ISO-8859-1");

        do
        {
            String s = scTxt.next();    // school/team
            String fn = scTxt.next();   // first name
            String ln = scTxt.next();   // last name
            int bib = Integer.parseInt(scTxt.next());       // convert String into an int
            int grade = Integer.parseInt(scTxt.next());

            runners.add(new Runner(s, fn + " " + ln, bib, grade));  // make a new runner and add to the set of all registered runners

        }while(scTxt.hasNext());
    }

    public void printResults()
    {
        System.out.println("Athlete\t\t\t\tRank\t\t\tScore");
        for (Runner r : finishers)
        {
            r.setPlace(finishers.indexOf(r));
            int i = 0;
            boolean isSolo = false;

            for (Runner r1 : soloRunners)
            {
                if (r1.getName().equals(r.getName()))
                {
                    isSolo = true;
                }
            }

            if (isSolo == false)
            {

                for (Runner r2 : teamRunners)
                {
                    if (r2.getName().equals(r.getName()))
                    {
                        i = teamRunners.indexOf(r2) + 1;
                        r2.setTeamScore(i);
                    }
                }
            }

            if(r.getName().length() > 15) 
            {
                System.out.println(""+r.getName()+"\t\t"+(r.getPlace() + 1)+"\t\t\t"+i+"\t\t\t"+r.getTeam());
            }
            else
                System.out.println(""+r.getName()+"\t\t\t"+(r.getPlace() + 1)+"\t\t\t"+i+"\t\t\t"+r.getTeam());
        }

        for (XCTeam t : eligibleTeams)
        {
            for (Runner r : teamRunners)
            {
                if (t.getRunners().subList(0, 5).contains(r))
                {
                    t.setTeamScore(t.getTeamScore() + r.getTeamScore());
                }
            }
        }

        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        Collections.sort(eligibleTeams, XCTeam.XCTeamScoreComparator);

        for (XCTeam t : eligibleTeams)
        {
            t.setTeamPlace(eligibleTeams.indexOf(t) + 1);
        }

        System.out.println("School Name\t\t\tRank\t\t\tScore");

        for (XCTeam t : eligibleTeams)
        {
            if(t.getName().length() > 7) 
                System.out.println(""+t.getName()+"\t\t\t"+t.getTeamPlace() + "\t\t\t" + t.getTeamScore());
            else
                System.out.println(""+t.getName()+"\t\t\t\t"+t.getTeamPlace() + "\t\t\t" + t.getTeamScore());
        }
    }

    public void race()
    {
        for(int i = 1; runners.size()>0; i++)
        {
            int num = (int) (Math.random()*runners.size());
            runners.get(num).setPlace(i);
            finishers.add(runners.remove(num));
        }
    }

    public void score()    
    {
        for (Runner r : finishers)
        {
            XCTeam team = null;
            for (XCTeam t : teams)
            {
                if (t.getName().equals(r.getTeam()))
                {
                    t.addTeamMember(r);
                    team = t;
                }
            }
            if (team == null)
            {
                XCTeam newTeam = new XCTeam(r.getTeam(), new ArrayList<Runner>());
                newTeam.addTeamMember(r);
                teams.add(newTeam);
            }
        }

        for (Runner r : finishers)
        {
            XCTeam team = null;
            for (XCTeam t : teams)
            {
                if (t.getName().equals(r.getTeam()))
                {
                    team = t;
                }
            }
            if (team != null) 
            {
                if (team.getRunners().size() < 5 )
                {
                    soloRunners.add(r);
                }
            }
        }

        teamRunners = (ArrayList<Runner>) finishers.clone();
        for (Runner r : soloRunners)
        {
            if (teamRunners.contains(r))
            {
                teamRunners.remove(r);
            }
        }

        for (Runner r : teamRunners)
        {
            r.setTeamPlace(teamRunners.indexOf(r) + 1);
        }

        // calculate team points for eligible teams using the top 5 runners

        for (Runner r : teamRunners)
        {
            XCTeam team = null;
            for (XCTeam t : teams)
            {
                if (t.getName().equals(r.getTeam()) && !eligibleTeams.contains(t))
                {
                    eligibleTeams.add(t);
                }
            }
        }
    }
}