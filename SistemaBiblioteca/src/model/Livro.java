package model;

public class Livro {
	
	private String autor, nome, editora, areaAdvocacia;
	
	
	public Livro(){
		
	}


	public Livro(String autor, String nome, String editora, String areaAdvocacia) {
		super();
		this.autor = autor;
		this.nome = nome;
		this.editora = editora;
		this.areaAdvocacia = areaAdvocacia;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEditora() {
		return editora;
	}


	public void setEditora(String editora) {
		this.editora = editora;
	}


	public String getAreaAdvocacia() {
		return areaAdvocacia;
	}


	public void setAreaAdvocacia(String areaAdvocacia) {
		this.areaAdvocacia = areaAdvocacia;
	}
	

	

}
