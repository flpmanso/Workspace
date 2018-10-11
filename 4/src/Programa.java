
public class Programa {
	public static void main(String[] args) {
		String manso = "Manso";
		String felipe = "Felipe";
		String cpf = "123456789";
		String manso2 = "Manso2";
		String felipe2 = "Felipe2";
		String cpf2 = "123456789";
		
		
		
		Conta minhaConta = new Conta();
		Conta minhaConta2 = new Conta();
		
		Cliente c = new Cliente(felipe, manso, cpf);
		Cliente c2 = new Cliente(felipe2, manso2, cpf2);
		
		minhaConta.titular = c;
		//c.nome = "Manso";
		//minhaConta.saldo = 250.0;
		minhaConta.setSaldo(400);
		System.out.println("saldo: " + minhaConta.getSaldo());
		minhaConta.deposita(950);
		minhaConta.saca(810);
		
		minhaConta2.titular = c2;
		minhaConta2.titular = c2;
		
		//int total = Conta.getTotalDeContas();
		//System.out.println(total);
		//System.out.println(c.nome);
		//System.out.println(c.sobreNome);
		//System.out.println(c.cpf);
		
		
		System.out.println("nome cliente: " + c.nome);
		System.out.println("Saldo da conta " + minhaConta.getSaldo());
		System.out.println("transação impossivel");
		
		
		
		/*Conta c1 = new Conta();
		c1.deposita(100);
		
		
		
		
		Conta c2 = new Conta();
		c2.deposita(200);
		
		c1.transfere(c2, 50);
		

		System.out.println(c1.saldo);
		System.out.println(c2.saldo);
		*/
		
		/*Conta minhaConta;
		minhaConta = new Conta();
		
		minhaConta.dono = "Manso";
		minhaConta.saldo = 1000.0;
		
		minhaConta.saca(300);
		
		minhaConta.deposita(1453);
		
		System.out.println("saldo atual "+ minhaConta.saldo);*/
	}
}
