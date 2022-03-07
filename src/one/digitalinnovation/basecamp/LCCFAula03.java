package one.digitalinnovation.basecamp;

/*
 * Classe de exemplo para o exercício da Aula 3 Controle de Fluxo e Blocos.
 */

public class LCCFAula03 {
    public static void main(String[] args) {

        Mes();
        Ferias();
        Semana();
        Numero();

    }

    private static void Mes() {

        int mes = 6;
        if (mes == 1) {
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else if (mes == 12) {
            System.out.println("Dezembro");
        }
        else System.out.println("Mês Indefinido");

    }

    private static void Ferias() {

        String aMes = "Janeiro";
        switch (aMes){
            case "Janeiro":
            case "Julho":
            case "Dezembro":
                System.out.println("\nFérias");
                break;
        }




    }

    private static void Semana(){

        String dSemana = "Quarta" ;

        switch (dSemana) {
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println("\n" + 4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sábado":
                System.out.println(7);
            case "Domingo":
                System.out.println(1);
            default:
                throw new IllegalStateException("Dia da Semana Indefinido: " + dSemana);
        }

    }

    private static void Numero(){

        int numero = 3;
        switch (numero){
            case 1:
            case 2:
            case 3:
                System.out.println("\nCerto");
                break;
            case  4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor Indefinido");
                break;
        }

    }

}
