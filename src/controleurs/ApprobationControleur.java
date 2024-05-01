package controleurs;

import Interfaces.Iapprobation;
import Modeles.*;
import java.sql.Connection;
import static BDDConnextion.ConnexionBDD.getConnection;
import Interfaces.ICommon;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ApprobationControleur implements Iapprobation, ICommon {

    private Connection connection;
    private PreparedStatement pst;
    private ResultSet res;
    private static final String INSERT = "INSERT INTO approbation(approbationConge) VALUES(?)";
    private static final String UPDATE = "UPDATE approbation SET approbationConge=? WHERE approbationID=?";
    private static final String DELETE = "DELETE FROM approbation WHERE approbationID=?";
    private static final String SELECT_ALL = "SELECT * FROM approbation";

    public ApprobationControleur() {
    }

    @Override
    public int create(Approbation approbation) {
        int ajout = 0;
        connection = getConnection();
        try {
            pst = connection.prepareStatement(INSERT);
            pst.setInt(1, approbation.getApprobationConge());
            ajout = pst.executeUpdate();
            return ajout;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return ajout;
    }

    @Override
    public int update(Approbation approbation) {
        int modifier = 0;
        connection = getConnection();
        try {
            pst = connection.prepareStatement(UPDATE);
            pst.setInt(1, approbation.getApprobationConge());
            pst.setInt(2, approbation.getApprobationID());
            modifier = pst.executeUpdate();
            return modifier;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return modifier;
    }

    @Override
    public int delete(Approbation approbation) {
        int suppression = 0;
        connection = getConnection();
        try {
            pst = connection.prepareStatement(DELETE);
            pst.setInt(1, approbation.getApprobationID());
            suppression = pst.executeUpdate();
            return suppression;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return suppression;
    }

    @Override
    public List<Approbation> afficherApprobations() {
        List<Approbation> approbations = new ArrayList<>();
        connection = getConnection();
        try {
            pst = connection.prepareStatement(SELECT_ALL);
            res = pst.executeQuery();
            while (res.next()) {
                Approbation approbation = new Approbation();
                approbation.setApprobationID(res.getInt("approbationID"));
                approbation.setApprobationConge(res.getInt("approbationConge"));
                approbation.setApprobationDate(res.getString("approbationDat"));
                approbations.add(approbation);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return approbations;
    }

    @Override
    public boolean dejaExist(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String returnId(String parametre, String table, String cle, String valeur) {
        connection = getConnection();
        String id = "";
        try {
            pst = connection.prepareStatement("select " + parametre + " from "
                    + table + " where " + cle + "=?");
            pst.setString(1, valeur);
            res = pst.executeQuery();
            while (res.next()) {
                DemandeConge demande = new DemandeConge();
                demande.setDemandeEmploye(res.getString(parametre));
                id = demande.getDemandeEmploye();
                return id;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }

    public boolean dejaApprouve(int id) {
        String sql = "select * from approbation where approbationConge=" + id;
        connection = getConnection();
        try {
            pst = connection.prepareStatement(sql);
            res = pst.executeQuery();
            while (res.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void demander(String employe, String messageApprove, String messageNonApp, String messageDefaut, JLabel labMessage) {
        String sql = "SELECT *, CASE WHEN demandeEtat=0 THEN '" + messageNonApp + "' WHEN demandeEtat=1 THEN '" + messageApprove + "' ELSE '" + messageDefaut + "' END AS message FROM demandeConge WHERE demandeEmploye=" + employe;
        connection = getConnection();
        try {
            pst = connection.prepareStatement(sql);
            res = pst.executeQuery();
            while (res.next()) {
                labMessage.setText(res.getString("message"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
