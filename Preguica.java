package PolimorfismoHeranca;

public class Preguica extends Animais
{

	public void escalarCorrer()
	{
		if (correrEscalar == true)
			System.out.println("Animal corre");
		else
			System.out.println("Animal escala árvores");
	}
}