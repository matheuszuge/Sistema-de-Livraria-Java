public class criarLivros {

  private static criarLivros instance;

  private criarLivros() {}
  public static criarLivros getInstance() {
    if(instance == null) {
      instance = new criarLivros();
    }
    return instance;
  }

  public Livro criarLivroNovo(String nome, int paginas, double valor, Autor autor, Editora editora) {
    return new Livro (nome, paginas, valor, autor, editora);
    }

}