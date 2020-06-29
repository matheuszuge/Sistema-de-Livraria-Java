public class verLivro {

  //Classe verLivro apenas recebe por parametro o objeto Livro
  //e usa os serviços da classe Livro
  public void apresentarLivro(Livro teste) {
    System.out.println("|----------------------------------|");
    System.out.println("|              LIVRO               |");
    System.out.println("|----------------------------------|");
    System.out.println("| Título: "+ teste.getNome());
    System.out.println("| Autor:  "+ teste.getAutor().getNome());
    System.out.println("| Editora: "+ teste.getEditora().getNome());
    System.out.println("| Páginas: "+ teste.getPaginas());
    System.out.println("| Valor: "+ teste.getValor());
    System.out.println("|----------------------------------|");
  }

}