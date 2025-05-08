import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Integer escolha;
        double valor;
        double resultado;
        String loop ="S";
        Conversor cotacao = new Conversor();
        try {
            System.out.println();
            System.out.println("---Bem Vindo ao Conversor de Moedas Java!---");
            System.out.println();
            System.out.println("✅ Informe seu Nome para Começar:");
            String nome = entrada.nextLine();
            do {

                System.out.println("Olá Senhor(a):" + nome);
                System.out.println("----------------------------");
                cotacao.CotacaoAtual();
                System.out.println("----------------------------");
                System.out.println();
                System.out.println("Escolha uma opção para Conversão:");
                System.out.println();
                System.out.println("---------------Menu-----------------");
                System.out.println(" 1- BRL/Real   >>>  USD/Dolar ");
                System.out.println(" 2- BRL/Real   <<<  USD/Dolar");
                System.out.println();
                System.out.println(" 3- EUR/Euro   >>>  USD/Dolar");
                System.out.println(" 4- EUR/Euro   <<<  USD/Dolar");
                System.out.println();
                System.out.println(" 5- GBP/Libra Esterlina  >>> USD/Dolar ");
                System.out.println(" 6- GBP/Libra Esterlina  <<< USD/Dolar ");
                System.out.println();
                System.out.println(" 7- JPY/Iene   >>>   USD/Dolar");
                System.out.println(" 8- JPY/Iene   <<<   USD/Dolar");
                System.out.println();
                System.out.println(" 9- ARS/Peso Argentino  >>>  USD/Dolar ");
                System.out.println(" 10-ARS/Peso Argentino  <<<  USD/Dolar");
                System.out.println("--------------------------------------");
                do {
                    System.out.println(" ✅ Informe sua Escolha:");
                    escolha = entrada.nextInt();
                    entrada.nextLine();
                    if (escolha >= 11 || escolha <= 0) {
                        System.out.println("❌ Opção Invalida!\nTente Novamente");
                    }
                } while (escolha <= 0 || escolha >= 11);

                do {
                    System.out.println(" ✅ Informe o Valor:");
                    valor = entrada.nextDouble();
                    entrada.nextLine();
                    if (valor <= 0) {
                        System.out.println("❌ Valor Invalido!\nInforme outro Valor.");
                    }
                } while (valor <= 0);

                switch (escolha) {

                    case 1:
                        System.out.println("-------------------------Valor Convertido-------------------------------");
                        System.out.println();
                        resultado = Conversor.ExibirConversor("BRL", "USD", valor);
                        System.out.printf("➡️ Resultado: %.2f %s = %.2f %s%n", valor, "BRL/Real", resultado, "USD/Dolar");
                        System.out.println();
                        System.out.println("------------------------------------------------------------------------");
                        System.out.println();
                        System.out.println(" ✅ Gostaria de Continuar S/Sim ou N/Não?");
                        loop = entrada.nextLine();
                        if(loop.equalsIgnoreCase("n")){
                            System.out.println("Obrigado Por usar nossa Aplicação");
                            System.out.println("-------------------------------------");
                        }

                        System.out.println();
                        break;

                    case 2:

                        System.out.println("-------------------------Valor Convertido-------------------------------");
                        System.out.println();
                        resultado = Conversor.ExibirConversor("USD", "BRL", valor);
                        System.out.printf("➡️ Resultado: %.2f %s = %.2f %s%n", valor, "USD/Dolar", resultado, "BRL/Real");
                        System.out.println();
                        System.out.println("------------------------------------------------------------------------");
                        System.out.println();
                        System.out.println("✅ Gostaria de Continuar S/Sim ou N/Não?");
                        loop = entrada.nextLine();
                        if(loop.equalsIgnoreCase("n")){
                            System.out.println("Obrigado Por usar nossa Aplicação");
                            System.out.println("-------------------------------------");
                        }
                        System.out.println();
                        break;

                    case 3:
                        System.out.println("-------------------------Valor Convertido-------------------------------");
                        System.out.println();
                        resultado = Conversor.ExibirConversor("EUR", "USD", valor);
                        System.out.printf(" ➡️ Resultado: %.2f %s = %.2f %s%n", valor, "EUR/Euro", resultado, "USD/Dolar");
                        System.out.println();
                        System.out.println("------------------------------------------------------------------------");
                        System.out.println();
                        System.out.println("✅ Gostaria de Continuar S/Sim ou N/Não?");
                        loop = entrada.nextLine();
                        if(loop.equalsIgnoreCase("n")){
                            System.out.println("Obrigado Por usar nossa Aplicação");
                            System.out.println("-------------------------------------");
                        }
                        System.out.println();
                        break;

                    case 4:
                        System.out.println("-------------------------Valor Convertido-------------------------------");
                        System.out.println();
                        resultado = Conversor.ExibirConversor("USD", "EUR", valor);
                        System.out.printf("➡️ Resultado: %.2f %s = %.2f %s%n", valor, "USD/Dolar", resultado, "EUR/Euro");
                        System.out.println();
                        System.out.println("------------------------------------------------------------------------");
                        System.out.println();
                        System.out.println("✅ Gostaria de Continuar S/Sim ou N/Não?");
                        loop = entrada.nextLine();
                        if(loop.equalsIgnoreCase("n")){
                            System.out.println("Obrigado Por usar nossa Aplicação");
                            System.out.println("-------------------------------------");
                        }
                        System.out.println();
                        break;

                    case 5:
                        System.out.println("-------------------------Valor Convertido------------------------------------------");
                        System.out.println();
                        resultado = Conversor.ExibirConversor("GBP", "USD", valor);
                        System.out.printf("➡️ Resultado: %.2f %s = %.2f %s%n", valor, "GBP/Libra Esterlina", resultado, "USD/Dolar");
                        System.out.println();
                        System.out.println("------------------------------------------------------------------------------------");
                        System.out.println();
                        System.out.println("✅ Gostaria de Continuar S/Sim ou N/Não?");
                        loop = entrada.nextLine();
                        if(loop.equalsIgnoreCase("n")){
                            System.out.println("Obrigado Por usar nossa Aplicação");
                            System.out.println("-------------------------------------");
                        }
                        System.out.println();
                        break;

                    case 6:
                        System.out.println("-------------------------Valor Convertido------------------------------------------");
                        System.out.println();
                        resultado = Conversor.ExibirConversor("USD", "GBP", valor);
                        System.out.printf("➡️ Resultado: %.2f %s = %.2f %s%n", valor, "USD/Dolar", resultado, "GBP/Libra Esterlina");
                        System.out.println();
                        System.out.println("------------------------------------------------------------------------------------");
                        System.out.println();
                        System.out.println("✅ Gostaria de Continuar S/Sim ou N/Não?");
                        loop = entrada.nextLine();
                        if(loop.equalsIgnoreCase("n")){
                            System.out.println("Obrigado Por usar nossa Aplicação");
                            System.out.println("-------------------------------------");
                        }
                        System.out.println();
                        break;

                    case 7:
                        System.out.println("-------------------------Valor Convertido-------------------------------");
                        System.out.println();
                        resultado = Conversor.ExibirConversor("JPY", "USD", valor);
                        System.out.printf(" ➡️Resultado: %.2f %s = %.2f %s%n", valor, "JPY/Iene", resultado, "USD/Dolar");
                        System.out.println();
                        System.out.println("------------------------------------------------------------------------");
                        System.out.println();
                        System.out.println("✅ Gostaria de Continuar S/Sim ou N/Não?");
                        loop = entrada.nextLine();
                        if(loop.equalsIgnoreCase("n")){
                            System.out.println("Obrigado Por usar nossa Aplicação");
                            System.out.println("-------------------------------------");
                        }
                        System.out.println();
                        break;

                    case 8:
                        System.out.println("-------------------------Valor Convertido-------------------------------");
                        System.out.println();
                        resultado = Conversor.ExibirConversor("USD", "JPY", valor);
                        System.out.printf(" ➡️ Resultado: %.2f %s = %.2f %s%n", valor, "USD/Dolar", resultado, "JPY/Iene");
                        System.out.println();
                        System.out.println("------------------------------------------------------------------------");
                        System.out.println();
                        System.out.println(" ✅ Gostaria de Continuar S/Sim ou N/Não?");
                        loop = entrada.nextLine();
                        if(loop.equalsIgnoreCase("n")){
                            System.out.println("Obrigado Por usar nossa Aplicação");
                            System.out.println("-------------------------------------");
                        }
                        System.out.println();
                        break;

                    case 9:
                        System.out.println("-------------------------Valor Convertido-------------------------------");
                        System.out.println();
                        resultado = Conversor.ExibirConversor("ARS", "USD", valor);
                        System.out.printf("➡️ Resultado: %.2f %s = %.2f %s%n", valor, "ARS/Peso Argentino", resultado, "USD/Dolar");
                        System.out.println();
                        System.out.println("------------------------------------------------------------------------");
                        System.out.println();
                        System.out.println("✅ Gostaria de Continuar S/Sim ou N/Não?");
                        loop = entrada.nextLine();
                        if(loop.equalsIgnoreCase("n")){
                            System.out.println("Obrigado Por usar nossa Aplicação");
                            System.out.println("-------------------------------------");
                        }
                        System.out.println();
                        break;

                    case 10:
                        System.out.println("-------------------------Valor Convertido-----------------------------------------");
                        System.out.println();
                        resultado = Conversor.ExibirConversor("USD", "ARS", valor);
                        System.out.printf(" ➡️ Resultado: %.2f %s = %.2f %s%n", valor, "USD/Dolar", resultado, "ARS/Peso Argentino");
                        System.out.println();
                        System.out.println("-----------------------------------------------------------------------------------");
                        System.out.println();
                        System.out.println("✅ Gostaria de Continuar S/Sim ou N/Não?");
                        loop = entrada.nextLine();
                        if(loop.equalsIgnoreCase("n")){
                            System.out.println("Obrigado Por usar nossa Aplicação");
                            System.out.println("-------------------------------------");
                        }
                        System.out.println();
                        break;
                }
                    }while(!loop.equalsIgnoreCase("N"));

            } catch(Exception e){
                System.out.println("Erro ao converter moeda: " + e.getMessage());
            }

    }

}
