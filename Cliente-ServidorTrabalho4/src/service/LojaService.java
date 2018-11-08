package service;

import entities.Loja;
import javafx.collections.ObservableList;
import persistence.LojaDAO;

public class LojaService {
	
	public static void inserir(Loja loja) {
		LojaDAO.inserir(loja);
	}
	public static Loja buscar(String nomeLoja) {
		return LojaDAO.buscar(nomeLoja);
	}
	public static void alterar(Loja loja) {
		LojaDAO.alterar(loja);
	}
	public static void deletar(Integer id) {
		LojaDAO.deletar(id);
	}
	public static ObservableList<Loja> converterArrayListToObservableList(){
		return LojaDAO.converterArrayListToObservableList();
	}

}
