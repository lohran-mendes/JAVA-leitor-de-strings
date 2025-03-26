package Faculdade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		int quantidadeDeNomes;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de nomes:");
		quantidadeDeNomes = entrada.nextInt();
		
		for(int i = 0; i < quantidadeDeNomes; i++) {
			array.add(entrada.next());
		}
		
		System.out.println("array na ordem normal: " + array);
		Collections.reverse(array);
		System.out.println("array na ordem inversa: " + array);
	}

}
