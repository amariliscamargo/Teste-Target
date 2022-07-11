/*Pergunta:

  Observe o trecho de código abaixo:

  int INDICE = 13, SOMA = 0, K = 0;

  enquanto K < INDICE faça
  {
      K = K + 1;
      SOMA = SOMA + K;
  }

  imprimir(SOMA);

  Ao final do processamento, qual será o valor da variável SOMA?
*/
public class Pergunta1 {
    static int INDICE = 13;
    static int SOMA = 0;
    static int K = 0;

   public static void main(String[] args) {

        while(K < INDICE){
            //Enquanto K for menor que o INDICE  a expressão abaixo funcionará
            K = K + 1;
            SOMA = SOMA + K;
        }
        System.out.println(SOMA); // A Resposta será 91!

    }
}
