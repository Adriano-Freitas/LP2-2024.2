package Zoologico;

public class ProgramaAnimal
{
  
  public static void main(String[] ProgramaAnimal)
  {
    Animal animal = new Animal("Felino", "Leopardo", "Floresta Amazonica", "10/11/2022", 3030);
    
    animal.cadastrarAlterar();
    
    animal.imprimirInformacao();
  }
  
}