package Heranca;

import java.util.Scanner;

public class Testeanimal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		Cachorro cachorro = new Cachorro ();
		Cavalo cavalo = new Cavalo ();
		preguica preguica = new preguica ();
		
		System.out.println("Exemplo de heranca com animais \n");
		System.out.println("Insira os dados dos animais");
		System.out.println("\n Digite o nome do cachorro");
		cachorro.setNome(input.next());
		System.out.println("Digite a idade");
		cachorro.setIdade(input.nextInt());
		System.out.println("Digite o nome da preguiça");
		preguica.setNome(input.next());
		System.out.println("Digite a idade");
		preguica.setIdade(input.nextInt());
		System.out.println("\n Digite o nome do cavalo");
		cavalo.setNome(input.next());
		System.out.println("Digite a idade");
		cavalo.setIdade(input.nextInt());
		
		
		System.out.println("\n Informacoes dos animais inseridos");
		
		System.out.println("\n "+ cachorro.getNome()+" É um cachorro de "+ cachorro.getIdade()+" anos de idade."+"E "+ cachorro.getAcao()+" E o som que ele emite é "+ cachorro.getSom()+ ".");
		System.out.println("\n "+ cavalo.getNome()+" É um cavalo de "+ cavalo.getIdade()+" anos de idade."+"E "+ cavalo.getAcao()+" E o som que ele emite é "+ cavalo.getSom()+ ".");
		System.out.println("\n "+ preguica.getNome()+" É uma preguiça de "+ preguica.getIdade()+" anos de idade."+"E "+ preguica.getAcao()+" E o som que ela emite é "+ preguica.getSom()+ ".");

	}
}