package ar.com.unpaz.model;

public class RecursoNecesario {
	private String codigo;
	private int cantidadNecesaria;
	
	public RecursoNecesario() {
		// TODO Auto-generated constructor stub
	}
	
	public RecursoNecesario(String codigo, int cantidadNecesaria) {
		super();
		this.codigo = codigo;
		this.cantidadNecesaria = cantidadNecesaria;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getCantidadNecesaria() {
		return cantidadNecesaria;
	}
	public void setCantidadNecesaria(int cantidadNecesaria) {
		this.cantidadNecesaria = cantidadNecesaria;
	}
}
