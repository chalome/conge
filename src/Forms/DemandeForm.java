package Forms;

import Modeles.DemandeConge;
import Modeles.Employe;
import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;
import controleurs.DemandeCongeControleur;
import controleurs.EmployeControleur;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DemandeForm extends javax.swing.JFrame {

    public DemandeForm() {
        initComponents();
        afficheMatricules();
        nombre.setText("25");
        afficherDemades();
        setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());
        setTitle("Gestion des congé");
    }

    public void afficherDemades() {
        DemandeCongeControleur controleur = new DemandeCongeControleur();
        controleur.afficheTousDemandes(demandeTable);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        demandeNombreJours = new javax.swing.JTextField();
        demandeAjouter = new javax.swing.JButton();
        demandeModifier = new javax.swing.JButton();
        demandeSupprimer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        demandeTable = new javax.swing.JTable();
        demandeDateDebut = new com.toedter.calendar.JDateChooser();
        demandeDateFin = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        demandeMotif = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        demandeEmploye = new javax.swing.JComboBox<Employe>();
        nombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulaire de demande de congé");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ajouter une demande");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Matricule");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Début");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Fin");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Nbre jours");

        demandeNombreJours.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        demandeNombreJours.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                demandeNombreJoursKeyReleased(evt);
            }
        });

        demandeAjouter.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        demandeAjouter.setText("Ajouter");
        demandeAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demandeAjouterActionPerformed(evt);
            }
        });

        demandeModifier.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        demandeModifier.setText("Modifier");
        demandeModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demandeModifierActionPerformed(evt);
            }
        });

        demandeSupprimer.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        demandeSupprimer.setText("Supprimer");
        demandeSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demandeSupprimerActionPerformed(evt);
            }
        });

        demandeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        demandeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                demandeTableMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(demandeTable);

        demandeDateDebut.setDateFormatString("yyyy-MM-d");

        demandeDateFin.setDateFormatString("yyyy-MM-d");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Motif");

        demandeMotif.setColumns(20);
        demandeMotif.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        demandeMotif.setRows(5);
        jScrollPane2.setViewportView(demandeMotif);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 0));
        jButton1.setText("x");
        jButton1.setToolTipText("initialiser le formulaire");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        demandeEmploye.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Nombre  jours total");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(demandeAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(demandeModifier)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(demandeSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(demandeNombreJours, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(demandeDateDebut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                                    .addComponent(demandeEmploye, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(demandeDateFin, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(544, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                    .addGap(15, 15, 15)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(demandeEmploye, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(demandeDateDebut, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(demandeNombreJours, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(demandeDateFin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(demandeAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(demandeModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(demandeSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void demandeAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demandeAjouterActionPerformed
        String matricule = demandeEmploye.getSelectedItem().toString();
        String dateDebut = ((JTextField) demandeDateDebut.getDateEditor().getUiComponent()).getText();
        String dateFin = ((JTextField) demandeDateFin.getDateEditor().getUiComponent()).getText();
        String nombreJours = demandeNombreJours.getText();
        String motif = demandeMotif.getText();
        DemandeCongeControleur controleur = new DemandeCongeControleur();
        EmployeControleur employe = new EmployeControleur();
        String employeID = employe.returnId("employeID", "employe", "employeMatricule", matricule);
        int ajout;
        if (matricule.isEmpty()
                || dateDebut.isEmpty()
                || dateFin.isEmpty()
                || nombreJours.isEmpty()
                || motif.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tous Les champ sont obligatoires", "Erreur", JOptionPane.ERROR_MESSAGE);
        } else if (controleur.finished(employeID, Integer.parseInt(nombre.getText()))) {
            JOptionPane.showMessageDialog(this, "Il a deja termine les jours total du conge", "Erreur", JOptionPane.ERROR_MESSAGE);
        } else {
            DemandeConge demande = new DemandeConge(employeID, dateDebut, dateFin, Integer.parseInt(nombreJours), motif);
            ajout = controleur.create(demande);
            if (ajout == 1) {
                JOptionPane.showMessageDialog(this, "Enregistrement Reussi", "Success", JOptionPane.INFORMATION_MESSAGE);
                afficherDemades();
            } else {
                JOptionPane.showMessageDialog(this, "Echec d'enregistrement", "Erreur!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_demandeAjouterActionPerformed

    private void demandeModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demandeModifierActionPerformed
        String matricule = demandeEmploye.getSelectedItem().toString();
        String dateDebut = ((JTextField) demandeDateDebut.getDateEditor().getUiComponent()).getText();
        String dateFin = ((JTextField) demandeDateFin.getDateEditor().getUiComponent()).getText();
        String nombreJours = demandeNombreJours.getText();
        String motif = demandeMotif.getText();
        DemandeCongeControleur controleur = new DemandeCongeControleur();
        EmployeControleur employe = new EmployeControleur();
        String employeID = employe.returnId("employeID", "employe", "employeMatricule", matricule);
//
        int i = -1;
        while (i < 0) {
            String id = JOptionPane.showInputDialog(this, "Saisir l'ID du demande à modifier");
            if (id.length() > 0) {
                i++;
                int update = 0;
                int demandeID = Integer.parseInt(id);
                DemandeConge demandeConge = new DemandeConge(demandeID, employeID, dateDebut, dateFin, Integer.parseInt(nombreJours), motif);
                int y = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiement faire la modification?",
                        "Confirmation", JOptionPane.YES_NO_OPTION);
                if (y == JOptionPane.OK_OPTION) {
                    update = controleur.update(demandeConge);

                    if (update == 1) {
                        JOptionPane.showMessageDialog(this, "Modifié avec succès", "Succès", JOptionPane.INFORMATION_MESSAGE);
                        afficherDemades();
                    } else {
                        JOptionPane.showMessageDialog(this, "Action failed", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
    }//GEN-LAST:event_demandeModifierActionPerformed

    private void demandeSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demandeSupprimerActionPerformed
        int ligne = demandeTable.getSelectedRow();
        int id = Integer.parseInt(demandeTable.getValueAt(ligne, 0).toString());
        int delete;
        DemandeConge demandeConge = new DemandeConge();
        DemandeCongeControleur controleur = new DemandeCongeControleur();
        demandeConge.setDemandeID(id);
        int y = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiement faire la suppression ?",
                "Confirmation", JOptionPane.YES_NO_OPTION);
        if (y == JOptionPane.OK_OPTION) {
            delete = controleur.delete(demandeConge);
            if (delete == 1) {
                JOptionPane.showMessageDialog(this, "Supprimmé avec succès!", "Succès", JOptionPane.INFORMATION_MESSAGE);
                afficherDemades();

            } else {
                JOptionPane.showMessageDialog(this, "Echec de suppression", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_demandeSupprimerActionPerformed

    private void demandeTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_demandeTableMouseReleased
        int ligne = demandeTable.getSelectedRow();
        demandeEmploye.setSelectedItem(demandeTable.getValueAt(ligne, 1).toString());
        JTextField debut = (JTextField) demandeDateDebut.getDateEditor().getUiComponent();
        debut.setText(demandeTable.getValueAt(ligne, 4).toString());

        JTextField fin = (JTextField) demandeDateFin.getDateEditor().getUiComponent();
        fin.setText(demandeTable.getValueAt(ligne, 5).toString());

        demandeNombreJours.setText(demandeTable.getValueAt(ligne, 6).toString());
        demandeMotif.setText(demandeTable.getValueAt(ligne, 7).toString());
    }//GEN-LAST:event_demandeTableMouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        demandeNombreJours.setText("");
        demandeDateDebut.setDate(null);
        demandeDateFin.setDate(null);
        demandeMotif.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void demandeNombreJoursKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_demandeNombreJoursKeyReleased
        JTextField showdate = (JTextField) demandeDateFin.getDateEditor().getUiComponent();
        showdate.setText(dateFin(Integer.parseInt(demandeNombreJours.getText())));

    }//GEN-LAST:event_demandeNombreJoursKeyReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int opt = JOptionPane.showConfirmDialog(this, "Voulez-vous fermer l'application ?", "Fermer", JOptionPane.YES_NO_OPTION);
        if (opt == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing
    private void afficheMatricules() {
        List<Employe> list = new EmployeControleur().afficherEmployes();
        for (Employe employe : list) {
            demandeEmploye.addItem(employe);
        }
    }

    private LocalDate findNextDay(LocalDate localdate, int nombre) {
        return localdate.plusDays(nombre);
    }

    private String dateFin(int nombre) {
        LocalDate today = findNextDay(LocalDate.now(), nombre);
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = today.format(pattern);
        return formattedDate;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DemandeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DemandeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DemandeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DemandeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        FlatDarkPurpleIJTheme.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DemandeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton demandeAjouter;
    private com.toedter.calendar.JDateChooser demandeDateDebut;
    private com.toedter.calendar.JDateChooser demandeDateFin;
    private javax.swing.JComboBox<Employe> demandeEmploye;
    private javax.swing.JButton demandeModifier;
    private javax.swing.JTextArea demandeMotif;
    private javax.swing.JTextField demandeNombreJours;
    private javax.swing.JButton demandeSupprimer;
    private javax.swing.JTable demandeTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}
