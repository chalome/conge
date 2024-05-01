package Interfaces;

import Modeles.Approbation;
import java.util.List;

public interface Iapprobation {

    public int create(Approbation approbation);

    public int update(Approbation approbation);

    public int delete(Approbation approbation);

    public List<Approbation> afficherApprobations();
}
