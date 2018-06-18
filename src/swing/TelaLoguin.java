/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import social.Dados;
import social.Usuario;

/**
 *
 * @author Iara
 */
public class TelaLoguin extends javax.swing.JFrame {

    private List <Usuario> usuarios;
    public static Dados dados;
    private TelaPerfil2 telaperfil;
            
    public TelaLoguin() {
        initComponents();
        usuarios = new ArrayList<Usuario>();
//        this.dados = deserializar();
       // if(dados == null){
            
        this.dados = new Dados();
    }
    
    public TelaPerfil2 getTelaPerfil(){
        return telaperfil;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEntrar = new javax.swing.JButton();
        txtSenha = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        txtCLogin = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCNome = new javax.swing.JTextField();
        txtCSenha = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(null);

        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(170, 260, 63, 23);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(140, 220, 120, 30);

        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });
        getContentPane().add(txtLogin);
        txtLogin.setBounds(140, 170, 120, 30);

        txtCLogin.setText("Digite um login");
        txtCLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCLoginActionPerformed(evt);
            }
        });
        getContentPane().add(txtCLogin);
        txtCLogin.setBounds(460, 200, 120, 30);

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(1107, 64, 0, 0);

        jLabel1.setText("Criar Login:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(371, 210, 80, 14);

        jLabel2.setText("Criar Senhar:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(370, 250, 90, 14);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Ainda não possuo conta?");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(390, 110, 200, 30);

        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(460, 280, 90, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Bem-vindo(a) à Área 201");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 40, 300, 40);

        jLabel4.setText("Login:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 180, 40, 14);

        jLabel6.setText("Senha:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 220, 50, 20);

        jLabel7.setText("Nome:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(387, 170, 50, 14);

        txtCNome.setText("Digite seu nome");
        txtCNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtCNome);
        txtCNome.setBounds(460, 160, 120, 30);

        txtCSenha.setText("Digite uma senha");
        txtCSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtCSenha);
        txtCSenha.setBounds(460, 240, 120, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Fazer Login");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(140, 120, 110, 22);

        setSize(new java.awt.Dimension(639, 506));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
             int i = 0;
        //usuarios = dados.getUsuarios();
        for(Usuario usuario: usuarios ){
           
            if(usuario.getLogin().equals(txtLogin.getText()) && usuario.getSenha().equals(txtSenha.getText())){            
                
                JOptionPane.showMessageDialog(null, "Bem Vindo(a)");
                TelaPerfil2 telaperfil = new TelaPerfil2(usuario);
                this.telaperfil = telaperfil;
                telaperfil.setVisible(true);
                dispose();
                i=2839283;
                break;
                
                
            }else{
            
                i++;
                
        }}
         if(i != 2839283){
            JOptionPane.showMessageDialog(null, "Loguin e/ou senha incorretos");
        }
        
        
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

    private void txtCLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCLoginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        Usuario nova = new Usuario(txtCNome.getText(), txtCLogin.getText(), txtCSenha.getText());
        dados.adicionarUsuarios(nova);
        usuarios.add(nova);
        
        
        
        JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
// dados.serializar();
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCNomeActionPerformed

    private void txtCSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCSenhaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaLoguin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLoguin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLoguin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLoguin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Dados dados = new Dados();
                TelaLoguin loguin1 = new TelaLoguin();
                loguin1.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCLogin;
    private javax.swing.JTextField txtCNome;
    private javax.swing.JTextField txtCSenha;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}
