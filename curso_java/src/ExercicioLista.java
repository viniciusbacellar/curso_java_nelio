import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregado;

public class ExercicioLista {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		List<Empregado> list = new ArrayList<>();
		System.out.println();
		
		
		
		for (int i=1; i<=n; i++) {
			System.out.println("Employee #" + i + ":");
			System.out.print("Id:");
			Integer id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.println("Id already taken! Try again: ");
				id = sc.nextInt();
			}
			System.out.print("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary:");
			Double salary = sc.nextDouble();
			Empregado empregado = new Empregado(id, name, salary);
			list.add(empregado);
			System.out.println();
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		Integer idsalary = sc.nextInt();
		Integer pos = position(list, idsalary);
		
		if(pos == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increasedSalary(percent);
		}
		System.out.println();
		System.out.println("List of employees:");
		for (Empregado empregado : list) {
			System.out.println(empregado);
		}
		sc.close();
	}
	
	public static Integer position(List<Empregado> list, int id) {
		for (int i=0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	
	public static boolean hasId(List<Empregado> list, int id) {
		Empregado empregado = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return empregado != null;
	}
	
	

}
