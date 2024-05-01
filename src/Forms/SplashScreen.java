
package Forms;


import javax.swing.ImageIcon;
import javax.swing.JDialog;

public class SplashScreen extends javax.swing.JDialog {

    public SplashScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());
        setTitle("Gestion des congé");
       
    }
  private void doTask(String taskName, int progress) throws Exception {
        show.setText(taskName);
        Thread.sleep(1000);
        progession.setValue(progress);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        progession = new javax.swing.JProgressBar();
        show = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Systeme de Gestion des Congés Cas de l'ARCT");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 376, 27));

        progession.setBackground(new java.awt.Color(0, 102, 0));
        progession.setForeground(new java.awt.Color(0, 255, 204));
        jPanel1.add(progession, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 284, 396, -1));

        show.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        show.setForeground(new java.awt.Color(0, 102, 0));
        show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 193, 376, 15));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
          new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    doTask("Connexion  avec la base de donnes,pour executer", 10);
                    doTask("organisations et chargement des fichiers du systemes ", 20);
                    doTask("prepration des interfaces utilisateurs....", 30);
                    doTask("Initialisation des operations du systemes...", 40);
                    doTask("Informatique:Science du traitement automatique ", 50);
                    doTask("et rationnel de l'information considérée comme le support ", 60);
                    doTask("Ensemble des applications de cette science, mettant en ", 70);
                    doTask("L'informatique est un domaine d'activité scientifique", 80);
                    doTask("L'histoire de l'informatique est l'histoire de la science", 90);
                    doTask("L'informatique est une science du traitement de l'information.", 100);
                    doTask("Le systeme est a votre disposition,Merci", 100);
                    dispose();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar progession;
    private javax.swing.JLabel show;
    // End of variables declaration//GEN-END:variables
}
