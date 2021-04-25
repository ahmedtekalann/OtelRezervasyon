
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.regex.*;

public class KayitSayfasi_1 extends javax.swing.JFrame {

    DefaultTableModel dtm = new DefaultTableModel();

    ArrayList<Musteri_1> Liste = new ArrayList();
    ArrayList<AyrilanMusteri> Liste3 = new ArrayList();

    public KayitSayfasi_1() {
        initComponents();
//        kayitliMusteriler();
        this.getContentPane().setBackground(Color.cyan.darker());
        this.setLocationRelativeTo(this);

        String[] data = {"Ad", "Soyad", "TC", "Oda NO"};
        dtm.setColumnIdentifiers(data);
        tablodoldur();
        tbl_oteldekiMusteriler.setModel(dtm);
        odacmb();

    }

//    void tcKimlikKontrol() {
//        Pattern p = Pattern.compile("%d");
//        Matcher matcher = p.matcher(txt_tc.getText());
//        if (matcher.find()) {
//
//        } else {
//            JOptionPane.showMessageDialog(this, "tc numaralı giriniz");
//        }
//    }
//    public void kayitliMusteriler() {
//
//        Musteri m1 = new Musteri();
//        m1.ad = "Ahmet";
//        m1.soyad = "Tekalan";
//        m1.tcKimlikNo = "123456789";
//        m1.odaNumarasi = "101";
//        Liste.add(m1);
//
//        Musteri m2 = new Musteri();
//        m2.ad = "Mehmet";
//        m2.soyad = "Tekalan";
//        m2.tcKimlikNo = "987654321";
//        m2.odaNumarasi = "102";
//        Liste.add(m2);
//
//        Musteri m3 = new Musteri();
//        m3.ad = "Gürkan";
//        m3.soyad = "Tekalan";
//        m3.tcKimlikNo = "456789123";
//        m3.odaNumarasi = "103";
//        Liste.add(m3);
//
//    }
    public KayitSayfasi_1(ArrayList<Musteri_1> Liste1, ArrayList<AyrilanMusteri> Liste2) {
        Liste = Liste1;
        Liste3 = Liste2;
        initComponents();
        this.getContentPane().setBackground(Color.cyan.darker());
        this.setLocationRelativeTo(this);
        String[] data = {"Ad", "Soyad", "TC", "Oda NO"};
        dtm.setColumnIdentifiers(data);

        dtm.setRowCount(0);
        for (Musteri_1 musteri : Liste) {
            String[] veri = {musteri.ad, musteri.soyad, musteri.tcKimlikNo, musteri.odaNumarasi};
            dtm.addRow(veri);
        }
        tbl_oteldekiMusteriler.setModel(dtm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbl_ad = new javax.swing.JLabel();
        lbl_soyad = new javax.swing.JLabel();
        lbltc = new javax.swing.JLabel();
        txt_adi = new javax.swing.JTextField();
        txt_soyadi = new javax.swing.JTextField();
        txt_tc = new javax.swing.JTextField();
        btn_kayit = new javax.swing.JButton();
        cmbx_odaNumarasi = new javax.swing.JComboBox<>();
        lbl_odanumarasi = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_oteldekiMusteriler = new javax.swing.JTable();
        btn_duzenlemeSayfasi = new javax.swing.JButton();
        lbl_rez = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kayıt");

        lbl_ad.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        lbl_ad.setText("Adı :");

        lbl_soyad.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        lbl_soyad.setText("Soyadı :");

        lbltc.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        lbltc.setText("TC Kimlik No. :");

        btn_kayit.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        btn_kayit.setText("Kayıt");
        btn_kayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kayitActionPerformed(evt);
            }
        });

        cmbx_odaNumarasi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115", "116", "117", "118" }));

        lbl_odanumarasi.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        lbl_odanumarasi.setText("Oda Numarası :");

        tbl_oteldekiMusteriler.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbl_oteldekiMusteriler.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tbl_oteldekiMusteriler);

        btn_duzenlemeSayfasi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_duzenlemeSayfasi.setText("Düzenleme Sayfası");
        btn_duzenlemeSayfasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_duzenlemeSayfasiActionPerformed(evt);
            }
        });

        lbl_rez.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        lbl_rez.setText("Kayıt Sayfası");

        jLabel1.setText("Otelde Bulunan Müşteriler");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(lbl_rez, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(420, 420, 420)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltc)
                            .addComponent(lbl_odanumarasi))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_soyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_tc, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbx_odaNumarasi, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(btn_kayit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_duzenlemeSayfasi, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_rez, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_soyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_soyad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_tc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbx_odaNumarasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_odanumarasi))))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_kayit)
                    .addComponent(btn_duzenlemeSayfasi, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        setBounds(0, 0, 693, 339);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_kayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kayitActionPerformed

        boolean kontrol = true;
        boolean kontrol2 = true;

        if (txt_adi.getText().toString().length() == 0
                || txt_soyadi.getText().toString().length() == 0
                || txt_tc.getText().toString().length() == 0) {
            JOptionPane.showMessageDialog(this, "Boş alan bırakılamaz.");
            return;
        }

        kontrol = denetleme();

        if (kontrol) {
            Musteri_1 m1 = new Musteri_1();
            m1.ad = txt_adi.getText();
            m1.soyad = txt_soyadi.getText();
            Pattern p = Pattern.compile("[0-9]");
            Matcher matcher = p.matcher(txt_tc.getText());
            if (matcher.find()) {
                m1.tcKimlikNo = txt_tc.getText();
                kontrol2 = false;
            } else {
                kontrol = false;
                JOptionPane.showMessageDialog(this, "Tc Kimlik bölümünü sayı olarak giriniz");
                return;
            }
            m1.odaNumarasi = cmbx_odaNumarasi.getSelectedItem().toString();
            if (!(txt_adi.getText().isEmpty() || txt_soyadi.getText().isEmpty() || kontrol2 || cmbx_odaNumarasi.getSelectedItem().toString().isEmpty())) {

                dataekle(m1);

            } else {
//                JOptionPane.showMessageDialog(this, "Boş alan bırakılamaz.");
            }

        }

        odacmb();
        tablodoldur();


    }//GEN-LAST:event_btn_kayitActionPerformed

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
            java.util.logging.Logger.getLogger(KayitSayfasi_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KayitSayfasi_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KayitSayfasi_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KayitSayfasi_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KayitSayfasi_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_duzenlemeSayfasi;
    private javax.swing.JButton btn_kayit;
    private javax.swing.JComboBox<String> cmbx_odaNumarasi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_ad;
    private javax.swing.JLabel lbl_odanumarasi;
    private javax.swing.JLabel lbl_rez;
    private javax.swing.JLabel lbl_soyad;
    private javax.swing.JLabel lbltc;
    private javax.swing.JTable tbl_oteldekiMusteriler;
    private javax.swing.JTextField txt_adi;
    private javax.swing.JTextField txt_soyadi;
    private javax.swing.JTextField txt_tc;
    // End of variables declaration//GEN-END:variables

    private void dataekle(Musteri_1 m1) {
        try {

            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/OtelOtomasyon", "ahmet", "ahmet");
            String sql = "INSERT INTO MUSTERI (TCNO, AD,SOYAD,ODANO,ISWORK) VALUES (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, m1.tcKimlikNo);
            ps.setString(2, m1.ad);
            ps.setString(3, m1.soyad);
            ps.setString(4, m1.odaNumarasi);
            ps.setBoolean(5, true);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Kaydınız başarılıdır.");

            txt_adi.setText(null);
            txt_soyadi.setText(null);
            txt_tc.setText(null);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Aynı TC'ye sahip kişi tabloda var.! Kişi Eklenemedi");
        }
    }

    private void tablodoldur() {
        dtm.setRowCount(0);

        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/OtelOtomasyon", "ahmet", "ahmet");
            String sql = "SELECT * FROM MUSTERI WHERE ISWORK = true";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                dtm.addRow(new String[]{rs.getString(2), rs.getString(3), rs.getString(1), rs.getString(4)});
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        tbl_oteldekiMusteriler.setModel(dtm);
    }

    private boolean denetleme() {
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/OtelOtomasyon", "ahmet", "ahmet");
            String sql = "SELECT * FROM MUSTERI WHERE ISWORK = true and TCNO=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(2, txt_tc.getText());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return false;
            }

        } catch (Exception e) {

        }
        return true;
    }

    private void odacmb() {
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/OtelOtomasyon", "ahmet", "ahmet");
            String sql = "SELECT * FROM MUSTERI WHERE ISWORK = true";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cmbx_odaNumarasi.removeItem(rs.getString("ODANO"));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
