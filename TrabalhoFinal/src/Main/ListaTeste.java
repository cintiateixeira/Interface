package Main;

public class ListaTeste {

    public static void rumCadastroTeste() {
        EstoqueLivro.cadastrar(new Livro("Harry Potter 1", "J. K. Rowling", "Fantasia", "Portugês", "1", "Pottermore", 28, 4));
        EstoqueLivro.cadastrar(new Livro("Harry Potter 2", "J. K. Rowling", "Fantasia", "Portugês", "1", "Pottermore", 28, 4));
        EstoqueLivro.cadastrar(new Livro("Harry Potter 3", "J. K. Rowling", "Fantasia", "Portugês", "1", "Pottermore", 28, 4));
        EstoqueLivro.cadastrar(new Livro("Harry Potter 4", "J. K. Rowling", "Fantasia", "Portugês", "1", "Pottermore", 28, 4));
        EstoqueLivro.cadastrar(new Livro("Harry Potter 5", "J. K. Rowling", "Fantasia", "Portugês", "1", "Pottermore", 28, 4));
        EstoqueLivro.cadastrar(new Livro("Harry Potter 6", "J. K. Rowling", "Fantasia", "Portugês", "1", "Pottermore", 28, 4));

        
        Endereco end = new Endereco("Adelina Monteiro", "Campo Velho", "Floriano", "64808500","49");
        Cliente.cliente.add(new Cliente("marcos brito ", "20", "095.496.643-09", end, "12/12/2022","(86)981631347"));
        
        int[] vetDate = {12,12,2022};

        String tituloImpRet = EstoqueLivro.estoque.get(1).getTitulo();
        String autorImpRet = EstoqueLivro.estoque.get(1).getAutor();
        String generoImpRet = EstoqueLivro.estoque.get(1).getGenero();
        String linguaImpRet = EstoqueLivro.estoque.get(1).getLingua();
        String edicaoImpRet = EstoqueLivro.estoque.get(1).getEdicao();
        String editoraImpRet = EstoqueLivro.estoque.get(1).getEditora();
        double valorImpRet = EstoqueLivro.estoque.get(1).getValor();

        //Procurar meu cliente e vincular ele com meu meu livro
        //Mando o meu objeto livro para dentro do meu array list que está na minha classe cliente
        
        Cliente.cliente.get(0).setLivros(new Livro(tituloImpRet, autorImpRet, generoImpRet, linguaImpRet,
                edicaoImpRet, editoraImpRet, valorImpRet, 1));
        
        Cliente.cliente.get(0).setQntLivros(1);

        //mando a data que foi pego o livro
        Cliente.cliente.get(0).livros.get(0).setData(vetDate);
    }
}
