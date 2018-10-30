package application;

import java.util.ArrayList;
import java.util.List;

import entities.Animal;
import entities.Cachorro;
import entities.Cavalo;
import entities.Preguica;
import entities.Veterinario;
import entities.Zoologico;

public class Program {

	public static void main(String[] args) {

		List<Animal> list = new ArrayList<>();
		
		Animal animal = new Cachorro();
		System.out.println(animal.emitirSom());

		Animal animal2 = new Cavalo();
		System.out.println(animal2.emitirSom());

		Animal animal3 = new Preguica();
		System.out.println(animal3.emitirSom());

		System.out.println("\nVeterinario Examina: ");
		Veterinario.examinar(animal);
		Veterinario.examinar(animal2);
		Veterinario.examinar(animal3);
		
		Zoologico.preencherJaula(list);
		Zoologico.percorrerJaula(list);
	}

}
