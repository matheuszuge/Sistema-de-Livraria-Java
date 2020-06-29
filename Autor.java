public class Autor {

  //Atributos
  private String nome;
  private String sobrenome;

  public Autor() {}

  //Construtor
  public Autor(String nome, String sobrenome) {
    this.nome = nome;
    this.sobrenome = sobrenome; 
  }

  //Nome
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  //Sobrenome
  public String getSobrenome() {
    return sobrenome;
  }
  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }
}