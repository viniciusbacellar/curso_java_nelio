import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Main3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		aluno.name = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		if(aluno.media() >= aluno.mediaEscola()) {
			System.out.printf("FINAL GRADE = %.2f%nPASS", aluno.media());
		}
		else {
			System.out.printf("FINAL GRADE = %.2f%n", aluno.media());
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", aluno.notaRestante());
		}
		
		
		sc.close();
	}

}
