package bonificacao;

import bonificacao.Cargos;


	public class Funcionario {
	    
	    private String nome;
	    private Cargos cargo;
	    private float salario;
	    
	    public String getNome()
	    {
	        return nome;
	    }
	    
	    public void setNome(String nome){
	        this.nome = nome;
	    }
	    
	    public Cargos getCargo()
	    {
	        return cargo;
	    }
	    
	    public void setCargo(Cargos cargo)
	    {
	        this.cargo = cargo;
	    }
	    
	    public float getSalario()
	    {
	        return salario;
	    }
	    
	    public void setSalario(float salario){
	        this.salario = salario;
	    }
	    
	    public float CalcularBonus()
	    {
	        float retorno = 0;
	        switch(cargo)
	        {
	            case NORMAL:
	                retorno = (salario * 0.10f);
	                break;
	            case COORDENADOR:
	                retorno = (salario * 0.15f);
	                break;
	            case DIRETOR:
	                retorno = (salario * 0.20f);
	                break;
	            case PRESIDENTE:
	                retorno = (salario * 0.25f);
	                break;
	        }
	        
	        return retorno;
	    }
}
