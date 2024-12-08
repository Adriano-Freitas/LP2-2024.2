package Empresa;

public class ProgramaFuncionario 
{
  
  public static void main(String[] ProgramaFuncionario) 
  {
    Funcionario f1 = new Funcionario("Leila Pereira", "12/12/1969", "302050", "502030", "Rua purus");
    Funcionario f2 = new Funcionario("Sao Paulo", "Jornalista", "Direito", "897845", 14000);
    
    f1.cadastrarAlterar();
    
    f2.imprimirDados();
    
    //f2.cadastrarAlterar();
    
    //f2.imprimirDados();
  }
  
}