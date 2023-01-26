package Main;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
//Como eu declarei o objeto Scanner como globlal na classe implements, entao eu posso importar

public class Cliente {

    static Scanner scanStringCl = new Scanner(System.in);
    static Scanner scanNumCl = new Scanner(System.in);

    private String nome;
    private String idade;
    private Main.Endereco Endereco;

    private int qntLivros = 0;

    private String data;
    private String cpf;
    private String celular;

    public static ArrayList<Cliente> cliente = new ArrayList<>();
    public ArrayList<Livro> livros = new ArrayList<>();

    public Cliente(String nome, String idade, String cpf, Endereco endereco, String data, String celular) {
        this.nome = nome;
        this.idade = idade;
        this.Endereco = endereco;
        this.data = data;
        this.cpf = cpf;
        this.data = data;
        this.celular = celular;

    }

//    public static void cadastroCompleto() {
//
//        try {

//            System.out.println("Digite o nome: ");
//
//            String nomeCli = scanStringCl.nextLine();
//
//            System.out.println("Digite a idade: ");
//
//            int idadeCli = scanNumCl.nextInt();
//
//            System.out.println("Digite o cpf: ");
//
//            String cpfCli = scanStringCl.nextLine();
//
//            Endereco endereco = Main.Endereco.capturaEndereco();
//
//            System.out.println("---------------------------");
            //todas as vezes que eu cirar um objeto cliente, ele vai passar uma data vazia pro meu construtor. Depois eu uso meu meu método retirar() vai ter que passar a data pór parâmetro.
//            int[] data = {};
//
//            Cliente.cliente.add(new Cliente(nomeCli, idadeCli, cpfCli, endereco, data));
//
//        } catch (Exception e) {
//
//            System.out.println("Opa, alguma coisa deu errado. Tente novamente por favor");
//            System.out.println("Deseja saber mais sobre o erro? S/N");
//            String very = scanStringCl.nextLine();
//            if (very.equalsIgnoreCase("s")) {
//                System.out.println(e.getMessage());
//                e.printStackTrace();
//
//            }
//        }
//
//        // falta completar esse cadastro
//    }

    public static int[] data() {

        System.out.println("Digite Somente o dia que o livro foi pego");
        int dayCli = scanNumCl.nextInt();
        System.out.println("Digite Somente o mês que o livro foi pego");
        int monthCli = scanNumCl.nextInt();
        System.out.println("Digite Somente o ano que o livro foi pego");
        int yearCli = scanNumCl.nextInt();

        int[] dataCliDt = {dayCli, monthCli, yearCli};

        System.out.println("Ok, tudo certo");
        return dataCliDt;

    }

    public static int procuraCliente(String num) {
        for (int i = 0; i < cliente.size(); i++) {
            if (cliente.get(i).getCpf().equalsIgnoreCase(num)) {
                return i;
            }
        }
        return -1;
    }

    public int procuraClienteLivro(String nome, int cliente) {
        for (int i = 0; i < Cliente.cliente.get(cliente).getQntLivros(); i++) {
            if (Cliente.cliente.get(cliente).livros.get(i).getTitulo().equalsIgnoreCase(nome)) {

                return i;
            }
        }

        return -1;
    }

    public double custoPagar(int i, int l, int retorno) {
        //Meu "i" é responsácel pelo indice do meu cliente
        //Meu "l" é responsável pelo indice do livro na Calsse livro
        Date date = new Date();
        //Calendar recebendo a hora exata do sistema 
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int diaTest = cliente.get(i).livros.get(l).getData()[2];
        int mesTest = cliente.get(i).livros.get(l).getData()[1];
        int anoTest = cliente.get(i).livros.get(l).getData()[0];

        LocalDate data1 = LocalDate.of(cliente.get(i).livros.get(l).getData()[2], cliente.get(i).livros.get(l).getData()[1], cliente.get(i).livros.get(l).getData()[0]);
        LocalDate data2 = LocalDate.of(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.DAY_OF_MONTH));

        Duration periodo = Duration.between(data1.atStartOfDay(), data2.atStartOfDay());

        //Tenho que conseguir uma nova forma de calcular as idades; O meu meu 
        //periodo.getDay() apenas me retorna o numero do dia da primeira data 
        //Para o dia da segunda data , ou seja 12/12/2022-14/01/2023 == 2;
        long days = periodo.toDays();

        //O problema esta aqui 
        double porcent;
        double custo;
        double taxa;

        if (days <= 15) {
            porcent = (double) days * ((Cliente.cliente.get(i).livros.get(l).getValor() * 0.01));
            custo = (double) days * ((Cliente.cliente.get(i).livros.get(l).getValor() * 0.01));
            taxa = 0;

        } else {
            taxa = (Cliente.cliente.get(i).livros.get(l).getValor() * 0.1) * (days - 15);
            porcent = (double) (days * ((Cliente.cliente.get(i).livros.get(l).getValor() * 0.01))) + taxa;
            custo = (double) (days * ((Cliente.cliente.get(i).livros.get(l).getValor() * 0.01)));
        }

        if (retorno == 0) {
            return custo;
        }
        if (retorno == 1) {
            return taxa;
        }
        if (retorno == 2) {
            return porcent;
        }
        
        return -1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return Endereco;
    }

    public void setEndereco(Endereco Endereco) {
        this.Endereco = Endereco;
    }

    public String getData(String i) {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public static ArrayList<Cliente> getCliente() {
        return cliente;
    }

    public static void setCliente(Cliente cliente) {
        Cliente.cliente.add(cliente);
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public ArrayList<Livro> getLivros(int i) {
        return livros;
    }

    public void setLivros(Livro livro) {
        this.livros.add(livro);
    }

    public int getQntLivros() {
        return qntLivros;
    }

    public void setQntLivros(int qntLivros) {
        this.qntLivros += qntLivros;
    }

}
