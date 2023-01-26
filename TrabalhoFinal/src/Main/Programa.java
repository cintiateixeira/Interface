package Main;

import java.util.Scanner;

public class Programa {

    static Scanner scanStringMain = new Scanner(System.in);

    public static void main(String[] args) {

        ListaTeste.rumCadastroTeste();

        while (true) {

            System.out.println("Deseja abrir o menu? S/N");
            String res = scanStringMain.next();

            if (res.equalsIgnoreCase("s")) {


               
            } else {
                break;
            }
        }
    }
}
