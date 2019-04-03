package semanacinco;

public class Pessoa {
	
		private String nome;
		private int idade;
		private String sexo;	


	public void setNome(String name){
		this.nome=name;
		}
		
	public String getNome(){
	return this.nome;
	}
	
	
	public void setIdade(int age){
		this.idade=age;
		}
		
	public int getIdade(){
	return this.idade;
	}
	
	public void setSexo(String sexo)
	{
		this.sexo=sexo;
	}
	
	public String getSexo(){
		return this.sexo;
	}
	
	
	public void fazaniver()
	{
		this.idade=this.idade +1;
		System.out.println("Idade atualizada para:"+ idade);
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}
	
	
}