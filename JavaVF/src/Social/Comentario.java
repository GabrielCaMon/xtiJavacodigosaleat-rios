package Social;

import java.util.ArrayList;
import java.util.List;

public class Comentario extends Publicacao{
 
	private Postagem comentario ;
	public Comentario(String titulo,String texto, String usuario) {
		super(titulo, texto, usuario);		
	}
	public Postagem getComentario() {
		return comentario;
	}
	public void Postagem(Postagem comentario) {
		this.comentario = comentario;
	}
	public void setComentario(Postagem comentario) {
		this.comentario = comentario;
	}
	
	
	
}
