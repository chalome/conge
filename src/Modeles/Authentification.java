
package Modeles;

public class Authentification {
    private int userID;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
    private String utilisateur;
    private String motDePasse;

    public Authentification(String utilisateur, String motDePasse) {
        this.utilisateur = utilisateur;
        this.motDePasse = motDePasse;
    }

    public Authentification(int userID, String utilisateur, String motDePasse) {
        this.userID = userID;
        this.utilisateur = utilisateur;
        this.motDePasse = motDePasse;
    }

    public Authentification() {
    }

    public String getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(String utilisateur) {
        this.utilisateur = utilisateur;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
    
}
