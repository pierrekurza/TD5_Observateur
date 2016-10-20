/**
 * Created by pierre on 03/10/16.
 */
public class ObservateurAffichageClassique implements Observateur {

    @Override
    public void actualiser(Sujet s) {
        DonneesMeteo d = (DonneesMeteo)s;
        System.out.println("Humidité : " + d.getHumidite() + '\n' + "Pression : " + d.getPressionAtmo()
                + '\n' + "Température : " + d.getTemperature());

    }
}
