import java.math.BigDecimal;
import java.text.DecimalFormat;

/* 4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:

SP – R$67.836,43
RJ – R$36.678,66
MG – R$29.229,88
ES – R$27.165,48
Outros – R$19.849,53
Escreva um programa na linguagem que desejar onde calcule o percentual de representação
que cada estado teve dentro do valor total mensal da distribuidora.
*/

public class Pergunta4 {

     static double sp = 67836.43;
     static double rj = 36678.66;
     static double mg = 29229.88;
     static double outros = 19849.43;

    //Utilizarei a função percentualDeFaturamento para gerar valor percentual de faturamento do estado.
    public static void percentualDeFaturamento(double fatDoEstado) {

        double faturamentoTotal = sp + rj + mg + outros;

        double valorPercentual = (fatDoEstado / faturamentoTotal) * 100;

        System.out.printf("Percentual de faturamento desse estado: %.2f", valorPercentual);
        System.out.print("%.");

    }

    // Testando o programa.
    public static void main(String[] args){
    // Opções: sp, mg, rj e outros.
        percentualDeFaturamento(sp);

    }}
