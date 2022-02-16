package models;

import java.util.Arrays;

public class verificacaoAnagramas {

    public int substringAnagram(String palavra){

        int numeroAnagramas = 0;
        int numerocaracteres = 1;

        for (int k = 0; k < palavra.length(); k++) {

            for (int i = 0; i < palavra.length(); i++) {

                if (i + numerocaracteres <= palavra.length()) {

                    String substring = palavra.substring(i, (i + numerocaracteres));
                    char[] substringtoArray = substring.toCharArray();
                    Arrays.sort(substringtoArray);
                    String sortedsubstring = new String(substringtoArray);

                    for (int j = (i + 1); j < palavra.length(); j++) {

                        if (j + numerocaracteres <= palavra.length()) {

                            String substring2 = palavra.substring(j, (j + numerocaracteres));
                            char[] substring2toArray = substring2.toCharArray();
                            Arrays.sort(substring2toArray);
                            String sortedsubstring2 = new String(substring2toArray);

                            if (sortedsubstring.equals(sortedsubstring2)) {
                                numeroAnagramas++;
                            }
                        }
                    }
                }
            }
            numerocaracteres++;
        }
        return numeroAnagramas;
    }
}
