package controleurs;

import static BDDConnextion.ConnexionBDD.getConnection;
import Interfaces.ICommon;
import Interfaces.IDemandeConge;
import Modeles.DemandeConge;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class DemandeCongeControleur implements IDemandeConge, ICommon {

    private Connection connection;
    private PreparedStatement pst;
    private ResultSet res;
    private static final String INSERT = "INSERT INTO demandeConge(demandeEmploye,demandeDateDebut,demandeDateFin,demandeJours,demandeMotif) VALUES(?,?,?,?,?)";
    private static final String UPDATE = "UPDATE demandeConge SET demandeEmploye=?,demandeDateDebut=?,demandeDateFin=?,demandeJours=?,demandeMotif=? WHERE demandeID=?";
    private static final String DELETE = "DELETE FROM demandeConge WHERE demandeID=?";
    private static final String SELECT_ALL = "SELECT * FROM demandeConge";

    @Override
    public int create(DemandeConge demande) {
        int ajout = 0;
        connection = getConnection();
        try {
            pst = connection.prepareStatement(INSERT);
            pst.setString(1, demande.getDemandeEmploye());
            pst.setString(2, demande.getDemandeDateDebut());
            pst.setString(3, demande.getDemandeDateFin());
            pst.setInt(4, demande.getDemandeJours());
            pst.setString(5, demande.getDemandeMotif());
            ajout = pst.executeUpdate();
            return ajout;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return ajout;
    }

    @Override
    public int update(DemandeConge demande) {
        int modifier = 0;
        connection = getConnection();
        try {
            pst = connection.prepareStatement(UPDATE);
            pst.setString(1, demande.getDemandeEmploye());
            pst.setString(2, demande.getDemandeDateDebut());
            pst.setString(3, demande.getDemandeDateFin());
            pst.setInt(4, demande.getDemandeJours());
            pst.setString(5, demande.getDemandeMotif());
            pst.setInt(6, demande.getDemandeID());
            modifier = pst.executeUpdate();
            return modifier;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return modifier;
    }
  public void updateEtat(DemandeConge demande) {
        connection = getConnection();
        try {
            pst = connection.prepareStatement("update demandeConge set demandeEtat=1 where demandeId=?");
            pst.setInt(1, demande.getDemandeID());
            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    @Override
    public int delete(DemandeConge demande) {
        int suppression = 0;
        connection = getConnection();
        try {
            pst = connection.prepareStatement(DELETE);
            pst.setInt(1, demande.getDemandeID());
            suppression = pst.executeUpdate();
            return suppression;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return suppression;
    }

    @Override
    public List<DemandeConge> afficherDemandes() {
        List<DemandeConge> demandes = new ArrayList<>();
        connection = getConnection();
        try {
            pst = connection.prepareStatement(SELECT_ALL);
            res = pst.executeQuery();
            while (res.next()) {
                int id = res.getInt("demandeID");
                String employe = res.getString("demandeEmploye");
                String dateDebut = res.getString("demandeDateDebut");
                String dateFin = res.getString("demandeDateFin");
                int jours = res.getInt("demandeJours");
                String motif = res.getString("demandeMotif");
                demandes.add(new DemandeConge(id, employe, dateDebut, dateFin, jours, motif));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return demandes;
    }

    @Override
    public boolean dejaExist(String text) {
        String sql = "select * from demandeConge where demandeEmploye=" + text;
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

    public boolean finished(String employe, int jours) {
        String sql = "select * from demandeConge where demandeEmploye= " + employe + " and demandeJours=" + jours;
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

    public boolean JoursRestant(String employe, int jours) {
        String sql = "select * from demandeConge where demandeEmploye=? and demandeJours=" + jours;
        connection = getConnection();
        try {
            pst = connection.prepareStatement(sql);
            res = pst.executeQuery();
            while (res.next()) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public void afficheTousDemandes(JTable table) {
        String header[] = {"ID", "Nom", "Prenom", "Matricule", "Date debut", "Date Fin", "Jours", "Motif"};
        String[] data = new String[8];
        DefaultTableModel model = new DefaultTableModel(null, header);
        connection = getConnection();
        String sql = "SELECT demandeconge.demandeID as id,employe.employeNom as nom,employe.employePrenom as prenom,"
                + "employe.employeMatricule as matricule,demandeconge.demandeDateDebut as debut,"
                + "demandeconge.demandeDateFin as fin,demandeconge.demandeJours as jours,demandeMotif as motif FROM demandeconge,"
                + "employe WHERE demandeEmploye=employe.employeID";

        try {
            pst = connection.prepareStatement(sql);
            res = pst.executeQuery();
            while (res.next()) {
                data[0] = res.getString("id");
                data[1] = res.getString("nom");
                data[2] = res.getString("prenom");
                data[3] = res.getString("matricule");
                data[4] = res.getString("debut");
                data[5] = res.getString("fin");
                data[6] = res.getString("jours");
                data[7] = res.getString("motif");
                model.addRow(data);
            }
            table.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void afficheTousDemandes(JTable table,int etat) {
        String header[] = {"ID", "Nom", "Prenom", "Matricule", "Date debut", "Date Fin", "Jours", "Motif"};
        String[] data = new String[8];
        DefaultTableModel model = new DefaultTableModel(null, header);
        connection = getConnection();
        String sql = "SELECT demandeconge.demandeID as id,employe.employeNom as nom,employe.employePrenom as prenom,"
                + "employe.employeMatricule as matricule,demandeconge.demandeDateDebut as debut,"
                + "demandeconge.demandeDateFin as fin,demandeconge.demandeJours as jours,demandeMotif as motif FROM demandeconge,"
                + "employe WHERE demandeEmploye=employe.employeID and demandeEtat="+etat;

        try {
            pst = connection.prepareStatement(sql);
            res = pst.executeQuery();
            while (res.next()) {
                data[0] = res.getString("id");
                data[1] = res.getString("nom");
                data[2] = res.getString("prenom");
                data[3] = res.getString("matricule");
                data[4] = res.getString("debut");
                data[5] = res.getString("fin");
                data[6] = res.getString("jours");
                data[7] = res.getString("motif");
                model.addRow(data);
            }
            table.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void afficherListeDemandes(JList<String> list) {
        DefaultListModel model = new DefaultListModel();
        String sql = "select concat(employeNom,' ',employePrenom) as nom from employe,demandeConge where demandeEmploye=employeID";
        connection = getConnection();
        try {
            pst = connection.prepareStatement(sql);
            res = pst.executeQuery();
            while (res.next()) {
                String nom = res.getString("nom");
                model.addElement(nom);
            }
            list.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void afficheDemandes(String id, JLabel nom, JLabel prenom, JLabel matricule, JLabel debut, JLabel fin, JLabel jours, JTextArea motif) {
        connection = getConnection();
        String sql = "SELECT demandeconge.demandeID as id,employe.employeNom as nom,employe.employePrenom as prenom,"
                + "employe.employeMatricule as matricule,demandeconge.demandeDateDebut as debut,"
                + "demandeconge.demandeDateFin as fin,demandeconge.demandeJours as jours,demandeMotif as motif FROM demandeconge,"
                + "employe WHERE demandeEmploye=employe.employeID and concat(employeNom,' ',employePrenom)=?";

        try {
            pst = connection.prepareStatement(sql);
            pst.setString(1, id);
            res = pst.executeQuery();
            while (res.next()) {
                nom.setText(res.getString("nom"));
                prenom.setText(res.getString("prenom"));
                matricule.setText(res.getString("matricule"));
                debut.setText(res.getString("debut"));
                fin.setText(res.getString("fin"));
                jours.setText(res.getString("jours"));
                motif.setText(res.getString("motif"));
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public String returnID(String parametre, String table, String cle1, String cle2, String valeur1, String valeur2) {
        connection = getConnection();
        String id = "";
        try {
            pst = connection.prepareStatement("select " + parametre + " from "
                    + table + " where " + cle1 + "=? and " + cle2 + " =?");
            pst.setString(1, valeur1);
            pst.setString(2, valeur2);
            res = pst.executeQuery();
            while (res.next()) {
                id = res.getString(1);
                return id;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }
}
