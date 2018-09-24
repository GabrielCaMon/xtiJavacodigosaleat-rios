package Social;

import java.util.ArrayList;

public abstract class Publicacao {

	String titulo;
	String texto;
	String usuario;
	
	private ArrayList<Postagem> postagens;

	
	public Publicacao(String titulo, String texto, String usuario) {
		this.titulo = titulo;
		this.texto = texto;
		this.usuario = usuario;
	}


	


}
