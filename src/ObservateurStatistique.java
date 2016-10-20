/**
 * Created by pierre on 03/10/16.
 */
public class ObservateurStatistique implements Observateur {

    private double moyTemp, moyPression, moyHumidite;
    private int cpt = 0;

    @Override
    public void actualiser(Sujet s) {
        cpt++;
        DonneesMeteo dm = (DonneesMeteo)s;
        moyHumidite += dm.getHumidite();
        moyPression += dm.getPressionAtmo();
        moyTemp += dm.getTemperature();

        System.out.println("Moyenne Température : " + moyTemp/cpt + '\n'
        + "Moyenne Pression : " + moyPression/cpt + '\n' +
        "Moyenne Humidité : " + moyHumidite/cpt);
    }
}
