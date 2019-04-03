package semanacinco;

public class Professor extends Pessoa{
	private String especialidade;
	private float salario;
	
	public void setespecialidade(String especialidade)
	{
		this.especialidade=especialidade;
	}
	
	public String getespecialidade(){
		return this.especialidade;
	}
	
	public void setSalario(float salar)
	{
		this.salario=salar;
	}
	
	public float getSalario(){
		return this.salario;
	}
	
	public void aumentarSalario(float sal)
	{
		this.salario=sal * 1.05f;
		System.out.println("Salario aumentado");
		
	}

	@Override
	public String toString() {
		return "Professor [especialidade=" + especialidade + ", salario=" + salario + "]";
	}
	
}
