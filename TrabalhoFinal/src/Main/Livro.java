package Main;

public class Livro {

    private String titulo;
    private String autor;
    private String genero;
    private String lingua;
    private String edicao;
    private String editora;
    private double valor;
    private int quantidade = 0;
    private int[] data;

    public Livro(String titulo, String autor, String genero, String lingua, String edicao, String editora, double valor, int quant) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.lingua = lingua;
        this.edicao = edicao;
        this.editora = editora;
        this.valor = valor;
        this.quantidade += quant;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getLingua() {
        return lingua;
    }

    public void setLingua(String lingua) {
        this.lingua = lingua;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }
    
     public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

}
