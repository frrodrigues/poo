package semanadois;

import java.util.Scanner;

public class retangulo {

	public static void main(String[] args) {
		int h,l;
		int flin;
		int fcol;
		Scanner input=new Scanner(System.in);
		
		System.out.println( "Entre com o numero de colunas:");
		fcol =input.nextInt();
		
		System.out.println( "Entre com o numero de linhas:");
		flin =input.nextInt();
		
		
		for(l=1;l<=flin;l++)
		{
			for(h=1;h<=fcol;h++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		}

	}

