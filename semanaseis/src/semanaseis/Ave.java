package semanaseis;

public class Ave extends Animal {
	private String corPena;
	
	public void fazerNinho()
	{
		System.out.println( "Ninho feito");
	}
		@Override 
		public void locomover()
		{
			System.out.println( "voar");
		}
		@Override 
		public void alimentar()
		{
			System.out.println( "comendo sementes");
		}
		@Override 
		public void emitirSom()
		{
			System.out.println( "piar");
		}
		public String getCorPena() {
			return corPena;
		}
		public void setCorPena(String corPena) {
			this.corPena = corPena;
		}

}
