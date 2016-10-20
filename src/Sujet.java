/**
 * Created by pierre on 26/09/16.
 */
public interface Sujet {

    void addObservateur(Observateur o);
    void removeObservateur(Observateur o);
    void notifier();

}
