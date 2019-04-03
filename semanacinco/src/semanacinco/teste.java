package semanacinco;

public class teste {

	public static void main(String[] args) {
		Pessoa p1= new Pessoa();
		Aluno p2 = new Aluno ();
		Professor p3 =new Professor();
		Funcionario p4= new Funcionario ();
		
		p1.setNome("Pedro");
		p2.setNome("Maria");
		p3.setNome("Claudio");
		p4.setNome("Fabiana");
		
		p2.setCurso("Informatica");
		p3.setSalario(25000);
		p4.setSetor("estoque");
		
		p3.aumentarSalario(550);
		p4.mudarTrabalho();
	}

}
