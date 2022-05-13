package PolimorfismoHeranca;

public class Descobertas {
	
	public static void main(String[] args)
	{
		Cachorro Snoop = new Cachorro();
		Cavalo Spirit = new Cavalo();
		Preguica Flecha = new Preguica();

		Snoop.nome = "Snoop";
		Snoop.idade = 8;
		Snoop.fazSom();
		Snoop.verdadeiroCorrer();


		Snoop.resutaldo();
		Snoop.escalarCorrer();

		System.out.println("");

		Spirit.nome = "Spirit";
		Spirit.idade = 6;
		Spirit.fazSom();
		Spirit.verdadeiroCorrer();

		Spirit.resutaldo();
		Spirit.escalarCorrer();

		System.out.println("");

		Flecha.nome = "Flechar";
		Flecha.idade = 27;
		Flecha.fazSom();

		Flecha.resutaldo();
		Flecha.escalarCorrer();

	}

}


