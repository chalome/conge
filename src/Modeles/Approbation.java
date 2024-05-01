
package Modeles;

public class Approbation {
    private int approbationID;
    private int approbationConge;
    private String approbationDate;

    public Approbation() {
    }

    public Approbation(int approbationConge) {
        this.approbationConge = approbationConge;
    }

    public Approbation(int approbationID, int approbationConge, String approbationDate) {
        this.approbationID = approbationID;
        this.approbationConge = approbationConge;
        this.approbationDate = approbationDate;
    }

    public int getApprobationID() {
        return approbationID;
    }

    public void setApprobationID(int approbationID) {
        this.approbationID = approbationID;
    }

    public int getApprobationConge() {
        return approbationConge;
    }

    public void setApprobationConge(int approbationConge) {
        this.approbationConge = approbationConge;
    }
    public String getApprobationDate() {
        return approbationDate;
    }

    public void setApprobationDate(String approbationDate) {
        this.approbationDate = approbationDate;
    }
    
}
