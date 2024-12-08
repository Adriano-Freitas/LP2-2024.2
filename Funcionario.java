package Empresa;
import java.util.Scanner;

public class Funcionario
{
  Scanner leia = new Scanner(System.in);
  public String nome, dataNascimento, rg, cpf, endereco; 
  public String naturalidade, profissao, grauInstrucao, matricula;
  public double salario;
  
  public Funcionario(String nom, String datN, String rg, String cpf, String end)
  {
    this.nome = nom;
    this.dataNascimento = datN;
    this.rg = rg;
    this.cpf = cpf;
    this.endereco = end;
  }
  public Funcionario(String nat, String prof, String graI, String mat, double sal)
  {
    this.naturalidade = nat;
    this.profissao = prof;
    this.grauInstrucao = graI;
    this.matricula = mat;
    this.salario = sal;
  }
  public void cadastrarAlterar()
  {
    System.out.println("Nome do funcionario: " + this.nome);
    System.out.println("Data de nascimento: " + this.dataNascimento);
    System.out.println("RG: " + this.rg);
    System.out.println("CPF: " + this.cpf);
    System.out.println("Endereco: " + this.endereco);
    
  }
  public void imprimirDados()
  {
    
    System.out.println("Local de nascimento: " + this.naturalidade);
    System.out.println("Profissao: " + this.profissao);
    System.out.println("Grau de instrucao: " + this.grauInstrucao);
    System.out.println("Matricula: " + this.matricula);
    System.out.println("Salario R$: " + this.salario);
  }
}