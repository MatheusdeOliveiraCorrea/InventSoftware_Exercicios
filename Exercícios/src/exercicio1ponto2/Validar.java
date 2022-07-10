package exercicio1ponto2;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Validar {
	
   private List<Character> fechamento = new ArrayList<Character>();
   private List<Character> abertura = new ArrayList<Character>();	
	
	public boolean checkarQuantidade(String operacao) {
		
		boolean resultado = false;
		
		
		//char[] abertura = {'(' , '[', '{'}
		
		abertura.add('(');
		abertura.add('[');
		abertura.add('{');
		
		//char[] fechamento = {')', ']', '}'}
		
		fechamento.add(')');
		fechamento.add(']');
		fechamento.add('}');
		
		int cont_abrt = 0;
		int cont_fchmt = 0; 
		
		
		for(int i = 0; i < operacao.length(); i++) {
			
			
			
			//Primeiro for para contar os fechamentos
			for (Character character : fechamento) {
				
				if(character == operacao.charAt(i)) {
					cont_fchmt++;
				}
				
			}
			
			//Segundo para contar as aberturas
			for (Character character : abertura) {
				
				if(character == operacao.charAt(i)) {
					cont_abrt++;
				}
				
			}
		
			
			
			

		}
		
		
		if((cont_abrt + cont_fchmt) % 2 == 0) {
			
			resultado = true;
			
		}
		
		
		return resultado;
	}
	
	
	
	
	
	
	
	
	
	public boolean checkar (String expressao)  {
		
		boolean res = true;
		boolean sit1, sit2, sit3;
		sit1 = sit2 = sit3 = true;

		if(this.checkarQuantidade(expressao)) { 
			
			Queue<Character> queue = new LinkedList<Character>();
			
			Stack<Character> stack = new Stack<Character>();

			 
			for (int i = 0; i < expressao.length(); i++) {
				

				for (Character character : abertura) {
					
					if(character == expressao.charAt(i)) {
						
						queue.add(character);
						
					}
					
					
				}
				
				
				for (Character character : fechamento) {
					
					if(character == expressao.charAt(i)) {
						stack.push(character);						
					}
					
				}
				
				
				}
				

			
			char[] abertura = new char[3];
			char[] fechamento = new char[3];
					
			for(int i = 0; !queue.isEmpty(); i++ ) {
				
				abertura[i] = queue.remove();
				
			}
			
			for(int i = 0;!stack.isEmpty(); i++ ) {
				
				fechamento[i] = stack.pop();
				
			}
			
			
			for(int j = abertura.length - 1; j > 0; j--) {
				
				if(abertura[j] == '(') {
					if(fechamento[j] != ')') {
						sit1 = false;
					}
				}
				
				
				
				if(abertura[j] == '[') {
					if(fechamento[j] != ']') {
						sit2 = false;
					}
				}
				
				if(abertura[j] == '{') {					
					if(fechamento[j] != '}') {
						sit3 = false;
					}
					
					
				}
				
					
			}
			
			
			
			
		}else {
			
			System.out.println("Expressão com erro... ");	
			
		}
		
		res = sit1 && sit2 && sit3;
		
		return res; 
		
	}
	
	
	
}
