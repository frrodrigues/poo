package semana7;

public class retangulo implements IShape, IShow {

	public double altura, largura;
	
	public retangulo(double altura, double largura)
	{
		this.altura=altura;
		this.largura=largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	@Override
	public double getArea() {
		
		return this.altura*this.largura;
	}

	@Override
	public void print() {
		System.out.println("Retangulo Area:"+ this.getArea());
		System.out.println("Perimetro:"+ this.getPerimetro());
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return (2*this.altura)*(2*this.largura);
	}

}
