package application;

import java.util.ArrayList;
import java.util.List;

import entities.Aluno;
import view.vwAluno;

public class Program {

	public static void main(String[] args) {
		
		List<Aluno> list = new ArrayList<>();
		
		vwAluno.receberAluno(list);
		vwAluno.imprimirLista(list);

		
	}

}