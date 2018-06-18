
package social;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;


public class Usuario implements Serializable {
    private String nome;
    private String biografia;
    private ArrayList<File> fotos;
    private String login;
    private String senha;
    private ArrayList<Usuario> amigosadd;
    private ArrayList<Usuario> amigosbloq;
    private ArrayList<Grupo> meusgrupos;
    private ArrayList<Postagem> postagens;
    
    
    
    
    public Usuario (String nome, String login, String senha){
        
        this.nome = nome;   
        this.fotos = new ArrayList<>();
        this.login = login;
        this.senha = senha;
        
        
        
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
    public void addFoto(File foto){
        fotos.add(foto);
    }
    
    public ArrayList<File> getFotos(){
        return this.fotos;
    }

    public Usuario() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getBiografia(){
        return biografia;
    }
    
    public void setBiografia(String biografia){
        this.biografia = biografia;
    }
    
    public void addAmigo(Usuario usuario){
        amigosadd.add(usuario);
    }
    
    public void bloqAmigo(){
        
    }
    
    public void addPost(Postagem postagem){
        postagens.add(postagem);
    }
    
    public void listarPostagens(){
        // usar for each
    }
    
    
    public static void main(String[] args){
        
        //classe de teste
        ArrayList<Usuario> usuarios = new ArrayList();
        
        Scanner scanner = new Scanner(System.in); //capturar o que for digitado, estilo scanf de C
        Usuario cenorinha = new Usuario();
        Postagem post1 = new Postagem("Primeira postagem");
        //cenorinha.addPost(post1);
        String email;
        String senha;
        int nPostagens;
        String nome;
        int nUsuarios;
        System.out.println("Numero de usuarios: ");
        nUsuarios = Integer.parseInt(scanner.nextLine());
        
        
        for(int i = 0; i < nUsuarios; i++){
        System.out.println("Nome: ");
        nome = scanner.nextLine();
        System.out.println("Email: ");
        email = scanner.nextLine();
        System.out.println("Senha: ");
        senha = scanner.nextLine();
        Usuario usuario = new Usuario(nome, email,senha);
        usuarios.add(usuario);
        }
        //nPostagens = Integer.parseInt(scanner.nextLine()) transforma em inteiro
        /*for (int = 0; i < nPostagens; i++){
            String conteudo = scannet.NextLine();
        
        
            Postagem postagem = new Postagem(conteudo);     add post
            usuario.addPost(postagem);
        
        
            usuario.addPostagem(new Postagem(conteudo));    outra forma de add post
        
    }*/
        //escrever usuarios para arquivo
        //fileoutputstream = arquivo de saida de stream(fluxo de dados)
        try {
        FileOutputStream fos = new FileOutputStream("usuarios.ser"); //
        ObjectOutputStream out = new ObjectOutputStream(fos);
        out.writeObject(usuarios); //escrita
        out.flush(); //forçando a gravar no arquivo
        out.close(); //fechando o arquivo, mas nao precisa
        fos.close();
}
        catch (FileNotFoundException e){// capturar a exceção, pula a parte dos erros e exibe o comentario do system
        System.out.println("Houve um erro na abertura do arquivo");
        //System.out.println(e.getMessage());
        }
        
        catch(IOException e){ // todas as exceçoes do tipo IOException QUALQUER, vem pra ca
        //e.getMessage();
        System.out.println("Houve um erro na leitura do arquivo");
        //e.printStackTrace(); serve para mostrar aonde foi o erro, pois há varias IOException e não se sabe qual delas causou o erro
        } 
//        catch(ClassNotFoundException ex){
//            System.out.println("Erro interno do sistema");//
//        }
        
}
    
    
    /*  FileInputStream fis = new DileInputStream("usuario.ser");
        ObjectInputStream in = new ObjectInputStream(fis);
        usuarios = (ArrayList) in.readObject();
    */
    
    
}
    


