package semana7;

public class Triangulo implements IShape, IShow {
	public double lado1;
	public double lado2;
	public double lado3;
	
	public Triangulo(double lado1, double lado2,double lado3)
	{
		this.lado1=lado1;
		this.lado2=lado2;
		this.lado3=lado3;
	}
	public double getLado1() {
		return lado1;
	}
	public double getLado2() {
		return lado2;
	}
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	public double getLado3() {
		return lado3;
	}
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	@Override
	public void print() {
		System.out.println("Area:"+ this.getArea());
		System.out.println("Perimetro:"+ this.getPerimetro());
		
	}
	@Override
	public double getArea() {
		double s= (lado1 + lado2 + lado3)/2;
		return Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
	}
	@Override
	public double getPerimetro() {
		return lado1+lado2+lado3;
	}

}
