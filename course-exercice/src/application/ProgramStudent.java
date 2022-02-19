package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ProgramStudent {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		Student student = new Student();
		
		System.out.println("Nome do aluno : ");

		student.name = sc.nextLine();
		
		System.out.println();
		System.out.println("Notas do aluno:");
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();

		System.out.printf("Final grade: %.2f%n", student.finalGrade());

		if (student.finalGrade() < 60.0) {
			System.out.println("Failed");
			System.out.printf("Missing  %.2f points%n", student.missingPoints());
		} else {
			System.out.println("Pass");
		}

		sc.close();

	}

}
