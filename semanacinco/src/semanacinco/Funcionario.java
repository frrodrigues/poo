package semanacinco;

public class Funcionario extends Pessoa {
	
	private String setor;
	private boolean trabalhando;
	
	public void setSetor(String set)
	{
		this.setor=set;
	}
	
	public String getsetor(){
		return this.setor;
	}

	public Funcionario()
	{
		this.trabalhando=true;
	}
	
	public void mudarTrabalho()
	{
		this.trabalhando= !(this.trabalhando);
		System.out.println("Status atualizado");
	}

}
