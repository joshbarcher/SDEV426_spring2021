package sports_example.adapters;

import sports_example.athletes.BaseballAthlete;
import sports_example.athletes.IAthlete;

public class BBAdapter implements IAthlete
{
    //store the adaptee
    private BaseballAthlete athlete;

    public BBAdapter(BaseballAthlete athlete)
    {
        this.athlete = athlete;
    }

    @Override
    public String getFullName()
    {
        return athlete.getFirstName() + " " + athlete.getLastName();
    }

    @Override
    public String[] getStats()
    {
        int numStats = athlete.getStatNames().size();
        String[] stats = new String[numStats];

        for (int i = 0; i < numStats; i++)
        {
            String name = athlete.getStatNames().get(i);
            String value = athlete.getStatValues().get(i).toString();

            stats[i] = name + " - " + value;
        }

        return stats;
    }
}
