package exercicio1;

import java.util.Scanner;

public class Piramide {


	public static float getMenorValor(float[] array) {
		
		float menor = 0;
		
		
		if(array.length == 1) {
			
			menor = array[0];
			
		}
		
		
		if(array.length > 1) {
			
			float a = array[0];
			
			for(int j = 0; j < array.length ; j++) {
	
				if(a> array[j]) {
					a= array[j];
				}
				
				menor = a; 
			}
				
		}
		
		return menor;
	}
	
	
	
	
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
		int sair = 0; //flag para sair do while 
		int contadorindex = 1; // atribuir valores em funcao do index da piramide 
		float[] piramide = new float[15]; // array com 15 valores que representa a piramide

		Scanner input = new Scanner(System.in);

		// Pegar valores do usuário. Essa estrutura for vai se repitir
		// 5 vezes, ou seja, para na linha 5. O que configura a qtd máxima para as
		// linhas.
		for (int i = 0; i < 5; i++) {
			
			float valor;

			if (i == 0) {// simplesmente usa a palavra "topo" no System.out.print(); pq é o topo da
							// piramide

				System.out.println("Digite o numero do topo/raiz da piramide: ");
				valor = input.nextFloat();
				piramide[i] = valor; // primeira posição do array [0]

			} else { /* SEMPRE quando não for o primeiro valor do vetor piramide[] */

				
				
				// Codigo para retornar a linha atual da piramide em line (int) 
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

				while (w > 0 && sair == 0) {
					
					System.out.printf("Digite o valor dos numeros da linha: " + line + "\n" );
					valor = input.nextFloat();
					if(valor == -999f) {
						sair = 1;
						System.out.println("sair recebeu: "+ sair);
						break;
					}
					piramide[contadorindex] = valor;
        
					contadorindex++;
					w--;
				
					
				} // fim while

				
			} // fim else

		} // fim for

		
		
		
		//Manualmente atribuindo uma variável do tipo array para cada linha 
		float root = piramide[0]; 
		float[] linha2 = {piramide[1] , piramide[2]};
		float[] linha3 = {piramide[3], piramide[4], piramide[5]};
		float[] linha4 = {piramide[6], piramide[7], piramide[8], piramide[9]};
		float[] linha5 = {piramide[10], piramide[11], piramide[12],piramide[13], piramide[14]};
		

		//Pegando menor valor de cada linha
		float menorvalor2 = getMenorValor(linha2);
		float menorvalor3 = getMenorValor(linha3);
		float menorvalor4 = getMenorValor(linha4);
		float menorvalor5 = getMenorValor(linha5);
		
		
		float soma = root + menorvalor2 + menorvalor3 + menorvalor4 + menorvalor5 ;
		
		
		
		System.out.println("---> SOMA DOS MENORES VALORES: " + soma);
		


	}
}
