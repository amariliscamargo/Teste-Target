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

                // Painel que me trará a string que irá ser revertida.
                String string = JOptionPane.showInputDialog(null, "Digite qualquer coisa: ");
                System.out.println("Original:  "+ string);

                //array que irá armazenar todos os caracteres de forma ordenada.
                char[] carac = string.toCharArray();

                // as variáveis temp e end serão usadas para manipular as posições dos caracteres.
                int first = 0;
                int end = carac.length-1;
                char temp;

                // enquanto a posição final for maior que a inicial, ele ira substituir os caracteres que estão no começo
                // pelo os que estão no fim.
                while(end>first){
                    temp = carac[first];
                    carac[first] = carac[end];
                    carac[end] = temp;
                    end--;
                    first++;
                }
                string = new String(carac);
                System.out.println("Invertida:  "+ string);

    }}
