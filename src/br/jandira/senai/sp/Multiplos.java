package br.jandira.senai.sp;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int valorA, valorB, resultado, i;

		System.out.println("Insira o valor A sendo menor que o valor de B:");
		valorA = teclado.nextInt();

		System.out.println("Insira o valor B:");
		valorB = teclado.nextInt();

		resultado = valorA + valorB;

		if (resultado % 6 == 0) {
			System.out.println("O resultado  " + resultado + " é múltiplo de 6");
		} else {
			System.out.println("O resultado " + resultado + " não é múltiplo de 6");
		}

		System.out.println("Múltiplos de 6 dentro do intervalo:");
		i = valorA;
		while (i <= valorB) {
			if (i % 6 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
