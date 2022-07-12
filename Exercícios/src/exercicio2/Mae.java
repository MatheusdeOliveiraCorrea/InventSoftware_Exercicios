package exercicio2;

public class Mae implements InterfaceMembro{

	private String nome;
	
	
	public Mae(String nome) {
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
