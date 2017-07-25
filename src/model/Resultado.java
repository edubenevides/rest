package model;

import java.util.Date;
import java.util.List;

public class Resultado {
	
	private String numeroConcurso;
	private List<Integer> numerosSorteados;
	private Date data;
	
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getNumeroConcurso() {
		return numeroConcurso;
	}
	public void setNumeroConcurso(String numeroConcurso) {
		this.numeroConcurso = numeroConcurso;
	}
	public List<Integer> getNumerosSorteados() {
		return numerosSorteados;
	}
	public void setNumerosSorteados(List<Integer> numerosSorteados) {
		this.numerosSorteados = numerosSorteados;
	}
	
	public Resultado(String numeroConcurso, List<Integer> numerosSorteados, Date data) {
		super();
		this.numeroConcurso = numeroConcurso;
		this.numerosSorteados = numerosSorteados;
		this.data = data;
	}
	public Resultado() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
