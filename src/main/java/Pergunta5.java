import javax.swing.*;
import java.util.Scanner;
/*
5) Escreva um programa que inverta os caracteres de um string.

IMPORTANTE:
a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
b) Evite usar funções prontas, como, por exemplo, reverse;
*/

public class Pergunta5 {
    public static void main(String[] args){

                // Painel que me trará a string que irá ser invertida.
                String string = JOptionPane.showInputDialog(null, "Digite qualquer coisa: ");
                System.out.println("String original:  "+ string);

                //array que irá armazenar todos os caracteres de forma ordenada.
                char[] caractere = string.toCharArray();

                // as variáveis auxiliar e last serão usadas para manipular as posições dos caracteres.
                int first = 0;
                int last = caractere.length-1;
                char auxiliar;

                // enquanto a posição final for maior que a inicial, ele ira substituir os caracteres que estão no começo
                // pelo os que estão no fim. Com isso será possível gerar uma nova string, mas com seus caracteres invertidos.
                while(last>first){
                    auxiliar = caractere[first];
                    caractere[first] = caractere[last];
                    caractere[last] = auxiliar;
                    last--;
                    first++;
                }

                //atualizando e expondo a nova string
                string = new String(caractere);
                System.out.println("Invertida:  "+ string);

    }}
