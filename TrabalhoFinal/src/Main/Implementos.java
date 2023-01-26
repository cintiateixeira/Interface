package Main;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

// Eu usei a seguinte regra:
//1- Como eu estou sempre precisando a se refirir sempre aos mesmos atributos, então criei p seguinte sistema:
//1 - nome 2 - nomeCCC 3 - nomeCccMmm; sendo c = classe e m == método
public class Implementos {

    static Scanner scanString = new Scanner(System.in);
    static Scanner scanNum = new Scanner(System.in);
    // ----------------Cadastrando-------------------------------

    public static boolean cadastrar(String titulo, String autor, String edicao, String genero, String lingua, String editora, double valor, int quant) {

//        System.out.println("Escreva o título: ");
//        String titulo = scanString.nextLine();
//        System.out.println("digite o nome do Autor: ");
//        String autor = scanString.nextLine();
//        System.out.println("Digite a edicao: ");
//        String edicao = scanString.nextLine();
//        System.out.println("Digite o genero: ");
//        String genero = scanString.nextLine();
//        System.out.println("Digite a lingua: ");
//        String lingua = scanString.nextLine();
//        System.out.println("Digite a editora: ");
//        String editora = scanString.nextLine();
//        System.out.println("Digite o valor: ");
//        double valor = scanNum.nextDouble();
//        System.out.println("Digite a quantidade de livros que deseja inserir: ");
//        int quant = scanNum.nextInt();
        try {
            EstoqueLivro.cadastrar(new Livro(titulo, autor, genero, lingua, edicao, editora, valor, quant));

            return true;

        } catch (Exception e) {

            return true;
        }
    }

    // ----------------Atualizando-------------------------------
    public static boolean atualizar(String titulo, String autor, String genero, String edicao, String editora, String lingua, int quantidade, double valor) {

        try {
            int indice = EstoqueLivro.procurar(titulo);

            EstoqueLivro.estoque.get(indice).setAutor(autor);
            EstoqueLivro.estoque.get(indice).setGenero(genero);
            EstoqueLivro.estoque.get(indice).setEdicao(edicao);
            EstoqueLivro.estoque.get(indice).setLingua(lingua);
            EstoqueLivro.estoque.get(indice).setQuantidade(quantidade);
            EstoqueLivro.estoque.get(indice).setValor(valor);

            return true;

        } catch (Exception e) {

            return false;

        }
    }
    // ----------------Retirando---------------------------------

