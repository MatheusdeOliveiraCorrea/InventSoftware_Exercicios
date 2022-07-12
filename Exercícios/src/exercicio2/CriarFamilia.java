package exercicio2;

public class CriarFamilia implements InterfaceMembro{

	private String nomemae = "";
	private String nomepai = "";
	private String nomefilho = "";
	
	
	public CriarFamilia(InterfaceMembro mae, InterfaceMembro pai, InterfaceMembro filho) {
		this.nomemae = mae.getName();
		this.nomepai = pai.getName();
		this.nomefilho = filho.getName();
	}

	
	public InterfaceMembro criar(String nomemae, String nomepai, String nomefilho) {
		
		InterfaceMembro mae = new Mae(nomemae);
		InterfaceMembro pai = new Pai(nomepai);
		InterfaceMembro filho = new Filho(nomefilho);
	
		
		return new CriarFamilia(mae, pai, filho);
	}
	
	
	@Override
	public boolean interpretIsFamiliar(String context) {
		
		if(context.contains(nomemae) || context.contains(nomepai) || context.contains(nomefilho)) {
			return true;
		}else {
			return false;
		}
		

	}
	
	
	public boolean interpretFilho(String context) {
		
		if(context.contains(nomefilho)) {
			return true;
		}else {
			return false;
		}
		
	}


	@Override
	public String getName() {
		
		return null;
	}
	
	
	
}
