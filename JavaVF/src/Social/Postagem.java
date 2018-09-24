package Social;

import java.util.ArrayList;
import java.util.List;




public class Postagem extends Publicacao{
	

	List<Comentario> comentario;
	
	public Postagem(String titulo, String texto, String usuario) {
		super(titulo, texto, usuario);
	}
	public void adicionarComentario (Comentario comentario) {
		comentario = new Comentario(titulo,texto, usuario);
	this.comentario.add(comentario);
	
}
}