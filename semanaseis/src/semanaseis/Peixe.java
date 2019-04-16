package semanaseis;

public class Peixe extends Animal {
private String corEscama;
private String soltarBolha;
	
	@Override 
	public void locomover()
	{
		System.out.println( "nadar");
	}
	@Override 
	public void alimentar()
	{
		System.out.println( "comendo algas");
	}
	@Override 
	public void emitirSom()
	{
		System.out.println( "peixe não faz som");
	}

}
