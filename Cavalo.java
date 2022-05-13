package PolimorfismoHeranca;

public class Cavalo extends Animais
{

	public void escalarCorrer()
	{
		if (correrEscalar == true)
			System.out.println("Animal corre");
		else
			System.out.println("Animal não corre");
	}
}