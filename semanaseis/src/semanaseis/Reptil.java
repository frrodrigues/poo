package semanaseis;

public class Reptil extends Animal {
private String corEscama;
	
	@Override 
	public void locomover()
	{
		System.out.println( "Rstejar");
	}
	@Override 
	public void alimentar()
	{
		System.out.println( "ca�ando");
	}
	@Override 
	public void emitirSom()
	{
		System.out.println( "som de reptil");
	}

}
