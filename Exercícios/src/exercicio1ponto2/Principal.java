package exercicio1ponto2;

public class Principal {

	public static void main(String[] args) {
		
		Validar validar = new Validar();
		
		
		String operacao = "2 (4 + 1) + 7 (2)";
		 
		System.out.println(validar.checkar(operacao));
		
	}

}
