import models.VerificacaoSenha;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("digite a senha: ");
        String senha = scanner.next();

        VerificacaoSenha verificacaoSenha = new VerificacaoSenha();
        System.out.println(verificacaoSenha.senhaForte(senha));
    }
}