package Main;

import java.util.ArrayList;

public class EstoqueLivro {

    static ArrayList<Livro> estoque = new ArrayList<>();

    private static double caixa;

    static ArrayList<String> historico = new ArrayList<>();

    public static void cadastrar(Livro outro) {

        estoque.add(outro);

    }

    public static void adicionar(int i, int qnt) {
        estoque.get(i).setQuantidade(qnt);
    }

    public static String mostrar(int i, int propiedade) {

        if (i == -1) {
            return "Livro  - Titulo não encontrado";
        }
        if (propiedade == 0) {
            return estoque.get(i).getAutor();
        }
        if (propiedade == 1) {
            return estoque.get(i).getGenero();
        }
        if (propiedade == 2) {
            return estoque.get(i).getEdicao();
        }
        if (propiedade == 3) {
            return estoque.get(i).getEditora();
        }
        if (propiedade == 4) {
            return estoque.get(i).getLingua();
        }
        if (propiedade == 5) {
            return Integer.toString(estoque.get(i).getQuantidade());
        }
        if (propiedade == 6) {
            return Double.toString(estoque.get(i).getValor());
        }

        return null;
    }

    public static void atualizar(Livro outro, String nome) {

    }

    public static int procurar(String nome) {

        for (int i = 0; i < estoque.size(); i++) {
            if (estoque.get(i).getTitulo().equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return -1; //Se o método retornar -1 significa o meu array list não possui o titulo procurado
    }

    public static void removeQnt(int i) {
        estoque.get(i).setQuantidade(-1);
    }

    public static double getCaixa() {
        return EstoqueLivro.caixa;
    }

    public static void setCaixa(double caixa) {
        EstoqueLivro.caixa += caixa;
    }

    public static ArrayList<String> getHistorico() {
        return historico;
    }

    public static void setHistorico(String historico) {
        EstoqueLivro.historico.add(historico);
    }

}
