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

        int dSemana = 3;

        switch (dSemana) {
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("\nQuarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sábado");
            case 7:
                System.out.println("Domingo");
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
