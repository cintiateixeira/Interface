package Main;

import java.util.Scanner;
//Para a criação de scanner eu segui a seguinte regra de nomeação:
// nomeTipoClasse; Como eu estou declarando meu objeto Scanne como staticos. outras classes podem importar o mesmo
// e isto está causando erros; 

public class Endereco {

    private String rua;
    private String bairro;
    private String cidade;
    private String cep;
    private String NumCasa;

    static Scanner scanStringEn = new Scanner(System.in);
    static Scanner scanNumEn = new Scanner(System.in);

    public Endereco(String rua, String bairro, String cidade, String cep,String numeroCasa) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.NumCasa = numeroCasa;
    }

    public static Endereco capturaEndereco() {
        
//        try {
//            System.out.println("Digite o nome da rua:");
//            String pgRua = scanStringEn.nextLine();
//            System.out.println("Digite o nome do bairro:");
//            String pgBairro = scanStringEn.nextLine();
//            System.out.println("Digite o nome da cidade");
//            String pgCidade = scanStringEn.nextLine();
//            System.out.println("Digite o numero do cep");
//            long pgCep = scanNumEn.nextLong();
//
//            return (new Endereco(pgRua,pgBairro,pgCidade,pgCep));
//
//        } catch (Exception e) {
//            System.out.println("Opa opa, identifiamos um erro! deseja saber melhor desse erro? S/N");
//            String very = scanStringEn.nextLine();
//            if (very.equalsIgnoreCase("S")) {
//                System.out.println(e.getMessage());
//                e.printStackTrace();
//            }
//
//        }
//
      return null;
    }
}
