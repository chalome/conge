
package Modeles;

public class DemandeConge {
    private int demandeID;
    private String demandeEmploye;
    private String demandeDateDebut;
    private String demandeDateFin;
    private int demandeJours;
    private String demandeMotif;

    public DemandeConge(String demandeEmploye, String demandeDateDebut, String demandeDateFin, int demandeJours, String demandeMotif) {
        this.demandeEmploye = demandeEmploye;
        this.demandeDateDebut = demandeDateDebut;
        this.demandeDateFin = demandeDateFin;
        this.demandeJours = demandeJours;
        this.demandeMotif = demandeMotif;
    }

    public DemandeConge() {
    }

    public DemandeConge(int demandeID) {
        this.demandeID = demandeID;
    }

    public DemandeConge(int demandeID, String demandeEmploye, String demandeDateDebut, String demandeDateFin, int demandeJours, String demandeMotif) {
        this.demandeID = demandeID;
        this.demandeEmploye = demandeEmploye;
        this.demandeDateDebut = demandeDateDebut;
        this.demandeDateFin = demandeDateFin;
        this.demandeJours = demandeJours;
        this.demandeMotif = demandeMotif;
    }

    public int getDemandeID() {
        return demandeID;
    }

    public void setDemandeID(int demandeID) {
        this.demandeID = demandeID;
    }

    public String getDemandeEmploye() {
        return demandeEmploye;
    }

    public void setDemandeEmploye(String demandeEmploye) {
        this.demandeEmploye = demandeEmploye;
    }

    public String getDemandeDateDebut() {
        return demandeDateDebut;
    }

    public void setDemandeDateDebut(String demandeDateDebut) {
        this.demandeDateDebut = demandeDateDebut;
    }

    public String getDemandeDateFin() {
        return demandeDateFin;
    }

    public void setDemandeDateFin(String demandeDateFin) {
        this.demandeDateFin = demandeDateFin;
    }

    public int getDemandeJours() {
        return demandeJours;
    }

    public void setDemandeJours(int demandeJours) {
        this.demandeJours = demandeJours;
    }

    public String getDemandeMotif() {
        return demandeMotif;
    }

    public void setDemandeMotif(String demandeMotif) {
        this.demandeMotif = demandeMotif;
    }
    
}
