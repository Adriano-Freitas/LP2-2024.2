package Faculdade;

public class ProgramaProfessor
{
  
  public static void main(String[] ProgramaProfessor)
  {
    Professor professor = new Professor("Abel Ferreira", "Mestrado", "Matematica", "Calculo 1, calculo 2", 40, 7000);
    
    professor.cadastrarAlterar();
    
    professor.alterarDisciplina();
    
    professor.imprimirProfessor();
  }
  
}