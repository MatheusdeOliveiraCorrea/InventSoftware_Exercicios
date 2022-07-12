package exercicio2;

public class Filho implements InterfaceMembro{

	
	private String nome;
	
	
	public Filho(String nome) {
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
