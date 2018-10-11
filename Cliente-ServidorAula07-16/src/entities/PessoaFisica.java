package entities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class PessoaFisica implements Comparable<PessoaFisica> {

	public int id;
	double cpf;
	public String nomeCompleto, cidade, estado, status, telefoneCelular, telefoneContato, telefoneComercial;

	public PessoaFisica(int id, double cpf, String nomeCompleto, String cidade, String estado, String status,
			String telefoneCelular, String telefoneContato, String telefoneComercial) {
		this.id = id;
		this.cpf = cpf;
		this.nomeCompleto = nomeCompleto;
		this.cidade = cidade;
		this.estado = estado;
		this.status = status;
		this.telefoneCelular = telefoneCelular;
		this.telefoneContato = telefoneContato;
		this.telefoneComercial = telefoneComercial;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public String getTelefoneContato() {
		return telefoneContato;
	}

	public void setTelefoneContato(String telefoneContato) {
		this.telefoneContato = telefoneContato;
	}

	public String getTelefoneComercial() {
		return telefoneComercial;
	}

	public void setTelefoneComercial(String telefoneComercial) {
		this.telefoneComercial = telefoneComercial;
	}

	public void setCpf(double cpf) {
		this.cpf = cpf;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static void percorrerArquivo(String path, List<PessoaFisica> lista) {

		try (BufferedReader lerPath = new BufferedReader(new FileReader(path))) {

			String linha = lerPath.readLine();
			linha = lerPath.readLine();

			while (linha != null) {

				String[] campos = linha.split(";");

				int id = Integer.parseInt(campos[0]);
				double cpf = Double.parseDouble(campos[1]);
				String nomeCompleto = campos[2];
				String cidade = campos[3];
				String estado = campos[4];
				String status = campos[5];
				String telefoneCelular = (campos[6]);
				String telefoneContato = "";
				String telefoneComercial = "";
				if (campos.length == 8) {
					telefoneContato = (campos[7]);
				} else if (campos.length == 9) {
					telefoneContato = (campos[7]);
					telefoneComercial = (campos[8]);
				}

				lista.add(new PessoaFisica(id, cpf, nomeCompleto, cidade, estado, status, telefoneCelular,
						telefoneContato, telefoneComercial));

				linha = lerPath.readLine();

			}
			Collections.sort(lista);
			for (PessoaFisica pessoa : lista) {
				System.out.println(pessoa);
			}

		} catch (IOException e) {
			System.out.println("Erro na abertura/fechamento do arquivo: " + e.getMessage());
		}
	}

	public static void escreverArquivo(String pathSaida, List<PessoaFisica> lista) {

		try (BufferedWriter escreverPath = new BufferedWriter(new FileWriter(pathSaida))) {

			for (PessoaFisica pf : lista) {
				escreverPath.write(pf.id + ";" + pf.nomeCompleto + ";" + pf.cidade + ";" + pf.estado + ";" + pf.status
						+ ";" + pf.telefoneCelular + ";" + pf.telefoneContato + ";" + pf.telefoneComercial);
				escreverPath.newLine();

			}

		} catch (IOException e) {
			System.out.println("Erro na abertura/fechamento do arquivo: " + e.getMessage());
		}

	}

	@Override
	public int compareTo(PessoaFisica p) {
		return this.getNomeCompleto().compareTo(p.getNomeCompleto());
	}

	public String toString() {
		return "Lista Ordenada: " + id + "; " + nomeCompleto + "; " + cidade + "; " + estado + "; " + status + "; "
				+ telefoneCelular + "; " + telefoneContato + "; " + telefoneComercial;
		
	}

}
