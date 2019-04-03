package semanacinco;

public class Aluno extends Pessoa  {
	private String mat;
	private String curso;
	
	public void setMat(String matric)
	{
		this.mat=matric;
	}
	
	public String getMat(){
		return this.mat;
	}
	
	public void setCurso(String curs)
	{
		this.curso=curs;
	}
	
	public String getCurso(){
		return this.curso;
	}
	
	
	public void CancecelarMatricula ()
	{
		System.out.println("Matricula cancelada");
	}
	
}
