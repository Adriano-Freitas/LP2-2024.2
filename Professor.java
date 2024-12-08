package Faculdade;

public class Professor 
{
  public String nome, titulacao, formacao, desDiciplinas;
  public int cargaHoraria, salario;
  
  public Professor(String nom, String tit, String form, String desD, int carH, int sal)
  {
    this.nome = nom;
    this.titulacao = tit;
    this.formacao = form;
    this.desDiciplinas = desD;
    this.cargaHoraria = carH;
    this.salario = sal;
  }
  public void cadastrarAlterar()
  {
    System.out.println("Nome do Professor: " + this.nome);
    System.out.println("Titulacao: " + this.titulacao);
    System.out.println("Formacao: " + this.formacao);
    System.out.println("Carga horaria: " + this.cargaHoraria);
    System.out.println("Salario R$: " + this.salario);
    
  }
  public void alterarDisciplina()
  {
    System.out.println("Descricao da disciplinas ensinada: " + this.desDiciplinas);
  
  }
  public void imprimirProfessor()
  {
    System.out.println("Formado em Bacharelado em Matematica, com enfase calculo e estatistica de dados");
  
  }
  
}
