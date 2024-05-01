package Forms;

import Modeles.CategorieEmploye;
import Modeles.Employe;
import Modeles.Service;
import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;
import controleurs.CategorieEmployeCotroleur;
import controleurs.EmployeControleur;
import controleurs.ServiceControleurs;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EmployeForm extends javax.swing.JFrame {

    public EmployeForm() {
        initComponents();
        afficheCategorieServices();
        afficherEmployes();
        servicetex.setText(employeService.getSelectedItem().toString());
        categorieTxt.setText(employeCategorie.getSelectedItem().toString());
        setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());
        setTitle("Gestion des congé");
    }

    public void afficherEmployes() {
        EmployeControleur controleur = new EmployeControleur();
        String header[] = {"ID", "NOM", "PRENOM", "MATRICULE", "ADRESSE", "SERVICE", "CATEGORIE", "TELEPHONE"};
        Object data[][] = new Object[controleur.afficherEmployes().size()][8];
        int i = 0;
        for (Employe employe : controleur.afficherEmployes()) {
            data[i][0] = employe.getEmployeID();
            data[i][1] = employe.getEmployeNom();
            data[i][2] = employe.getEmployePrenom();
            data[i][3] = employe.getEmployeMatricule();
            data[i][4] = employe.getEmployeAdresse();
            data[i][5] = employe.getEmployeSerice();
            data[i][6] = employe.getEmployeType();
            data[i][7] = employe.getEmployeTelephone();
            i++;
        }
        employeTable.setModel(new DefaultTableModel(data, header));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        employeNom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        employePrenom = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        employeAdresse = new javax.swing.JTextField();
        employeTelephone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        employeMatricule = new javax.swing.JTextField();
        employeService = new javax.swing.JComboBox<Service>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        employeCategorie = new javax.swing.JComboBox<CategorieEmploye>();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeTable = new javax.swing.JTable();
        employeAjouter = new javax.swing.JButton();
        employeModifier = new javax.swing.JButton();
        employeSupprimer = new javax.swing.JButton();
        servicetex = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        categorieTxt = new javax.swing.JTextField();
        categorieSupprimer = new javax.swing.JButton();
        categorieAjouter1 = new javax.swing.JButton();
        categorieModifier = new javax.swing.JButton();
        categorieReset = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        serviceModifier = new javax.swing.JButton();
        serviceAjouter = new javax.swing.JButton();
        serviceReset = new javax.swing.JButton();
        serviceSupprimer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestion des employés");

        employeNom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ajouter un employé");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Nom");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Prénom");

        employePrenom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Tél");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Adresse");

        employeAdresse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        employeTelephone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Matricule");

        employeMatricule.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        employeService.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        employeService.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                employeServiceItemStateChanged(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Service");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Catégorie");

        employeCategorie.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        employeCategorie.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                employeCategorieItemStateChanged(evt);
            }
        });
        employeCategorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeCategorieActionPerformed(evt);
            }
        });

        employeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        employeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                employeTableMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(employeTable);

        employeAjouter.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        employeAjouter.setText("Ajouter");
        employeAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeAjouterActionPerformed(evt);
            }
        });

        employeModifier.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        employeModifier.setText("Modifier");
        employeModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeModifierActionPerformed(evt);
            }
        });

        employeSupprimer.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        employeSupprimer.setText("Supprimer");
        employeSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeSupprimerActionPerformed(evt);
            }
        });

        servicetex.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Les Services");

        categorieTxt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        categorieSupprimer.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        categorieSupprimer.setText("Supprimer");
        categorieSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categorieSupprimerActionPerformed(evt);
            }
        });

        categorieAjouter1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        categorieAjouter1.setText("Ajouter");
        categorieAjouter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categorieAjouter1ActionPerformed(evt);
            }
        });

        categorieModifier.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        categorieModifier.setText("Modifier");
        categorieModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categorieModifierActionPerformed(evt);
            }
        });

        categorieReset.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        categorieReset.setText("Reset");
        categorieReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categorieResetActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Catégorie des employés");

        serviceModifier.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        serviceModifier.setText("modifier");
        serviceModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceModifierActionPerformed(evt);
            }
        });

        serviceAjouter.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        serviceAjouter.setText("Ajouter");
        serviceAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceAjouterActionPerformed(evt);
            }
        });

        serviceReset.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        serviceReset.setText("Reset");
        serviceReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceResetActionPerformed(evt);
            }
        });

        serviceSupprimer.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        serviceSupprimer.setText("supprimer");
        serviceSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceSupprimerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(employeCategorie, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(employeNom, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(employePrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(employeAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(employeMatricule, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(employeAjouter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(employeTelephone, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                                    .addComponent(employeService, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(21, 21, 21)
                                                        .addComponent(employeModifier)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(employeSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addComponent(servicetex, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addComponent(serviceAjouter)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(serviceModifier)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(serviceSupprimer)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(serviceReset)))
                                        .addGap(16, 16, 16)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(categorieAjouter1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(categorieModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(categorieSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(categorieReset, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(categorieTxt, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(13, 13, 13))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(employeMatricule)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(employeNom)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(employePrenom)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(employeAdresse)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employeCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(employeService, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(employeTelephone)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(employeAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employeModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employeSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categorieTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(servicetex, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categorieSupprimer)
                    .addComponent(categorieReset)
                    .addComponent(categorieAjouter1)
                    .addComponent(categorieModifier)
                    .addComponent(serviceModifier)
                    .addComponent(serviceAjouter)
                    .addComponent(serviceReset)
                    .addComponent(serviceSupprimer))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void categorieAjouter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categorieAjouter1ActionPerformed
        int ajout = 0;
        CategorieEmployeCotroleur controleur = new CategorieEmployeCotroleur();
        String categorie = categorieTxt.getText();
        if (categorie.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Le champ categorie est vide", "Erreur", JOptionPane.ERROR_MESSAGE);
        } else if (controleur.dejaExist(categorie)) {
            JOptionPane.showMessageDialog(this, "La categorie deja existe", "Erreur", JOptionPane.ERROR_MESSAGE);
        } else {
            CategorieEmploye categorieem = new CategorieEmploye(categorie);
            ajout = controleur.create(categorieem);
            if (ajout == 1) {
                JOptionPane.showMessageDialog(this, "Enregistrement Reussi", "Success", JOptionPane.INFORMATION_MESSAGE);
                afficheCategorieServices();
            } else {
                JOptionPane.showMessageDialog(this, "Echec d'enregistrement", "Erreur!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_categorieAjouter1ActionPerformed

    private void employeCategorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeCategorieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeCategorieActionPerformed

    private void serviceModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceModifierActionPerformed
        int update = 0;
        String newService = servicetex.getText();
        String oldService = employeService.getSelectedItem().toString();
        ServiceControleurs controleurs = new ServiceControleurs();
        String serviceId = controleurs.returnId("serviceID", "service", "serviceNom", oldService);
        Service service = new Service(Integer.parseInt(serviceId), newService);
        int y = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiement faire la modification?",
                "Confirmation", JOptionPane.YES_NO_OPTION);
        if (y == JOptionPane.OK_OPTION) {
            update = controleurs.update(service);

            if (update == 1) {
                JOptionPane.showMessageDialog(this, "Modifié avec succès", "Succès", JOptionPane.INFORMATION_MESSAGE);
                afficheCategorieServices();
            } else {
                JOptionPane.showMessageDialog(this, "Action failed", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_serviceModifierActionPerformed

    private void serviceAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceAjouterActionPerformed
        int ajout = 0;
        ServiceControleurs controleur = new ServiceControleurs();
        String service = servicetex.getText();
        if (service.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Le champ Service est vide", "Erreur", JOptionPane.ERROR_MESSAGE);
        } else if (controleur.dejaExist(service)) {
            JOptionPane.showMessageDialog(this, "Le Service deja existe", "Erreur", JOptionPane.ERROR_MESSAGE);
        } else {
            Service services = new Service(service);
            ajout = controleur.create(services);
            if (ajout == 1) {
                JOptionPane.showMessageDialog(this, "Enregistrement Reussi", "Success", JOptionPane.INFORMATION_MESSAGE);
                afficheCategorieServices();
            } else {
                JOptionPane.showMessageDialog(this, "Echec d'enregistrement", "Erreur!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_serviceAjouterActionPerformed

    private void serviceResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceResetActionPerformed
        servicetex.setText("");
        employeNom.setText("");
        employePrenom.setText("");
        employeMatricule.setText("");
        employeAdresse.setText("");
        employeTelephone.setText("");
    }//GEN-LAST:event_serviceResetActionPerformed

    private void serviceSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceSupprimerActionPerformed
        int delete = 0;
        Service service = new Service();
        ServiceControleurs controleur = new ServiceControleurs();
        String serviceID = controleur.returnId("serviceID", "service", "serviceNom", employeService.getSelectedItem().toString());
        service.setServiceID(Integer.parseInt(serviceID));
        int y = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiement faire la suppression ?",
                "Confirmation", JOptionPane.YES_NO_OPTION);
        if (y == JOptionPane.OK_OPTION) {
            delete = controleur.delete(service);
            if (delete == 1) {
                JOptionPane.showMessageDialog(this, "Supprimmé avec succès!", "Succès", JOptionPane.INFORMATION_MESSAGE);
                afficherEmployes();

            } else {
                JOptionPane.showMessageDialog(this, "Echec de suppression", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_serviceSupprimerActionPerformed

    private void categorieResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categorieResetActionPerformed
        categorieTxt.setText("");
    }//GEN-LAST:event_categorieResetActionPerformed

    private void employeAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeAjouterActionPerformed
        String matricule = employeMatricule.getText();
        String nom = employeNom.getText();
        String prenom = employePrenom.getText();
        String adresse = employeAdresse.getText();
        String service = employeService.getSelectedItem().toString();
        String categorie = employeCategorie.getSelectedItem().toString();
        String telephone = employeTelephone.getText();

        EmployeControleur controleur = new EmployeControleur();
        ServiceControleurs serviceControleurs = new ServiceControleurs();
        CategorieEmployeCotroleur categorieEmployeCotroleur = new CategorieEmployeCotroleur();
        String serviceId = serviceControleurs.returnId("serviceID", "service", "serviceNom", service);
        String categorieID = categorieEmployeCotroleur.returnId("typeEmployeID", "categorieemploye", "typeEmploye", categorie);

        int ajout = 0;

        if (matricule.isEmpty()
                || nom.isEmpty()
                || prenom.isEmpty()
                || adresse.isEmpty()
                || service.isEmpty()
                || categorie.isEmpty()
                || telephone.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tous Les champ sont obligatoires", "Erreur", JOptionPane.ERROR_MESSAGE);
        } else if (controleur.dejaExist(matricule)) {
            JOptionPane.showMessageDialog(this, "Le matricule deja existe", "Erreur", JOptionPane.ERROR_MESSAGE);
        } else {
            Employe employe = new Employe(matricule, nom, prenom, adresse, serviceId, categorieID, telephone);
            ajout = controleur.create(employe);
            if (ajout == 1) {
                JOptionPane.showMessageDialog(this, "Enregistrement Reussi", "Success", JOptionPane.INFORMATION_MESSAGE);
                afficherEmployes();
            } else {
                JOptionPane.showMessageDialog(this, "Echec d'enregistrement", "Erreur!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_employeAjouterActionPerformed

    private void employeModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeModifierActionPerformed
        String matricule = employeMatricule.getText();
        String nom = employeNom.getText();
        String prenom = employePrenom.getText();
        String adresse = employeAdresse.getText();
        String service = employeService.getSelectedItem().toString();
        String categorie = employeCategorie.getSelectedItem().toString();
        String telephone = employeTelephone.getText();

        EmployeControleur controleur = new EmployeControleur();
        ServiceControleurs serviceControleurs = new ServiceControleurs();
        CategorieEmployeCotroleur categorieEmployeCotroleur = new CategorieEmployeCotroleur();
        String serviceId = serviceControleurs.returnId("serviceID", "service", "serviceNom", service);
        String categorieID = categorieEmployeCotroleur.returnId("typeEmployeID", "categorieemploye", "typeEmploye", categorie);

        int i = -1;
        while (i < 0) {
            String id = JOptionPane.showInputDialog(this, "Saisir l'ID de l'employe à modifier");
            if (id.length() > 0) {
                i++;
                int update = 0;
                int employeID = Integer.parseInt(id);
                Employe employe = new Employe(employeID, matricule, nom, prenom, adresse, serviceId, categorieID, telephone);
                int y = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiement faire la modification?",
                        "Confirmation", JOptionPane.YES_NO_OPTION);
                if (y == JOptionPane.OK_OPTION) {
                    update = controleur.update(employe);

                    if (update == 1) {
                        JOptionPane.showMessageDialog(this, "Modifié avec succès", "Succès", JOptionPane.INFORMATION_MESSAGE);
                        afficherEmployes();
                    } else {
                        JOptionPane.showMessageDialog(this, "Action failed", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
    }//GEN-LAST:event_employeModifierActionPerformed

    private void employeTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeTableMouseReleased
        int ligne = employeTable.getSelectedRow();
        employeNom.setText(employeTable.getValueAt(ligne, 1).toString());
        employePrenom.setText(employeTable.getValueAt(ligne, 2).toString());
        employeMatricule.setText(employeTable.getValueAt(ligne, 3).toString());
        employeAdresse.setText(employeTable.getValueAt(ligne, 4).toString());
        employeService.setSelectedItem(employeTable.getValueAt(ligne, 5).toString());
        employeCategorie.setSelectedItem(employeTable.getValueAt(ligne, 6).toString());
        employeTelephone.setText(employeTable.getValueAt(ligne, 7).toString());
    }//GEN-LAST:event_employeTableMouseReleased

    private void employeSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeSupprimerActionPerformed
        int ligne = employeTable.getSelectedRow();
        int id = Integer.parseInt(employeTable.getValueAt(ligne, 0).toString());
        int delete = 0;
        Employe employe = new Employe();
        EmployeControleur controleur = new EmployeControleur();
        employe.setEmployeID(id);
        int y = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiement faire la suppression ?",
                "Confirmation", JOptionPane.YES_NO_OPTION);
        if (y == JOptionPane.OK_OPTION) {
            delete = controleur.delete(employe);
            if (delete == 1) {
                JOptionPane.showMessageDialog(this, "Supprimmé avec succès!", "Succès", JOptionPane.INFORMATION_MESSAGE);
                afficherEmployes();

            } else {
                JOptionPane.showMessageDialog(this, "Echec de suppression", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_employeSupprimerActionPerformed

    private void employeCategorieItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_employeCategorieItemStateChanged
        categorieTxt.setText(employeCategorie.getSelectedItem().toString());
    }//GEN-LAST:event_employeCategorieItemStateChanged

    private void employeServiceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_employeServiceItemStateChanged
        servicetex.setText(employeService.getSelectedItem().toString());
    }//GEN-LAST:event_employeServiceItemStateChanged

    private void categorieModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categorieModifierActionPerformed
        int update = 0;
        String newCategorie = categorieTxt.getText();
        String oldCategorie = employeCategorie.getSelectedItem().toString();
        CategorieEmployeCotroleur controleurs = new CategorieEmployeCotroleur();
        String categorieID = controleurs.returnId("typeEmployeID", "categorieemploye", "typeEmploye", oldCategorie);
        CategorieEmploye categorieEmploye = new CategorieEmploye(Integer.parseInt(categorieID), newCategorie);
        int y = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiement faire la modification?",
                "Confirmation", JOptionPane.YES_NO_OPTION);
        if (y == JOptionPane.OK_OPTION) {
            update = controleurs.update(categorieEmploye);

            if (update == 1) {
                JOptionPane.showMessageDialog(this, "Modifié avec succès", "Succès", JOptionPane.INFORMATION_MESSAGE);
                afficheCategorieServices();
            } else {
                JOptionPane.showMessageDialog(this, "Action failed", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_categorieModifierActionPerformed

    private void categorieSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categorieSupprimerActionPerformed
        int delete = 0;
        CategorieEmploye categorieEmploye = new CategorieEmploye();
        CategorieEmployeCotroleur controleur = new CategorieEmployeCotroleur();
        String categorieID = controleur.returnId("typeEmployeID", "categorieemploye", "typeEmploye", employeCategorie.getSelectedItem().toString());
        categorieEmploye.setTypeEmployeID(Integer.parseInt(categorieID));
        int y = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiement faire la suppression ?",
                "Confirmation", JOptionPane.YES_NO_OPTION);
        if (y == JOptionPane.OK_OPTION) {
            delete = controleur.delete(categorieEmploye);
            if (delete == 1) {
                JOptionPane.showMessageDialog(this, "Supprimmé avec succès!", "Succès", JOptionPane.INFORMATION_MESSAGE);
                afficheCategorieServices();

            } else {
                JOptionPane.showMessageDialog(this, "Echec de suppression", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_categorieSupprimerActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int opt = JOptionPane.showConfirmDialog(this, "Voulez-vous fermer l'application ?", "Fermer", JOptionPane.YES_NO_OPTION);
        if (opt == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing
    public void afficheCategorieServices() {
        List<CategorieEmploye> categorieList = new CategorieEmployeCotroleur().afficherCategorieEmployes();
        for (CategorieEmploye categorie : categorieList) {
            employeCategorie.addItem(categorie);
        }
        List<Service> serviceList = new ServiceControleurs().afficherServices();
        for (Service service : serviceList) {
            employeService.addItem(service);
        }
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
            java.util.logging.Logger.getLogger(EmployeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        FlatDarkPurpleIJTheme.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeForm().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton categorieAjouter1;
    private javax.swing.JButton categorieModifier;
    private javax.swing.JButton categorieReset;
    private javax.swing.JButton categorieSupprimer;
    private javax.swing.JTextField categorieTxt;
    private javax.swing.JTextField employeAdresse;
    private javax.swing.JButton employeAjouter;
    private javax.swing.JComboBox<CategorieEmploye> employeCategorie;
    private javax.swing.JTextField employeMatricule;
    private javax.swing.JButton employeModifier;
    private javax.swing.JTextField employeNom;
    private javax.swing.JTextField employePrenom;
    private javax.swing.JComboBox<Service> employeService;
    private javax.swing.JButton employeSupprimer;
    private javax.swing.JTable employeTable;
    private javax.swing.JTextField employeTelephone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton serviceAjouter;
    private javax.swing.JButton serviceModifier;
    private javax.swing.JButton serviceReset;
    private javax.swing.JButton serviceSupprimer;
    private javax.swing.JTextField servicetex;
    // End of variables declaration//GEN-END:variables
}
