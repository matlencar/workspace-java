import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		int id = sc.nextInt();
		System.out.println("The employee id is : " + id);
		
		double hora = sc.nextDouble();
		double salary = sc.nextDouble();
		
		double salarioTotal;
		
		salarioTotal = hora * salary;
		
		System.out.printf("The total salary is : %.2f%n ",salarioTotal);
		
	}

}
