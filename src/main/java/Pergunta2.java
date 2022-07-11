import javax.swing.*;
/*
   Pergunta:

  Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos
  2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem
  que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem
  avisando se o número informado pertence ou não a sequência.

  IMPORTANTE:

  Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;
 */


public class Pergunta2 {

    //Irei utiliziar a função testeFibo para checar se o número pertence a sequência Fibonacci.
    static void testeFibo(int num){
    // Como descrito no enunciado, a sequência Fibo começa com 0 e 1, representado pelas variáveis a e b, onde
    // elas se somam gerando um novo número, representado pelo c.
    // A variável "sinal" será utilizada para sinalizar quando o número indicado for igual a algum da sequência.
        int a = 0;
        int b = 1;
        int c;
        int sinal = 0;

        //Esse ciclo ocorre no conjunto de inteiros positivos, onde c vira a + b, a vira b, b vira c, expressa pela estrutura de repetição for.
        // se a == num, a variável sinal valerá 1. Com isso, conseguimos entender que quando sinal for positivo o número pertence a sequência.
        for(int i = 0; i < num; i++){

            c = a + b;
            a = b;
            b = c;

            if(a == num){sinal++;}
        }

            if ( sinal > 0){System.out.println("O número "+num+" pertence a sequência Fibonacci.");}
                else{System.out.println("Este número não pertence a sequência Fibonacci.");}
    }

    // Testando o programa.
    public static void main(String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
        testeFibo(numero);
    }}

//Sequência Fibonacci: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377...






