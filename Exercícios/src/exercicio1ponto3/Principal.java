package exercicio1ponto3;

public class Principal {

	public static void main(String[] args) {
		
		Conversor conv = new Conversor(); 
		
		
		int numero = conv.converter(null);
		
		System.out.println("valor de numero: " + numero);
		System.out.println("numero " + numero + " mais 12 igual: " + (numero + 12));
		
		
		
		
	}

}
