package Interfaces;

import Modeles.*;
import java.util.List;

public interface IDemandeConge {

    public int create(DemandeConge demande);

    public int update(DemandeConge demande);

    public int delete(DemandeConge demande);

    public List<DemandeConge> afficherDemandes();

}
