/**
 * Created by pierre on 03/10/16.
 */
public class testClass {

    public static void main(String[] args) {
        DonneesMeteo dm = new DonneesMeteo();
        dm.addObservateur(new ObservateurAffichageClassique());
        dm.addObservateur(new ObservateurStatistique());
        dm.captureDonneesMeteo(42.1,57.1,24.6);
        dm.captureDonneesMeteo(24.1, 32.8,20.6);
        dm.notifier();
    }

}
