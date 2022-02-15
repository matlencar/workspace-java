package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		Rectangle rectangle = new Rectangle();

		System.out.println("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();

		System.out.println("-----------------------------------");
		System.out.printf("Area = %.2f ", rectangle.totalArea());
		System.out.println();
		System.out.printf("Perimeter = %.2f ", rectangle.totalPerimeter());
		System.out.println();
		System.out.printf("Diagonal = %.2f ", rectangle.totalDiagonal());

		sc.close();

	}

}
