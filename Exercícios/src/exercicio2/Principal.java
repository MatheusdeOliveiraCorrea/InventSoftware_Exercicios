package exercicio2;

public class Principal {
	

	public static InterfaceMembro getfamilia(String nomemae, String nomepai, String nomefilho) {
		
		InterfaceMembro mae = new Mae(nomemae);
		InterfaceMembro pai = new Pai(nomepai);
		InterfaceMembro filho = new Filho(nomefilho);
		
		return new CriarFamilia(mae, pai, filho);
		
	}
	
	
	public static void main(String[] args) {
	
		
		InterfaceMembro familia1 = getfamilia("Claudia", "Roberto" , "Luis");
		
		boolean res1 = familia1.interpretIsFamiliar("Roberto");
			
		System.out.println("Roberto faz parte da familia 1? " + res1);
			
		InterfaceMembro familia2 = getfamilia("Lucia", "Patrick", "Paulina");
		
		boolean res2 = familia2.interpretIsFamiliar("Paulina");
		
		
		System.out.println("Paulina faz parte da familia 2? " + res2);
		
	}

}
