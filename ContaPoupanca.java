package Poupanca;

public class ContaPoupanca 
{
  public String nomeCorrentista, agencia, cpf;
  public int rg,numeroConta;
  public double saldo;
  
  public ContaPoupanca(String nomC, String age, int numC, String cpf, int rg, double sal)
  {
    this.nomeCorrentista = nomC;
    this.agencia = age;
    this.numeroConta = numC;
    this.cpf = cpf;
    this.rg = rg;
    this.saldo = sal;
    
  }
  public void cadastrarAlterar()
  {
    System.out.println("Nome do correntista: " + this.nomeCorrentista);
    System.out.println("Agencia: " + this.agencia);
    System.out.println("Numero da conta: " + this.numeroConta);
    System.out.println("Numero do CPF: " + this.cpf);
    System.out.println("Numero do RG: " + this.rg);
    
  }
  
  public void imprimirSaldo()
  {
    System.out.println("Saldo do correntista R$: " + this.saldo);
  
  }
}