    public static void retirar() {

        System.out.println("O cliente ja possui cadastro no sistema?" + "\n" + "1 - Cliente ainda nao cadastrado" + "\n"
                + "2 - Cliente ja cadastrado");

        int escolha = scanNum.nextInt();

        switch (escolha) {
            case 1:

//                      Cliente.cadastroCompleto();
                //Pegando qual indice está meu cliente
                int indiceCliente = Cliente.cliente.size() - 1;

                // Dando o livro---------------------------------------------
                while (true) {

                    System.out.println("Confirme o livro que ele pegou!");
                    String tituloLivro = scanString.nextLine();
                    System.out.println("So um estante estou procurando o livro nos arquivos...");
                    int indiceLivro = EstoqueLivro.procurar(tituloLivro); //Retorna o indice do livre no ArryList estoque

                    if (indiceLivro == -1) {
                        System.out.println("Desculpe , o livro não foi encontrado");

                    } else {

                        if (EstoqueLivro.estoque.get(indiceLivro).getQuantidade() > 0) {
                            //Fazendo uma cópia do livro--------------------------------------------------
                            String tituloImpRet = EstoqueLivro.estoque.get(indiceLivro).getTitulo();
                            String autorImpRet = EstoqueLivro.estoque.get(indiceLivro).getAutor();
                            String generoImpRet = EstoqueLivro.estoque.get(indiceLivro).getGenero();
                            String linguaImpRet = EstoqueLivro.estoque.get(indiceLivro).getLingua();
                            String edicaoImpRet = EstoqueLivro.estoque.get(indiceLivro).getEdicao();
                            String editoraImpRet = EstoqueLivro.estoque.get(indiceLivro).getEditora();
                            double valorImpRet = EstoqueLivro.estoque.get(indiceLivro).getValor();

                            //Salvando a data que foi pego o livro
                            int[] vetDate = Cliente.data();
                            int indicelivroCliente = Cliente.cliente.get(indiceCliente).procuraClienteLivro(tituloLivro, indiceCliente);

                            //Procurar meu cliente e vincular ele com meu meu livro
                            //Mando o meu objeto livro para dentro do meu array list que está na minha classe cliente
                            Cliente.cliente.get(indiceCliente).setLivros(new Livro(tituloImpRet, autorImpRet, generoImpRet, linguaImpRet,
                                    edicaoImpRet, editoraImpRet, valorImpRet, 1));
                            //mando a data que foi pego o livro
                            Cliente.cliente.get(indiceCliente).livros.get(indicelivroCliente).setData(vetDate);

                            //Estou informando pra minha classe CLiente que meu cliente pegou um livo. Isso ajuda na proporção geral de quantos livros, indeprende to titutolo 
                            //ou edição, meu cliente tem com ele;
                            Cliente.cliente.get(indiceCliente).setQntLivros(1);

                            System.out.println("Tudo ok.");

                            //Seto -1 dentro do atributo quantidade que está na minha classe EstoqueLivro
                            EstoqueLivro.removeQnt(indiceLivro);

                            break;

                        } else {
                            System.out.println(
                                    "Desculpe mas no nosso banco de dados não conta nemhuma unidade desse livro. Se ocorreu um problema no cadastramento do livro, por favor atualize-o.");
                        }

                    }
                }

                break;

            case 2:

                while (true) {

                    //Dando o livro---------------------------------------------------
                    System.out.println("Me informe o cpf do cliente:");
                    String cpfProcuraImp = scanString.nextLine();
                    int indiceCliente2 = Cliente.procuraCliente(cpfProcuraImp);

                    System.out.println("Confirme o livro que ele pegou!");
                    String tituloLivro = scanString.nextLine();
                    System.out.println("So um estante estou procurando o livro nos arquivos...");
                    int indice = EstoqueLivro.procurar(tituloLivro);

                    if (indice == -1 || indiceCliente2 == -1) {
                        System.out.println("Desculpe , o livro ou o cliente estão incorretos");

                        System.out.println("Deseja Repetir? S/N");
                        String veriImp = scanString.nextLine();
                        if (veriImp.equalsIgnoreCase("S")) {

                        } else {
                            break;
                        }

                    } else {
                        System.out.println("Ok, cliente e livro encontrados no sistema.");

                        if (EstoqueLivro.estoque.get(indice).getQuantidade() > 0) {
                            String tituloImpRet = EstoqueLivro.estoque.get(indice).getTitulo();
                            String autorImpRet = EstoqueLivro.estoque.get(indice).getAutor();
                            String generoImpRet = EstoqueLivro.estoque.get(indice).getGenero();
                            String linguaImpRet = EstoqueLivro.estoque.get(indice).getLingua();
                            String edicaoImpRet = EstoqueLivro.estoque.get(indice).getEdicao();
                            String editoraImpRet = EstoqueLivro.estoque.get(indice).getEditora();
                            double valorImpRet = EstoqueLivro.estoque.get(indice).getValor();

                            int[] vetDate = Cliente.data();

                            //Cliente recendo o livro
                            Cliente.cliente.get(indiceCliente2).setLivros(new Livro(tituloImpRet, autorImpRet, generoImpRet, linguaImpRet,
                                    edicaoImpRet, editoraImpRet, valorImpRet, 1));

                            //Vinculando a data em que o livro foi pego
                            //mando a data que foi pego o livro
                            int indicelivroCliente = Cliente.cliente.get(indiceCliente2).livros.size() - 1;
                            Cliente.cliente.get(indiceCliente2).livros.get(indicelivroCliente).setData(vetDate);

                            //Estou informando pra minha classe CLiente que meu cliente pegou um livo. Isso ajuda na proporção geral de quantos livros, indeprende to titutolo 
                            //ou edição, meu cliente tem com ele;
                            Cliente.cliente.get(indiceCliente2).setQntLivros(1);

                            System.out.println("Tudo ok.");

                            //Removendo um livro do meu estoque 
                            EstoqueLivro.removeQnt(indice);

                            break;

                        } else {
                            System.out.println(
                                    "Desculpe mas no nosso banco de dados não conta nemhuma unidade desse livro. Se ocorreu um problema no cadastramento do livro, por favor atualize-o.");
                        }
                    }
                }
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

    }

    // ----------------Devolvendo--------------------------------
    public static boolean devolver(int cliente, int livro, String livroLol) {

        try {

            int indiceImpDev = cliente;

            int indiceTitulo = livro;

            int indiceRepor = EstoqueLivro.procurar(livroLol);

            int qntImp = Cliente.cliente.get(indiceImpDev).livros.get(indiceTitulo).getQuantidade();

            if (qntImp <= 0) {

                return false;

            } else {

                //estou setando 1 livro ao meu estoque referente ao titulo que busco no método
                EstoqueLivro.estoque.get(indiceRepor).setQuantidade(1);

                //Pegando a taxa por dia de posse passando o indice do cliente + o indice do livro para que eu pegue o valor do mesmo
                double taxaCliente = Cliente.cliente.get(indiceImpDev).custoPagar(indiceImpDev, indiceTitulo, 0);

                EstoqueLivro.setCaixa(taxaCliente);

                //setando -1 a quantidade de livros referente ao títutulo buscado no método
                Cliente.cliente.get(indiceImpDev).livros.get(indiceTitulo).setQuantidade(-1);
                //setando -1 a quantidade de livros referente a todos os livros que estão na mochila do meu cliente
                Cliente.cliente.get(indiceImpDev).setQntLivros(-1);
                //Removendo o livro que da mochila do meu cliente
                Cliente.cliente.get(indiceImpDev).livros.remove(indiceTitulo);

                Date date = new Date();
                Calendar calendario = Calendar.getInstance();
                calendario.setTime(date);

                String dia = Integer.toString(calendario.get(Calendar.DAY_OF_MONTH));
                String mes = Integer.toString(calendario.get(Calendar.MONTH) + 1);
                String ano = Integer.toString(calendario.get(Calendar.YEAR));
                String dados = ("nome: " + Cliente.cliente.get(indiceImpDev).getNome() + ", " + "Titulo: " + livroLol + ", " + "Valor Pago: " + String.format("%.2f", taxaCliente) + ", " + "Data: " + dia + " / " + mes + " / " + ano);

                EstoqueLivro.setHistorico(dados);
                return true;
            }
        } catch (Exception e) {

            return false;

        }

    }

    // ------------------Consultando um cliente-------------------
    public static void consultarCliente() {

        while (true) {
            System.out.println("Informe o cpf do cliente");
            String nomeMenSe = scanString.nextLine();
            int indiceCliente = Cliente.procuraCliente(nomeMenSe);
            mostrandoLivros(indiceCliente);
            if (indiceCliente >= 0) {
                break;
            }
            System.out.println(" 'S' para repetir e 'n' para sair");
            String verifica = scanString.nextLine();
            if (verifica.equalsIgnoreCase(verifica));
        }
    }

    public static void mostrandoLivros(int indiceCliente) {

        if (indiceCliente == -1) {
            System.out.println("Pessoa não encontrado");
        } else {
            System.out.println("\n----------------------------------------------");
            System.out.println("[" + Cliente.cliente.get(indiceCliente).getNome() + "}"
                    + " Encontrado; \nAqui estão todos os livros que está vinculado a ele:");

            for (int i = 0; i < Cliente.cliente.get(indiceCliente).livros.size(); i++) {
                if (Cliente.cliente.get(indiceCliente).livros.get(i).getQuantidade() > 0) {
                    System.out.println(Cliente.cliente.get(indiceCliente).livros.get(i).getTitulo() + " Quandiade: " + Cliente.cliente.get(indiceCliente).livros.get(i).getQuantidade());
                }
            }
            System.out.println("----------------------------------------------");
            System.out.println(" \n ");
        }
    }

    //Consultandoa meu caixa
    public static void consultarCaixa() {
        System.out.printf("Quantia: R$ %.2f:", EstoqueLivro.getCaixa());
        System.out.println("\n");
        System.out.println("=-=-=-=-=-=-=-==-=-=-=-=-=");
        System.out.println("Histórico:");
        for (int i = 0; i < EstoqueLivro.historico.size(); i++) {
            System.out.println(EstoqueLivro.historico.get(i));
        }

    }

    public static boolean excluirLivro(String nome) {

        int indice = EstoqueLivro.procurar(nome);

        if (indice == -1) {

            return false;

        } else {

            EstoqueLivro.estoque.remove(indice);

            return true;
        }
    }
}
