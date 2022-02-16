import models.Escada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o valor de n:");
            int n = scanner.nextInt();
            Escada escada = new Escada();
            System.out.println(escada.printEscada(n));
            scanner.close();

        }catch (InputMismatchException ignored){
            System.out.println("digite apenas Números!");
        }
    }
}