/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import social.Usuario;
/**
 *
 * @author aluno
 */
public class btnEditarListener implements ActionListener {
    private Usuario usuario;
    private JToggleButton btnEditar;
    private JTextArea txtBiografia;

public btnEditarListener (Usuario usuario, JToggleButton btnEditar, JTextArea txtBiografia){
    this.usuario = usuario;
    this.btnEditar = btnEditar;
    this.txtBiografia = txtBiografia;
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if (btnEditar.isSelected()){
            txtBiografia.setEditable(true);
        }else{
            txtBiografia.setEditable(false);
            
            String biografia = txtBiografia.getText();
            usuario.setBiografia(biografia);
        }
    }
    
}
