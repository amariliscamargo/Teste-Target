import com.google.gson.Gson;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;

/*
3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar,
     que calcule e retorne:
• O menor valor de faturamento ocorrido em um dia do mês;
• O maior valor de faturamento ocorrido em um dia do mês;
• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

IMPORTANTE:
a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da
média;
*/

public class Pergunta3 {

 class Faturamento {
        int dia;
        double valor;
    }
            public static void main(String[] args){

                //verifica se o ficheiro existe
                File Diretorio = new File("src/main/Dados/dados json.json");

                if(Diretorio.exists() && !Diretorio.isDirectory()){
                    System.out.println(Diretorio + " Arquivo existente");
                }else{
                    System.out.println(Diretorio + " Arquivo inexistente");
                }

                try {
                    //Inicializando a biblioteca Gson.
                    Gson gson = new Gson();

                    //Importando o arquivo Json.
                    FileReader arquivo = new FileReader("src/main/Dados/dados json.json");

                    //Transformando o arquivo Json em objetos Java.
                    Faturamento[] faturamentos = gson.fromJson(arquivo, Faturamento[].class);

                    //Inicializando variáveis:
                    double faturamentoMedio=0, somaFat = 0;
                    int dia=0, valorDiaMaior=0, diaMenorFat = 0, qtdeDias = 21;

                    double menorFat = faturamentos[0].valor;
                    double maiorFat = faturamentos[0].valor;

                    //Esse for irá checar dentro do array qual é o menor faturamento, e com isso conseguiremos também o dia.
                    for(int i = 0; i < faturamentos.length;i++) {

                        if(faturamentos[i].valor !=0 && menorFat > faturamentos[i].valor) {

                            menorFat = faturamentos[i].valor;
                            diaMenorFat = faturamentos[i].dia;}}

                    //Esse for atuará da mesma forma que o anterior, só que para descobrir o maior faturamento e o dia.
                    for(int i = 0; i< faturamentos.length;i++) {

                        if(faturamentos[i].valor !=0 && maiorFat < faturamentos[i].valor) {

                            maiorFat = faturamentos[i].valor;
                            valorDiaMaior = faturamentos[i].dia;}}

                    //O for abaixo irá somar os faturamentos diários e calcular o valor médio.
                    for(int i=0; i< faturamentos.length; i++) {
                        somaFat = somaFat + faturamentos[i].valor;
                        faturamentoMedio = somaFat / qtdeDias;

                            if(faturamentos[i].valor > faturamentoMedio) {
                                dia ++;}}

                    DecimalFormat numDecimal = new DecimalFormat("#,##0.00");

                    System.out.println("O dia com menor valor de faturamento: "+ diaMenorFat );
                    System.out.println("Valor do faturamento: "+ numDecimal.format(menorFat));
                    System.out.println("O dia com maior valor de faturamento: "+ valorDiaMaior );
                    System.out.println("Valor do faturamento: "+ numDecimal.format(maiorFat));

                    System.out.println("Quantos dias o faturamento foi superior a média mensal: " + dia);
                    System.out.println("Valor da média de faturamento diário: R$" + numDecimal.format(faturamentoMedio));
                }

                catch (IOException e) {e.printStackTrace();}
 }}
