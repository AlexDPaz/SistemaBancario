package br.com.fiap.banco;

public class Teste {

	public static void main(String[] args) {
		
		//Conta cc = new Conta();
		//cc.depositar(50.0);
		//cc.setAgencia(123);
		//cc.setAgencia(321);
		
		//cc.depositar(1000);
		
		//System.out.println(cc.getSaldo() );
		
		//Conta poupanca = new Conta(111, 222, 1000);
		//poupanca.retirar(50);
		
		//System.out.println(poupanca.getSaldo());
		
		
		contaCorrente cc = new contaCorrente();;
		cc.setAgencia(1111);
		cc.setNumero(2222);
		cc.setTipo("PF");
		cc.setChequeEspecial(1000);
	}

}
