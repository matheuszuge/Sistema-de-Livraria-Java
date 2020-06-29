public class Editora {

  //Atributos
  private String nome;
  private String cidade;

  public Editora() {}

  //Construtor  
  public Editora (String nome, String cidade) {
    this.nome = nome;
    this.cidade = cidade;
  }

  //Nome
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  //Cidade
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

}