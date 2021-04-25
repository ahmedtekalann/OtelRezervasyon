
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DuzenlemeSayfasi_1 extends javax.swing.JFrame {

    DefaultTableModel dtm = new DefaultTableModel();
    DefaultListModel dlm = new DefaultListModel();
    ArrayList<Musteri_1> List = new ArrayList();
    ArrayList<AyrilanMusteri> Ayrilanlar = new ArrayList();

    public DuzenlemeSayfasi_1(ArrayList<Musteri_1> Liste) {
        initComponents();
        this.getContentPane().setBackground(Color.cyan.darker());
        this.setLocationRelativeTo(this);

    }

    public DuzenlemeSayfasi_1(ArrayList<Musteri_1> Liste, ArrayList<AyrilanMusteri> Liste2) {
        initComponents();
        this.getContentPane().setBackground(Color.cyan.darker());
        this.setLocationRelativeTo(this);
        dlm.setSize(0);
        for (AyrilanMusteri musteri : Liste2) {
            dlm.addElement("TC numarası " + musteri.tcKimlikNo + " olan müşteriden alınacak ücret " + Integer.parseInt(musteri.maliyet) * 85 + " TL'dir.");

        }
        list_cikisiAlinanlar.setModel(dlm);
        Ayrilanlar = Liste2;
        List = Liste;
        String[] data = {"Ad", "Soyad", "TC", "Oda NO"};
        dtm.setColumnIdentifiers(data);

        for (Musteri_1 musteri : List) {
            String[] veri = {musteri.ad, musteri.soyad, musteri.tcKimlikNo, musteri.odaNumarasi};
            dtm.addRow(veri);
        }
        tbl_oteldekiMusteriler2.setModel(dtm);
    }

    public DuzenlemeSayfasi_1() {
        initComponents();
        this.getContentPane().setBackground(Color.cyan.darker());
        this.setLocationRelativeTo(this);

        String[] data = {"Ad", "Soyad", "TC", "Oda NO"};
        dtm.setColumnIdentifiers(data);
        tablodoldur();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_tc_ile_sorgula = new javax.swing.JButton();
        btn_sil = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_oteldekiMusteriler2 = new javax.swing.JTable();
        btn_kayitSayfasinaDon = new javax.swing.JButton();
        txt_tc_ile_sorgula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_cikisAl = new javax.swing.JButton();
        txt_kaldigiGunSayisi = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        list_cikisiAlinanlar = new javax.swing.JList<>();
        btn_tabloYenile = new javax.swing.JButton();
        txt_ad = new javax.swing.JTextField();
        txt_soyad = new javax.swing.JTextField();
        txt_tc = new javax.swing.JTextField();
        txt_odaNo = new javax.swing.JTextField();
        lbl_ad = new javax.swing.JLabel();
        lbl_soyad = new javax.swing.JLabel();
        lbl_tc = new javax.swing.JLabel();
        lbl_oda = new javax.swing.JLabel();
        btn_degistir = new javax.swing.JButton();
        btn_yinele = new javax.swing.JButton();
        btn_cikisiAlinan = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbl_rez = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Düzenleme Sayfası");

        btn_tc_ile_sorgula.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_tc_ile_sorgula.setText("TC ile Sorgula");
        btn_tc_ile_sorgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tc_ile_sorgulaActionPerformed(evt);
            }
        });

        btn_sil.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_sil.setText("Seçilen Müşteri Kaydını Sil");
        btn_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_silActionPerformed(evt);
            }
        });

        tbl_oteldekiMusteriler2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbl_oteldekiMusteriler2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_oteldekiMusteriler2);

        btn_kayitSayfasinaDon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_kayitSayfasinaDon.setText("Kayıt Sayfası");
        btn_kayitSayfasinaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kayitSayfasinaDonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Kaldığı Gün Sayısı:");

        btn_cikisAl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_cikisAl.setText("Çıkış Al");
        btn_cikisAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cikisAlActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(list_cikisiAlinanlar);

        btn_tabloYenile.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_tabloYenile.setText("Tablo Yenile");
        btn_tabloYenile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tabloYenileActionPerformed(evt);
            }
        });

        txt_ad.setText(" ");

        txt_soyad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_soyadActionPerformed(evt);
            }
        });

        lbl_ad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_ad.setText("Ad:");

        lbl_soyad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_soyad.setText("Soyad:");

        lbl_tc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_tc.setText("TC.:");

        lbl_oda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_oda.setText("Oda No.:");

        btn_degistir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_degistir.setText("Değiştir");
        btn_degistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_degistirActionPerformed(evt);
            }
        });

        btn_yinele.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_yinele.setText("Yinele");
        btn_yinele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_yineleActionPerformed(evt);
            }
        });

        btn_cikisiAlinan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_cikisiAlinan.setText("Çıkışı Alınan Müşteri Sayfası");
        btn_cikisiAlinan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cikisiAlinanActionPerformed(evt);
            }
        });

        jLabel2.setText("Otelde Bulunan Müşteriler");

        lbl_rez.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        lbl_rez.setText("Düzenleme Sayfası");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_sil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_tc_ile_sorgula, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_tc_ile_sorgula, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_kaldigiGunSayisi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cikisAl, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btn_degistir)
                                .addGap(18, 18, 18)
                                .addComponent(btn_yinele, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_ad)
                                    .addComponent(lbl_oda)
                                    .addComponent(lbl_tc)
                                    .addComponent(lbl_soyad))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_ad)
                                    .addComponent(txt_soyad)
                                    .addComponent(txt_tc)
                                    .addComponent(txt_odaNo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_kayitSayfasinaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_cikisiAlinan))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(btn_tabloYenile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)))
                        .addContainerGap(20, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(lbl_rez, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lbl_rez, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_sil, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(btn_tabloYenile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_tc_ile_sorgula)
                        .addComponent(txt_tc_ile_sorgula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_cikisAl)
                            .addComponent(jLabel1)
                            .addComponent(txt_kaldigiGunSayisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_ad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_soyad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_tc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_tc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_odaNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_oda)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_kayitSayfasinaDon)
                        .addComponent(btn_cikisiAlinan))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_yinele)
                        .addComponent(btn_degistir)))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_silActionPerformed
        try {

            int row = tbl_oteldekiMusteriler2.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(this, "Lütfen silinecek kaydı seçiniz.");
            } else {
                kaydisil(tbl_oteldekiMusteriler2.getValueAt(row, 2).toString());
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lütfen silinecek kaydı seçiniz.");
        }
        tablodoldur();
    }//GEN-LAST:event_btn_silActionPerformed

    private void btn_tc_ile_sorgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tc_ile_sorgulaActionPerformed

        tablodoldur(txt_tc_ile_sorgula.getText());

    }//GEN-LAST:event_btn_tc_ile_sorgulaActionPerformed

    private void btn_tabloYenileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tabloYenileActionPerformed

        tablodoldur();

    }//GEN-LAST:event_btn_tabloYenileActionPerformed

    private void btn_cikisAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cikisAlActionPerformed
        // TODO add your handling code here:
        try {

            int selectedRow = tbl_oteldekiMusteriler2.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Önce bir kayıt seçiniz ve ardından müşterinin kaldığı gün sayısını giriniz!");
                return;
            }

            if (!(txt_kaldigiGunSayisi.getText().isEmpty())) {//veya tablonun secılı olup olmaması
                int row = tbl_oteldekiMusteriler2.getSelectedRow();
                if (row != -1) {
                    AyrilanMusteri musteri2 = new AyrilanMusteri();
                    musteri2.ad = tbl_oteldekiMusteriler2.getValueAt(row, 0).toString();
                    musteri2.soyad = tbl_oteldekiMusteriler2.getValueAt(row, 1).toString();
                    musteri2.tcKimlikNo = tbl_oteldekiMusteriler2.getValueAt(row, 2).toString();
                    musteri2.odaNumarasi = tbl_oteldekiMusteriler2.getValueAt(row, 3).toString();
                    musteri2.maliyet = Integer.parseInt(txt_kaldigiGunSayisi.getText()) * 85 + " TL'dir.";

                    musteriDurumuYenile(musteri2);
                    tablodoldur();
                    dlm.addElement("TC numarası " + musteri2.tcKimlikNo + " olan müşteriden alınacak ücret " + Integer.parseInt(txt_kaldigiGunSayisi.getText()) * 85 + " TL'dir.");
                    list_cikisiAlinanlar.setModel(dlm);
                } else {
                    JOptionPane.showMessageDialog(this, "Lütfen aradığınız kaydı seçiniz.");
                }

                list_cikisiAlinanlar.setModel(dlm);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Lütfen aradığınız kaydı seçiniz.");
        }

    }//GEN-LAST:event_btn_cikisAlActionPerformed

    private void btn_kayitSayfasinaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kayitSayfasinaDonActionPerformed

        this.setVisible(false);
        new KayitSayfasi_1().setVisible(true);
    }//GEN-LAST:event_btn_kayitSayfasinaDonActionPerformed

    private void txt_soyadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_soyadActionPerformed

    }//GEN-LAST:event_txt_soyadActionPerformed

    private void btn_degistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_degistirActionPerformed
        try {

            try {

            } catch (Exception e) {
            }
            int selectedRow = tbl_oteldekiMusteriler2.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Lütfen bir kayıt seçiniz.");
                return;
            }
            String[] secimler = {"Evet", "Hayır"};
            int secim = JOptionPane.showOptionDialog(this, "Değiştirmek istiyor musunuz?",
                    "Düzenleme Seçimi", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, secimler, secimler[0]);
            if (secim == 0) {

                txt_ad.setText(tbl_oteldekiMusteriler2.getValueAt(selectedRow, 0).toString());
                txt_soyad.setText(tbl_oteldekiMusteriler2.getValueAt(selectedRow, 1).toString());
                txt_tc.setText(tbl_oteldekiMusteriler2.getValueAt(selectedRow, 2).toString());
                txt_odaNo.setText(tbl_oteldekiMusteriler2.getValueAt(selectedRow, 3).toString());

            } else {
                JOptionPane.showMessageDialog(this, "Değişiklik yapılmadı.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("hata! " + e.getMessage());
        }

    }//GEN-LAST:event_btn_degistirActionPerformed

    private void btn_yineleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_yineleActionPerformed

        try {
            int selectedRow = tbl_oteldekiMusteriler2.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Lütfen bir kayıt seçiniz.");
                return;
            }

        } catch (Exception e) {
        }

        Musteri_1 m1 = new Musteri_1();
        m1.ad = txt_ad.getText();
        m1.soyad = txt_soyad.getText();
        m1.tcKimlikNo = txt_tc.getText();
        m1.odaNumarasi = txt_odaNo.getText();

        musteriDurumuYenile(m1);
        tablodoldur();

        txt_ad.setText(null);
        txt_soyad.setText(null);
        txt_tc.setText(null);
        txt_odaNo.setText(null);
    }//GEN-LAST:event_btn_yineleActionPerformed

    private void btn_cikisiAlinanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cikisiAlinanActionPerformed

        this.setVisible(false);
        new CikisiAlinanMusteriler_1().setVisible(true);
    }//GEN-LAST:event_btn_cikisiAlinanActionPerformed

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
            java.util.logging.Logger.getLogger(DuzenlemeSayfasi_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DuzenlemeSayfasi_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DuzenlemeSayfasi_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DuzenlemeSayfasi_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DuzenlemeSayfasi_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cikisAl;
    private javax.swing.JButton btn_cikisiAlinan;
    private javax.swing.JButton btn_degistir;
    private javax.swing.JButton btn_kayitSayfasinaDon;
    private javax.swing.JButton btn_sil;
    private javax.swing.JButton btn_tabloYenile;
    private javax.swing.JButton btn_tc_ile_sorgula;
    private javax.swing.JButton btn_yinele;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_ad;
    private javax.swing.JLabel lbl_oda;
    private javax.swing.JLabel lbl_rez;
    private javax.swing.JLabel lbl_soyad;
    private javax.swing.JLabel lbl_tc;
    private javax.swing.JList<String> list_cikisiAlinanlar;
    private javax.swing.JTable tbl_oteldekiMusteriler2;
    private javax.swing.JTextField txt_ad;
    private javax.swing.JTextField txt_kaldigiGunSayisi;
    private javax.swing.JTextField txt_odaNo;
    private javax.swing.JTextField txt_soyad;
    private javax.swing.JTextField txt_tc;
    private javax.swing.JTextField txt_tc_ile_sorgula;
    // End of variables declaration//GEN-END:variables

    private void tablodoldur() {
        dtm.setRowCount(0);

        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/OtelOtomasyon", "ahmet", "ahmet");
            String sql = "SELECT * FROM MUSTERI WHERE ISWORK=true";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                dtm.addRow(new String[]{rs.getString(2), rs.getString(3), rs.getString(1), rs.getString(4)});
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        tbl_oteldekiMusteriler2.setModel(dtm);
    }

    private void tablodoldur(String tc) {
        dtm.setRowCount(0);

        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/OtelOtomasyon", "ahmet", "ahmet");
            String sql = "SELECT * FROM MUSTERI WHERE ISWORK=true and TCNO=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tc);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                dtm.addRow(new String[]{rs.getString(2), rs.getString(3), rs.getString(1), rs.getString(4)});
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        tbl_oteldekiMusteriler2.setModel(dtm);
    }

    private void kaydisil(String tc) {
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/OtelOtomasyon", "ahmet", "ahmet");
            String sql = "DELETE FROM MUSTERI WHERE TCNO=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tc);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Kayıt kalıcı olarak silinmiştir.");
        } catch (Exception e) {
            System.out.println("Hata! " + e.getMessage());
        }
    }

    private void musteriDurumuYenile(AyrilanMusteri musteri2) {
        try {

            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/OtelOtomasyon", "ahmet", "ahmet");
            String sql = "UPDATE MUSTERI SET ISWORK = false, MALIYET = ? WHERE TCNO=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, musteri2.maliyet);
            ps.setString(2, musteri2.tcKimlikNo);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Kayıt güncellenmiştir.");
        } catch (Exception e) {
            System.out.println("Hata! " + e.getMessage());
        }
    }

    private void musteriDurumuYenile(Musteri_1 m1) {
        try {

            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/OtelOtomasyon", "ahmet", "ahmet");
            String sql = "UPDATE MUSTERI SET AD=?, SOYAD=?, TCNO=?, ODANO=? WHERE TCNO=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, m1.ad);
            ps.setString(2, m1.soyad);
            ps.setString(3, m1.tcKimlikNo);
            ps.setString(4, m1.odaNumarasi);
            ps.setString(5, m1.tcKimlikNo);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Kayıt güncellenmiştir.");
        } catch (Exception e) {
            System.out.println("Hata! " + e.getMessage());
        }

    }
}
