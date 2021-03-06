package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcelas {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date dataAte;
	private Double quantidade;

	public Parcelas(Date dataAte, Double quantidade) {

		
		this.dataAte = dataAte;
		this.quantidade = quantidade;
	}
	public Date getDataAte() {
		return dataAte;
	}
	public void setDataAte(Date dataAte) {
		this.dataAte = dataAte;
	}
	public Double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		return sdf.format(dataAte) + " - " + String.format("%.2f", quantidade);
}
	
	

}
