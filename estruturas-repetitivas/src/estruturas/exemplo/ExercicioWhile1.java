package estruturas.exemplo;

import java.util.Scanner;

public class ExercicioWhile1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int xSenha = sc.nextInt();

		while (xSenha != 2002) {

			System.out.println("Senha invalida !! ");
			xSenha = sc.nextInt();

		}

		System.out.println("Acesso permitido ");

		sc.close();
	}

}
