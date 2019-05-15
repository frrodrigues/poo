package semana7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteInterface {
	public static void main (String [] args){
		// Usando o método  construtor para testar as classes
		retangulo rec = new retangulo (10,3);
		rec.print();
		
		Circulo cir= new Circulo(2);
		cir.print();
		
		Triangulo tri= new Triangulo(3,4,5);
		tri.print();
		
		// Tratamento de excecoes retangulo
				try 
				{
					Scanner r = new Scanner(System.in);
					System.out.print("Digite o altura do retangulo:");
					int h= r.nextInt(); 
					System.out.print("Digite o largura do retangulo:");
					int l= r.nextInt();
					retangulo r2= new retangulo(h,l);
					r2.print();
				}   catch (InputMismatchException erro1) {
		            System.err.println("Não é permitido inserir letras, informe apenas números!");
				}
				catch(ArithmeticException erro2){
		            System.err.println("O raio deve ser diferente de 0!");
		        }finally{
		            System.out.println("Fim do programa!");
		        }
		
		
		
		// Tratamento de excecoes circulo
		try 
		{
			Scanner c = new Scanner(System.in);
			System.out.print("Digite o raio do circulo:");
			int raio= c.nextInt(); 
			Circulo cir2= new Circulo(raio);
			cir2.print();
		}   catch (InputMismatchException erro1) {
            System.err.println("Não é permitido inserir letras, informe apenas números!");
		}
		catch(ArithmeticException erro2){
            System.err.println("O raio deve ser diferente de 0!");
        }finally{
            System.out.println("Fim do programa!");
        }
		// Tratamento de excecoes triangulo
		try 
		{
			Scanner t = new Scanner(System.in);
			System.out.print("Digite o lado1 do triangulo:");
			int lado1= t.nextInt(); 
			System.out.print("Digite lado2 do triangulo:");
			int lado2= t.nextInt();
			System.out.print("Digite lado3 do triangulo:");
			int lado3= t.nextInt();
			Triangulo t2= new Triangulo(lado1,lado2,lado3);
			t2.print();
		}   catch (InputMismatchException erro1) {
            System.err.println("Não é permitido inserir letras, informe apenas números!");
		}
		catch(ArithmeticException erro2){
            System.err.println("O raio deve ser diferente de 0!");
        }finally{
            System.out.println("Fim do programa!");
        }
}
	}
