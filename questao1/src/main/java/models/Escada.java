package models;

public class Escada {

    public String printEscada(int n){

        int x = n;
        int x1 = 1;
        StringBuilder escada = new StringBuilder();

        for (int i = 0; i < n; i++) {
            escada.append(" ".repeat(Math.max(0, x - 1)));
            x--;
            escada.append("*".repeat(Math.max(0, x1)));
            x1++;
            if (x1 <= n) {
                escada.append("\n");
            }
        }
        return escada.toString();
    }
}
