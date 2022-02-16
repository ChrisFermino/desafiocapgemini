package models;

public class VerificacaoSenha {

    public int senhaForte(String senha) {

        int n = 0;

        String patternDigito = ".*\\d.*";
        String patternMinusculo = ".*[a-z].*";
        String patternMaiusculo = ".*[A-Z].*";
        String patternEspeciais = ".*[!@#$%^&*()+-].*";
        String patternMinimoCaracteres = "^[0-9a-zA-Z-!@#$%^&*()+.\\s]{6,}$";

        if (!senha.matches(patternDigito)) {
            n++;
        }
        if (!senha.matches(patternMinusculo)) {
            n++;
        }
        if (!senha.matches(patternMaiusculo)) {
            n++;
        }
        if (!senha.matches(patternEspeciais)) {
            n++;
        }
        if (!senha.matches(patternMinimoCaracteres)) {
            if (6 - senha.length() > n) {
                n = 6 - senha.length();
            }
        }
        return n;
    }
}
