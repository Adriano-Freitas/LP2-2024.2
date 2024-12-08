package Carro;

public class Carro 
{
  public int codigo, modelo, anoFabricacao, numeroPortas, qtdDisponivel, preco;
  public String marca, cor, tipoCombustivel, completoBasico;
          
  public Carro(int cod, int mod, int anoF, int numP, int qtdD, int pre, String mar, String cor, String tipC, String compB) 
  {
    this.codigo = cod;
    this.modelo = mod;
    this.anoFabricacao = anoF;
    this.numeroPortas = numP;
    this.qtdDisponivel = qtdD;
    this.preco = pre;
    this.marca = mar;
    this.cor = cor;
    this.tipoCombustivel = tipC;
    this.completoBasico = compB;
    
  }
  public void cadastrarAlterar()
  {
    System.out.println("Numero do codigo: " + this.codigo);
    System.out.println("Modelo: " + this.modelo);
    System.out.println("Ano de fabricacao: " + this.anoFabricacao);
    System.out.println("Numero de portas: " + this.numeroPortas);
    System.out.println("Quantidade disponivel: " + this.qtdDisponivel);
    System.out.println("Preco R$: " + this.preco);
    System.out.println("Marca do veiculo: " + this.marca);
    System.out.println("Cor do veiculo: " + this.cor);
    System.out.println("Tipo do combustivel: " + this.tipoCombustivel);
    System.out.println("Carro completo ou basico: " + this.completoBasico);
    
  }
  
  public void listarInformacao()
  {
    
    System.out.println("Ligar e Desligar ");
    System.out.println("Acelerar e Desacelerar ");
    System.out.println("Virar a direita e esquerda ");
    System.out.println("Marcha para cima e para baixo ");
    
  }
}