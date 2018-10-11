package service;

import entities.Aluno;

public class AlunoService {

	public static double calcularMedia(double n1, double n2) {

		return (n1 * 0.4 + n2 * 0.6);
	}

	public static String verificarAprovacao(Aluno x) {
		if (x.getMf() < 6) {
			return "Reprovado";

		} else {
			return "Aprovado";
		}

	}

}
