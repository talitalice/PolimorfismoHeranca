package PolimorfismoHeranca;

public class Cachorro extends Animais {
	
	public void escalarCorrer()
	{
		if (correrEscalar == true)
			System.out.println("Animal corre");
		else
			System.out.println("Animal não corre");
	}

}
