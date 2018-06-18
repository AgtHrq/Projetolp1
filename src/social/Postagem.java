
package social;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public class Postagem implements Serializable {
    
    private Comentario comentario;    
    private String autor;
    private ArrayList<File> fotos;
    private String comment;

    public Postagem(String comment) {
        this.comment = comment;
    }

    public Comentario getComentario() {
        return comentario;
    }
    
    public String getAutor() {
        return autor;
    }
    
}
