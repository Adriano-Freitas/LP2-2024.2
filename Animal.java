package Zoologico;

public class Animal 
{
  public String especie, nome, localNascimento, dataNascimeto;
  public int numRegistro;
  
  public Animal(String esp, String nom, String locN, String datN, int numR)
  {
    this.especie = esp;
    this.nome = nom;
    this.localNascimento = locN;
    this.dataNascimeto = datN;
    this.numRegistro = numR;
    
  }
  public void cadastrarAlterar()
  {
    System.out.println("Nome da especie: " + this.especie);
    System.out.println("Nome: " + this.nome);
    System.out.println("Local de nascimento: " + this.localNascimento);
    System.out.println("Data de nascimento: " + this.dataNascimeto);
    System.out.println("Numero do registro: " + this.numRegistro);
    
  }
  
  public void imprimirInformacao()
  {
    System.out.println("Cacar");
    System.out.println("Correr");
    System.out.println("Mamar");
    System.out.println("Brincar");
  
  }
  
}