/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundary;

import static controller.ControleUsuario.checaUsuario;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author Mr.W
 */
public class TelaLogin extends javax.swing.JFrame {

    
//	TelaPrincipal enviaNome;

    /**
     * Creates new form TelaInicial
     */
    public TelaLogin() {
        initComponents();

        ImageIcon ico = new ImageIcon("src/Images/seta.png");
        ico.setImage(ico.getImage().getScaledInstance(btnLogar.getWidth(), btnLogar.getHeight(), 1));
        btnLogar.setIcon(ico);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogar = new javax.swing.JLabel();
        lblNomeUsuario = new javax.swing.JLabel();
        lblSenhaUsuario = new javax.swing.JLabel();
        txtNomeUsuario = new javax.swing.JTextField();
        txtSenhaUsuario = new javax.swing.JPasswordField();
        lblLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCriar = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        btnLogar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogarMouseClicked(evt);
            }
        });
        getContentPane().add(btnLogar);
        btnLogar.setBounds(580, 494, 35, 35);

        lblNomeUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNomeUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomeUsuario.setText("Nome de Usuario");
        lblNomeUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblNomeUsuario);
        lblNomeUsuario.setBounds(470, 390, 110, 14);

        lblSenhaUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSenhaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblSenhaUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSenhaUsuario.setText("Senha");
        lblSenhaUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblSenhaUsuario);
        lblSenhaUsuario.setBounds(500, 440, 50, 14);

        txtNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeUsuarioActionPerformed(evt);
            }
        });
        txtNomeUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(txtNomeUsuario);
        txtNomeUsuario.setBounds(430, 410, 190, 25);

        txtSenhaUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(txtSenhaUsuario);
        txtSenhaUsuario.setBounds(430, 460, 190, 25);
        getContentPane().add(lblLogo);
        lblLogo.setBounds(290, 230, 440, 130);

        jLabel1.setForeground(new java.awt.Color(255, 91, 0));
        jLabel1.setText("Não tem conta?");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(430, 490, 100, 30);

        btnCriar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCriar.setForeground(new java.awt.Color(255, 0, 0));
        btnCriar.setText("CRIAR");
        btnCriar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCriar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCriarMouseClicked(evt);
            }
        });
        getContentPane().add(btnCriar);
        btnCriar.setBounds(520, 490, 50, 30);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg.jpg"))); // NOI18N
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, 0, 1030, 770);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void validaUsuario() {
        checaUsuario(txtNomeUsuario,txtSenhaUsuario);
        
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowOpened
        ImageIcon ico = new ImageIcon("src/Images/logo.png");
        ico.setImage(ico.getImage().getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), 1));
        lblLogo.setIcon(ico);
    }// GEN-LAST:event_formWindowOpened

    private void txtNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtNomeUsuarioActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtNomeUsuarioActionPerformed

    private void btnLogarMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnLogarMouseClicked
        validaUsuario();
    }// GEN-LAST:event_btnLogarMouseClicked

    private void btnCriarMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnCriarMouseClicked
        TelaCadastro chamaCadastro = new TelaCadastro();
        chamaCadastro.setVisible(true);
    }// GEN-LAST:event_btnCriarMouseClicked

    private void txtSenhaUsuarioKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtSenhaUsuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            validaUsuario();
        }
    }// GEN-LAST:event_txtSenhaUsuarioKeyPressed

    private void txtNomeUsuarioKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtNomeUsuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            validaUsuario();
        }
    }

    public static void main(String args[]) {

       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCriar;
    private javax.swing.JLabel btnLogar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNomeUsuario;
    private javax.swing.JLabel lblSenhaUsuario;
    private javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JPasswordField txtSenhaUsuario;
    // End of variables declaration//GEN-END:variables

}
