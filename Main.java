class Main {
  public static void main(String[] args) {

    //Autor
    Autor Matheus = new Autor("Matheus ", "Züge");

    //Editora
    Editora Züge = new Editora("Züge ", "Joinville");

    //Livro
    Livro teste = criarLivros.getInstance().criarLivroNovo("teste", 259, 258.95, Matheus, Züge);

    //Visualizar o Livro
    verLivro ver = new verLivro();

    ver.apresentarLivro(teste);

  }
}