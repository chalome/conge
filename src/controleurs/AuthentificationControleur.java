package controleurs;

import static BDDConnextion.ConnexionBDD.getConnection;
import Interfaces.Ilogin;
import Modeles.Employe;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;

public class AuthentificationControleur implements Ilogin {

    private Connection connection;
    private PreparedStatement pst;
    private ResultSet res;

    private static final String SELECT = "SELECT * FROM employe WHERE employePrenom=? AND employeMatricule=?";
    private static final String CHECK_USER = "SELECT * FROM employe WHERE employePrenom=? AND employeMatricule=? AND employeCategorie!=3";

    public AuthentificationControleur() {
    }

    @Override
    public boolean isLogin(Employe employe) {
        connection = getConnection();
        try {
            pst = connection.prepareStatement(SELECT);
            pst.setString(1, employe.getEmployePrenom());
            pst.setString(2, employe.getEmployeMatricule());
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
    public boolean isStaff(Employe employe) {
        connection = getConnection();
        try {
            pst = connection.prepareStatement(CHECK_USER);
            pst.setString(1, employe.getEmployePrenom());
            pst.setString(2, employe.getEmployeMatricule());
            res = pst.executeQuery();
            while (res.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void afficherPrenoms(JComboBox<String> combo) {
        String sql = "select employePrenom as prenom from employe";
        connection = getConnection();
        try {
            pst = connection.prepareStatement(sql);
            res = pst.executeQuery();
            while (res.next()) {
                combo.addItem(res.getString("prenom"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
