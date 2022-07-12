package exercicio2;

public class Pai implements InterfaceMembro {

	private String nome;
	
	
	
	public Pai(String nome) {
		this.nome = nome;
	}

	
	@Override
	public String getName() {
		
		return nome;
	}



	@Override
	public boolean interpretIsFamiliar(String contex) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
