package entities;

public class Aluno {
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	public double total = 100;
	
	public double media() {
		return nota1 + nota2 + nota3;
	}
	
	public double mediaEscola() {
		return (60 * total) / 100;
	}
	
	public double notaRestante() {
		return mediaEscola() - media();
	}
	
}
