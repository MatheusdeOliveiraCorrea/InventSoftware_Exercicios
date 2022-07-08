package exercicio1ponto3;


public class Conversor {


	public int converter(String s) {

		String[] partes = s.split(" "); //separar por espaços 
		
		String uniao = String.join("", partes);//remover espaços e tornar String

		int c = 0; //declarar variável inteira
		
		try {
			//converter de string para int
			c = Integer.parseInt(uniao); 
			
		} catch (Exception e) {			
			System.out.println("WARNING: Inserir apenas numeros validos... \n"
					+ "---Houve Excecao Java.---");

			c = 0; 			
		}

		return c; 
	}
	

	
	
}
