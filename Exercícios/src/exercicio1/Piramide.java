package exercicio1;

import java.util.Scanner;

public class Piramide {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*        Representação Visual da Piramide
		 * 
		 * 4 -->  primeira linha
		 * 2 6 -->  segunda linha 
		 * 5 8 3 -->  terceira linha (MINIMO) 
		 * 7 0 6 5 --> quarta linha 
		 * 6 2 1 9 8 --> quinta linha (MÁXIMO) - 
		 *
		 * max de números total: 15
		 * 
		 * 
		 * Soma: 4 + 2 + 3 + 0 + 1 = 10
		 * 
		 */

		int contadorindex = 1; // ver linha 81 ou próximo
		float[] piramide = new float[15]; // array com 15 valores que representa a piramide

		Scanner input = new Scanner(System.in);

		// Pegar valores do usuário. Essa estrutura for vai se repitir
		// 5 vezes, ou seja, para na linha 5. O que configura a qtd máxima para as
		// linhas.
		for (int i = 0; i < 5; i++) {

			String flag = "ok";
			float valor;

			if (i == 0) {// simplesmente usa a palavra "topo" no System.out.print(); pq é o topo da
							// piramide

				System.out.println("Digite o numero do topo/raiz da piramide: ");
				valor = input.nextFloat();
				piramide[i] = valor; // primeira posição do array [0]

			} else { /* SEMPRE quando não for o primeiro valor do vetor piramide[] */

				/* Codigo para retornar a linha atual da piramide */

				// retornar qual linha atual, valor guardado em int line ...
				int line = 0;
				for (int linha = 1; linha <= i + 1; linha++) {
					line = linha;
				}

				// enfim a repetição para cada linha usando while
				int w = line;
				int index = i;

				// quando o i = 1 repitir 2x (linha 2)
				// quando o i = 2 repitir 3x (linha 3)
				// quando o i = 3 repitir 4x (linha 4)
				// quando o i = 4 repitir 5x (linha 5)

				while (w > 0) { // repetir a mesma pergunta em função da linha

					System.out.printf("Digite o valor dos numeros da linha %d:\n",
							line + " digite 'ok' para parar de inserir numeros");
					valor = input.nextFloat();

					piramide[contadorindex] = valor;// atribui corretamente a cada linha seus valores

					contadorindex++;
					w--;
				} // fim while

			} // fim else

		} // fim for

		// Mostrar bonito na tela
		int cont = 1;
		// percorrer todos os elementos de uma piramide
		for (int i = 0; i < piramide.length; i++) {

			String pular = "\n";
			System.out.print("\t" + piramide[i] + pular);
			/*
			 * System.out.print("\t" +piramide[1] + "  "); System.out.println("\t"
			 * +piramide[2] + "  "); System.out.print("\t" +piramide[3] + "  ");
			 * System.out.print("\t" +piramide[4] + "  "); System.out.println("\t"
			 * +piramide[5] + "  "); System.out.print("\t" +piramide[6] + "  ");
			 * System.out.print("\t" +piramide[7] + "  "); System.out.print("\t"
			 * +piramide[8] + "  "); System.out.println("\t" +piramide[9] + "  ");
			 * System.out.print("\t" +piramide[10] + "  "); System.out.print("\t"
			 * +piramide[11] + "  "); System.out.print("\t" +piramide[12] + "  ");
			 * System.out.print("\t" +piramide[13] + "  "); System.out.println("\t"
			 * +piramide[14] + "  ");
			 */

		}

	}
}
