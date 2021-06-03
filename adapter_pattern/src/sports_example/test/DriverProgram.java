package sports_example.test;

import sports_example.athletes.BaseballAthlete;
import sports_example.athletes.FootballAthlete;
import sports_example.news.SportsNews;

public class DriverProgram
{
    public static void main(String[] args)
    {
        //create a few athletes
        BaseballAthlete bbAthlete1 = new
            BaseballAthlete("Ichiro", "Suzuki");
        BaseballAthlete bbAthlete2 = new
            BaseballAthlete("Bryce", "Harper");
        FootballAthlete fbAthlete1 = new
            FootballAthlete("Tom", 'E', "Brady");
        FootballAthlete fbAthlete2 = new
                FootballAthlete("Adrian", 'L', "Peterson");

        //with stats...
        bbAthlete1.addStat("batting-avg", 0.333);
        bbAthlete1.addStat("homeruns", 10);
        bbAthlete2.addStat("stolen bases", 12);
        fbAthlete1.newStat("completions-per-game", 14);
        fbAthlete1.newStat("touchdowns", 22);
        fbAthlete2.newStat("yards-per-game", 45);

        //report the athletes
        SportsNews news = new SportsNews();
    }
}
