/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package social;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Augusto
 */
public class Dados {
    
    private ArrayList <Usuario> usuarios;
    

    public Dados(){
        
        this.usuarios = new ArrayList <Usuario>();
    
    }
    
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    public void adicionarUsuarios(Usuario usuario){
        usuarios.add(usuario);
    }
    
    public void listarUsuarios()    {
    
            for(Usuario x : usuarios){
                System.out.println(x);
    }
    }
    
            
  private static final String nomeBanco = "banco.ser";

 public void serializar() {
      File arq = new File(nomeBanco);

      try {    
        ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(arq));
        objOutput.writeObject(this);
        objOutput.close();
    
      } catch(IOException erro) {
          System.out.printf("Erro: %s", erro.getMessage());
      }         
      }

    public Dados deserializar() {
      Dados rede = null;
      try {
        ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(nomeBanco));
        rede = (Dados)objInput.readObject();
        objInput.close();        
      } catch(IOException erro1) {
          System.out.printf("Erro: %s", erro1.getMessage());
      } catch(ClassNotFoundException erro2) {
          System.out.printf("Erro: %s", erro2.getMessage());
      }
        return rede;

    
    
}
    
}  

