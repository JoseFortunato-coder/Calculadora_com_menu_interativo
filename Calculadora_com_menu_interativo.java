import java.util.Scanner;
public class Calculadora_com_menu_interativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double resultado = 0;
        double numero = 0;
        do {
            System.out.println(" Qual tipo de calculo você quer? ");
            System.out.println("Digite 1 para soma. ");
            System.out.println("Digite 2 para subtração. ");
            System.out.println("Digite 3 para multiplicação. ");
            System.out.println("Digite 4 para divisão. ");
            System.out.println("Digite 5 para elevação. ");
            System.out.println("Digite 6 para caso não queira fazer nenhum calculo e sair. ");
            resultado = 0;
            String entrada = scanner.nextLine();
            String numeroTexto = entrada.replaceAll("[^0-9.]", "");
            numero = Double.parseDouble(numeroTexto);
            if (numero > 6) {
                System.out.println("digite uma opção valida. ");
        } else if (numero == 1) {
                System.out.println("Escreva os números que quer somar. ");
                String expressao = scanner.nextLine();
                String[] MaisDe1Soma = expressao.split("\\+");

                for (int i = 0; i < MaisDe1Soma.length; i++) {
                    resultado += Double.parseDouble(MaisDe1Soma[i]);
                }
                System.out.println(resultado);


            } else if (numero == 2) {
                System.out.println("Escreva os números que quer subtrair. ");
                String expressao = scanner.nextLine();
                String[] MaisDe1Subtracao = expressao.split("\\-");
                resultado = Double.parseDouble(MaisDe1Subtracao[0]);

                for (int i = 1; i < MaisDe1Subtracao.length; i++) {
                    resultado -= Double.parseDouble(MaisDe1Subtracao[i]);
                }
                System.out.println (resultado);

            } else if (numero == 3) {
                System.out.println("Escreva os números que quer multiplicar. ");
                String expressao = scanner.nextLine();
                String[] MaisDe1multiplicacao = expressao.split("\\*");
                resultado = Double.parseDouble(MaisDe1multiplicacao[0]);
                for (int i = 1; i < MaisDe1multiplicacao.length; i++) {
                    resultado *= Double.parseDouble(MaisDe1multiplicacao[i]);
                }
                System.out.println(resultado);

            } else if (numero == 4) {
                System.out.println("Escreva sua divisão. ");
                String expressao = scanner.nextLine();
                String[] MaisDe1divisao = expressao.split("/");
                resultado = Double.parseDouble(MaisDe1divisao[0]);
                for (int i = 1; i < MaisDe1divisao.length; i++) {

                    resultado /= Double.parseDouble(MaisDe1divisao[i]);
                }
                System.out.println(resultado);
            } else if (numero == 5) {
                System.out.println(" Escreva o número que irá ser elevado. ");
                double NumeroASeElevar = scanner.nextDouble();
                System.out.println("Escreva o quanto quer eleva-lo ");
                double elevacao = scanner.nextDouble();
                double resultadoPotencia = Math.pow(NumeroASeElevar, elevacao);
                scanner.nextLine();
                System.out.println(NumeroASeElevar + " ^ " + elevacao + " = " + resultadoPotencia);
            } else if (numero == 6) {
                System.out.println("Saindo... ");
            }
        } while (numero != 6) ;


        }
    }



