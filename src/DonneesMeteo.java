import java.util.LinkedList;

/**
 * Created by pierre on 03/10/16.
 */
public class DonneesMeteo implements Sujet{
    private double pressionAtmo, humidite, temperature;
    private LinkedList<Observateur> obs;

    public DonneesMeteo() {
        obs = new LinkedList<>();
    }

    public double getPressionAtmo() {
        return pressionAtmo;
    }

    public double getHumidite() {
        return humidite;
    }

    public double getTemperature() {
        return temperature;
    }

    public void addObservateur(Observateur o)
    {
        obs.add(o);
    }

    public void removeObservateur(Observateur o)
    {
        obs.remove(o);
    }

    @Override
    public void notifier()
    {
        for(int i = 0; i < obs.size(); i++)
        {
            Observateur o = obs.get(i);
            o.actualiser(this);
        }
    }

    public void captureDonneesMeteo(double pressionAtmo, double humidite, double temperature)
    {
        this.pressionAtmo = pressionAtmo;
        this.humidite = humidite;
        this.temperature = temperature;
        notifier();
    }

}
