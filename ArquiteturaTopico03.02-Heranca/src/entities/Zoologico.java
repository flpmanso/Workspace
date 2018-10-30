package entities;

import java.util.List;

public class Zoologico {

	public static List<Animal> preencherJaula(List<Animal> list) {

		int idade = 10;
		String nome = "jorgin";
		list.add(new Cachorro(nome, idade));
		idade = 23;
		nome = "Zezão";
		list.add(new Cavalo(nome, idade));
		return list;

	}

	public static void percorrerJaula(List<Animal> list) {

		for (Animal animal : list) {
			System.out.print("\nAnimal: " + animal.nome + " com a idade de " + animal.idade + " é um "
					+ animal.emitirSom());
			if (animal instanceof Cachorro || animal instanceof Cavalo) {
				System.out.print("e " + animal.correr() + "\n");
			}

		}
	}

}
