package semanaseis;

public class animalTeste {

	public static void main(String[] args) {
		Mamifero m1 = new Mamifero();
		Reptil r1 = new Reptil();
		Peixe p1 = new Peixe();
		Ave a1 = new Ave();
		
		m1.setPeso(2);
		m1.setIdade(2);
		m1.setMembros(4);
		m1.alimentar();
		m1.emitirSom();
		m1.locomover();
		
		p1.setPeso(3);
		p1.setPeso(2);
		p1.setIdade(2);
		p1.setMembros(0);
		p1.alimentar();
		p1.emitirSom();
		p1.locomover();
		
	}

}
