import models.verificacaoAnagramas;

import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a palavra: ");
        String palavra = scanner.next();
        verificacaoAnagramas verificacaoAnagramas = new verificacaoAnagramas();
        System.out.println(verificacaoAnagramas.substringAnagram(palavra));

    }
}
