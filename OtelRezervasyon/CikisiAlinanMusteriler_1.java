
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class CikisiAlinanMusteriler_1 extends javax.swing.JFrame {

    public CikisiAlinanMusteriler_1() {
        initComponents();
        this.getContentPane().setBackground(Color.cyan.darker());
        this.setLocationRelativeTo(this);

        String[] data = {"Ad Soyad", "TC", "Oda NO", "ÜCRET"};
        dtm.setColumnIdentifiers(data);
        tablodoldur();
    }
    DefaultTableModel dtm = new DefaultTableModel();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_cikisiAlinanMusteriler = new javax.swing.JTable();
        btn_tc_ile_ara = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_tc_ile_ara = new javax.swing.JTextField();
        btn_oda_ile_ara = new javax.swing.JButton();
        txt_oda_ile_ara = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_ad_ile_ara = new javax.swing.JTextField();
        btn_ad_ile_ara = new javax.swing.JButton();
        btn_listeYenile = new javax.swing.JButton();
        btn_duzenlemeSayfasi = new javax.swing.JButton();
        lbl_rez = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_cikisiAlinanMusteriler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_cikisiAlinanMusteriler);

        btn_tc_ile_ara.setText("Ara");
        btn_tc_ile_ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tc_ile_araActionPerformed(evt);
            }
        });

        jLabel1.setText("TC NO'YA GÖRE SORGULA");

        btn_oda_ile_ara.setText("Ara");
        btn_oda_ile_ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_oda_ile_araActionPerformed(evt);
            }
        });

        jLabel2.setText("ODA NO'YA GÖRE SORGULA");

        jLabel3.setText("AD'A GÖRE SORGULA");

        btn_ad_ile_ara.setText("Ara");
        btn_ad_ile_ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ad_ile_araActionPerformed(evt);
            }
        });

        btn_listeYenile.setText("Listeyi Yenile");
        btn_listeYenile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listeYenileActionPerformed(evt);
            }
        });

        btn_duzenlemeSayfasi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_duzenlemeSayfasi.setText("Düzenleme Sayfası");
        btn_duzenlemeSayfasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_duzenlemeSayfasiActionPerformed(evt);
            }
        });

        lbl_rez.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        lbl_rez.setText("Çıkısı Alınan Müsteriler");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_duzenlemeSayfasi))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txt_tc_ile_ara, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btn_tc_ile_ara))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txt_oda_ile_ara, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_oda_ile_ara)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txt_ad_ile_ara, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_ad_ile_ara)))
                                        .addComponent(btn_listeYenile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_rez)
                        .addGap(129, 129, 129))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(lbl_rez, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_tc_ile_ara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_tc_ile_ara))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_oda_ile_ara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_oda_ile_ara))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_ad_ile_ara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_ad_ile_ara))
                        .addGap(19, 19, 19)
                        .addComponent(btn_listeYenile))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_duzenlemeSayfasi, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tc_ile_araActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tc_ile_araActionPerformed

        tctablodoldur(txt_tc_ile_ara.getText());
        txt_tc_ile_ara.setText(" ");
    }//GEN-LAST:event_btn_tc_ile_araActionPerformed

    private void btn_oda_ile_araActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oda_ile_araActionPerformed

        odaTablodoldur(txt_oda_ile_ara.getText());
        txt_oda_ile_ara.setText(" ");
    }//GEN-LAST:event_btn_oda_ile_araActionPerformed

    private void btn_ad_ile_araActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ad_ile_araActionPerformed

        adaGoreTablodoldur(txt_ad_ile_ara.getText());
        txt_ad_ile_ara.setText(" ");
    }//GEN-LAST:event_btn_ad_ile_araActionPerformed

    private void btn_listeYenileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listeYenileActionPerformed

        tablodoldur();
    }//GEN-LAST:event_btn_listeYenileActionPerformed

    private void btn_duzenlemeSayfasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_duzenlemeSayfasiActionPerformed

        this.setVisible(false);
        new DuzenlemeSayfasi_1().setVisible(true);
    }//GEN-LAST:event_btn_duzenlemeSayfasiActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CikisiAlinanMusteriler_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CikisiAlinanMusteriler_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CikisiAlinanMusteriler_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CikisiAlinanMusteriler_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CikisiAlinanMusteriler_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ad_ile_ara;
    private javax.swing.JButton btn_duzenlemeSayfasi;
    private javax.swing.JButton btn_listeYenile;
    private javax.swing.JButton btn_oda_ile_ara;
    private javax.swing.JButton btn_tc_ile_ara;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_rez;
    private javax.swing.JTable tbl_cikisiAlinanMusteriler;
    private javax.swing.JTextField txt_ad_ile_ara;
    private javax.swing.JTextField txt_oda_ile_ara;
    private javax.swing.JTextField txt_tc_ile_ara;
    // End of variables declaration//GEN-END:variables

    private void tablodoldur() {
        dtm.setRowCount(0);

        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/OtelOtomasyon", "ahmet", "ahmet");
            String sql = "SELECT * FROM MUSTERI WHERE ISWORK=false";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                dtm.addRow(new String[]{rs.getString(2) + " " + rs.getString(3), rs.getString(1), rs.getString(4), rs.getString(6)});
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        tbl_cikisiAlinanMusteriler.setModel(dtm);
    }

    private void tctablodoldur(String text) {
        dtm.setRowCount(0);

        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/OtelOtomasyon", "ahmet", "ahmet");
            String sql = "SELECT * FROM MUSTERI WHERE ISWORK=false and TCNO like ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" + text + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                dtm.addRow(new String[]{rs.getString(2) + " " + rs.getString(3), rs.getString(1), rs.getString(4), rs.getString(6)});
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        tbl_cikisiAlinanMusteriler.setModel(dtm);
    }

    private void odaTablodoldur(String text) {
        dtm.setRowCount(0);

        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/OtelOtomasyon", "ahmet", "ahmet");
            String sql = "SELECT * FROM MUSTERI WHERE ISWORK=false and ODANO like ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" + text + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                dtm.addRow(new String[]{rs.getString(2) + " " + rs.getString(3), rs.getString(1), rs.getString(4), rs.getString(6)});
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        tbl_cikisiAlinanMusteriler.setModel(dtm);
    }

    private void adaGoreTablodoldur(String text) {
        dtm.setRowCount(0);

        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/OtelOtomasyon", "ahmet", "ahmet");
            String sql = "SELECT * FROM MUSTERI WHERE ISWORK=false and AD like ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, text + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                dtm.addRow(new String[]{rs.getString(2) + " " + rs.getString(3), rs.getString(1), rs.getString(4), rs.getString(6)});
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        tbl_cikisiAlinanMusteriler.setModel(dtm);
    }
}
