
package social;

public class Comentario {
   private String comentario;

    public Comentario(String comentario) {
        if(comentario != ""){
            this.comentario = comentario;
        }
        else{
            //não faz nada
        }
    }

    public String getComentario() {
        return comentario;
    }
   
}
