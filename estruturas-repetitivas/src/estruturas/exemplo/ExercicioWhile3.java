package estruturas.exemplo;

import java.util.Scanner;

public class ExercicioWhile3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int produtos = sc.nextInt();

		while (produtos != 4) {

			if (produtos == 1) {
				alcool = alcool + 1;
				
			} else if (produtos == 2) {
				gasolina = gasolina + 1;
				
			} else if (produtos == 3) {
				diesel = diesel + 1;
				
			}

			produtos = sc.nextInt();
		}

		System.out.println("Muito obrigado ");
		System.out.println("Alcool " + alcool);
		System.out.println("Gasolina " + gasolina);
		System.out.println("diesel " + diesel);

		sc.close();
	}

}
