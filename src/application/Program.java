package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contribuintes;
import entities.Fisico;
import entities.Juridico;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Contribuintes> list = new ArrayList<>();
		
		System.out.println("ESSE É UM PROGRAMA PARA FINS EDUCATIVOS NO TEMA DE HERANÇA E CLASSES ABSTRATAS(calcula impostos)");
		
		System.out.print("Entre com o número de contribuintes: ");
		int number = sc.nextInt();
		
		for(int i = 0 ; i < number ; i++) {
			
			System.out.println(" Dados do #" + (i+1) + " contribuinte: ");
			
			System.out.print("Pessoa física ou júridica? [f/j]");
			char opt = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Renda anual: ");
			double income = sc.nextDouble();
			
			switch(opt) {
			
			case 'f':
			{
				System.out.print("Adicione os gastos com saúde: ");
				double incomeHealth = sc.nextDouble();
				
				list.add(new Fisico(name, income, incomeHealth));
				break;
			}
			case 'j':
			{
				System.out.print("Adicione o número de funcionários: ");
				int quantity = sc.nextInt();
				
				list.add(new Juridico(name, income, quantity));
				break;
			}
			default:
			{
				System.out.println("opção não válida...");
				break;
			}
			}
			
		}
		
		System.out.println("IMPOSTOS A PAGAR: ");
		double sum = 0.0;
		for(Contribuintes c : list) {
			sum += c.calculateTax();
			System.out.printf("%s: %.2f \n", c.getName(),  c.calculateTax());
		}
		System.out.print("TOTAL DE IMPOSTOS: " + sum);
		
		
		sc.close();
	}

}
