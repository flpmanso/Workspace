package entities;

public class PessoaFisica implements Comparable<PessoaFisica> {

	public int id;

	public String nomeCompleto, cidade, estado, status, telefoneCelular, telefoneContato, telefoneComercial, cpf;

	public PessoaFisica(int id, String cpf, String nomeCompleto, String cidade, String estado, String status,
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
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

	@Override
	public int compareTo(PessoaFisica p) {
		return this.getNomeCompleto().compareTo(p.getNomeCompleto());
	}

	public String toString() {
		return "Lista Ordenada: " + id + "; " + nomeCompleto + "; " + cidade + "; " + estado + "; " + status + "; "
				+ telefoneCelular + "; " + telefoneContato + "; " + telefoneComercial;

	}

}
