import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
        public class Calculadora_com_menu_interativo {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                double menos;
                double multiplicacao;
                double divisao;
                double elevacao;
                System.out.println("Qual tipo de calculo você quer? ");
                System.out.println("Digite 1 para soma. ");
                System.out.println("Digite 2 para subtração. ");
                System.out.println("Digite 3 para multiplicação. ");
                System.out.println("Digite 4 para divisão. ");
                System.out.println("Digite 5 para elevação. ");
                System.out.println("Digite 6 para caso não queira fazer nenhum calculo e sair. ");
                String entrada = scanner.nextLine();
                String numeroTexto = entrada.replaceAll("[^0-9.]", "");
                double numero = Double.parseDouble(numeroTexto);
                double resultado = 0;
                if (numero == 1) {
                    System.out.println("Escreva os números que quer somar. ");
                    String expressao = scanner.nextLine();
                    String[] MaisDe1Soma = expressao.split("\\+");

                    for (int i = 0; i < MaisDe1Soma.length; i++) {
                        resultado += Double.parseDouble(MaisDe1Soma[i]);
                    }
                    System.out.print(resultado);
                } else if (numero == 2) {
                    System.out.println("Escreva os números que quer subtrair. ");
                    String expressao = scanner.nextLine();
                    String[] MaisDe1Subtracao = expressao.split("\\-");

                    for (int i = 0; i < MaisDe1Subtracao.length; i++) {
                        resultado -= Double.parseDouble(MaisDe1Subtracao[i]);
                    }
                    System.out.print(resultado);
                }
            }
        }


