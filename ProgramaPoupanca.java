package Poupanca;

public class ProgramaPoupanca
{
  
  public static void main(String[] ProgramaPoupanca)
  {
    ContaPoupanca poupanca = new ContaPoupanca("Adriano Freitas ", " 0013 ", 2525-5, " 111.222.999-66 ", 0101010203, 2000.30);
    
    poupanca.cadastrarAlterar();
    
    poupanca.imprimirSaldo();
  }
}