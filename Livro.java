public class Livro {

  //Atributos
  private String nome;
  private int paginas;
  private double valor;
  private Autor autor;
  private Editora editora;

  public Livro() {}

  //Construtor
  public Livro(String nome, int paginas, double valor, Autor autor, Editora editora) {
    this.nome = nome;
    this.paginas = paginas;
    this.valor = valor;
    this.autor = autor;
    this.editora = editora;
  }

  //Nome
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  //Paginas
  public int getPaginas() {
    return paginas;
  }
  public void setPaginas(int paginas) {
    this.paginas = paginas;
  }

  //Valor
  public double getValor() {
    return valor;
  }
  public void setValor(double valor) {
    this.valor = valor;
  }

  //Autor
  public Autor getAutor() {
    return autor;
  }
  public void setAutor(Autor autor) {
    this.autor = autor;
  }
  
  //Editora
  public Editora getEditora() {
    return editora;
  }
  public void setEditora(Editora editora) {
    this.editora = editora;
  }

}