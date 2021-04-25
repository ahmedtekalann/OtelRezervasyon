import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;

public class Giris_1 extends javax.swing.JFrame {

    //KeyPressed kp = new KeyPressed();
    public Giris_1() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.getContentPane().setBackground(Color.cyan.darker());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_ad = new javax.swing.JLabel();
        lbl_sifre = new javax.swing.JLabel();
        txt_adminAd = new javax.swing.JTextField();
        pass_adminSifre = new javax.swing.JPasswordField();
        lbl_rez = new javax.swing.JLabel();
        btn_giris = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Giriş");

        lbl_ad.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        lbl_ad.setText("Kullanıcı Adı: ");

        lbl_sifre.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        lbl_sifre.setText("Sifre: ");

        pass_adminSifre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pass_adminSifreKeyPressed(evt);
            }
        });

        lbl_rez.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        lbl_rez.setText("     Otel Rezervasyon");

        btn_giris.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        btn_giris.setText("Giris");
        btn_giris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_girisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(lbl_sifre))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbl_ad)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pass_adminSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_adminAd, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_giris, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lbl_rez, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbl_rez, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_adminAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_ad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pass_adminSifre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_sifre, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(30, 30, 30)
                .addComponent(btn_giris)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_girisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_girisActionPerformed

        String kullaniciAdi = "Ahmed";
        String sifre = "123";
        boolean kontrol;
        if (txt_adminAd.getText().equals(kullaniciAdi) && pass_adminSifre.getText().equals(sifre)) {
            this.setVisible(false);
            new KayitSayfasi_1().setVisible(true);
            kontrol = true;
        } //          else if (!(txt_ad.getText().equals(kullaniciAdi))) {
        //            kontrol = false;
        //            JOptionPane.showMessageDialog(this, "Kullanıcı adı Hatalı.");
        //            txt_ad.setText(" ");
        //            pass_sifre.setText("");
        //        } else if (!(pass_sifre.getText().equals(sifre))) {
        //            kontrol = false;
        //            JOptionPane.showMessageDialog(this, "Şifre Hatalı.");
        //            txt_ad.setText(" ");
        //            pass_sifre.setText("");
        //} 
        else {
            kontrol = false;
            JOptionPane.showMessageDialog(this, "Kullanıcı adı veya Şifre Hatalı.");
            txt_adminAd.setText(" ");
            pass_adminSifre.setText("");
        }


    }//GEN-LAST:event_btn_girisActionPerformed

    private void pass_adminSifreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pass_adminSifreKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            String kullaniciAdi = "Ahmed";
            String sifre = "123";
            boolean kontrol;
            if (txt_adminAd.getText().equals(kullaniciAdi) && pass_adminSifre.getText().equals(sifre)) {
                this.setVisible(false);
                new KayitSayfasi_1().setVisible(true);
                kontrol = true;
            } //          else if (!(txt_ad.getText().equals(kullaniciAdi))) {
            //            kontrol = false;
            //            JOptionPane.showMessageDialog(this, "Kullanıcı adı Hatalı.");
            //            txt_ad.setText(" ");
            //            pass_sifre.setText("");
            //        } else if (!(pass_sifre.getText().equals(sifre))) {
            //            kontrol = false;
            //            JOptionPane.showMessageDialog(this, "Şifre Hatalı.");
            //            txt_ad.setText(" ");
            //            pass_sifre.setText("");
            //} 
            else {
                kontrol = false;
                JOptionPane.showMessageDialog(this, "Kullanıcı adı veya Şifre Hatalı.");
                txt_adminAd.setText(" ");
                pass_adminSifre.setText("");
            }

        }
    }//GEN-LAST:event_pass_adminSifreKeyPressed

    /*public class KeyPressed extends AdminGirisi implements KeyListener{

        @Override
        public void keyTyped(KeyEvent ke) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void keyPressed(KeyEvent ke) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void keyReleased(KeyEvent ke) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }*/
 /*public  void KeyPressed(){
        this.setBounds(10, 20, 600, 50);
        btn_giris.setBounds(10, 20, 260, 60);
        this.getContentPane().setLayout(null);
        this.getContentPane().add(btn_giris);
        this.addKeyListener((KeyListener) this);
    }*/
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
            java.util.logging.Logger.getLogger(Giris_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Giris_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Giris_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Giris_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Giris_1().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_giris;
    private javax.swing.JLabel lbl_ad;
    private javax.swing.JLabel lbl_rez;
    private javax.swing.JLabel lbl_sifre;
    private javax.swing.JPasswordField pass_adminSifre;
    private javax.swing.JTextField txt_adminAd;
    // End of variables declaration//GEN-END:variables
}
