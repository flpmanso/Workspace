package entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class PessoaFisica {

	public int id;
	double cpf;
	public String nomeCompleto, cidade, estado, status;
	public  String telefones;

	

	public PessoaFisica(int id, double cpf, String nomeCompleto, String cidade, String estado, String status,
			String telefones) {
		this.id = id;
		this.cpf = cpf;
		this.nomeCompleto = nomeCompleto;
		this.cidade = cidade;
		this.estado = estado;
		this.status = status;
		this.telefones = telefones;
	}

	public PessoaFisica() {
		// TODO Auto-generated constructor stub
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

	public static void percorrerArquivo(String path, List<PessoaFisica> lista, List<String> telefone) {

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

				for(int i = 6; i < campos.length; i++) {
					
				telefone.add(campos[i]);
				}
				
				StringBuilder sb = new StringBuilder();
				
				for(String tel : telefone) {
					sb.append(tel).append(";");
				}
				
				String telefones = sb.toString();
				lista.add(new PessoaFisica(id, cpf, nomeCompleto, cidade, estado, status, telefones));

				telefone.clear();
				linha = lerPath.readLine();

			}
			
			

		} catch (IOException e) {
			System.out.println("Erro na abertura/fechamento do arquivo: " + e.getMessage());
		}
	}
	
	
	public String toString() {
		return id + ";"+ cpf + ";" + nomeCompleto + ";" + cidade + ";" + estado + ";" + status + ";" + telefones;
	}

	
	}