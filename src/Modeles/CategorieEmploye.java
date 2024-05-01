package Modeles;

public class CategorieEmploye {

    private int typeEmployeID;
    private String typeEmploye;

    public CategorieEmploye() {
    }

    public CategorieEmploye(int TypeEmployeID, String typeEmploye) {
        this.typeEmployeID = TypeEmployeID;
        this.typeEmploye = typeEmploye;
    }

    public CategorieEmploye(String typeEmploye) {
        this.typeEmploye = typeEmploye;
    }

    public int getTypeEmployeID() {
        return typeEmployeID;
    }

    public void setTypeEmployeID(int TypeEmployeID) {
        this.typeEmployeID = TypeEmployeID;
    }

    public String getTypeEmploye() {
        return typeEmploye;
    }

    public void setTypeEmploye(String typeEmploye) {
        this.typeEmploye = typeEmploye;
    }

    @Override
    public String toString() {
        return typeEmploye;
    }

}
