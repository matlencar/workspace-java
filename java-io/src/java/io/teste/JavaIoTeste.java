package java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaIoTeste {

	public static void main(String[] args) throws IOException {
		//Fluxo de entrada com aarquivo
		
		FileInputStream fis = new FileInputStream("Novo texto.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
		System.out.println(linha);
		
		br.close();
	}

}
