import java.util.Scanner;

public class TestMarks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] gab = new char[5];
        char[] prova = new char[5];
        String[] nome = new String[3];
        double[] nota = new double[3];
        int a;
        double s = 0, m;

        cadastroGabarito(gab, scanner);

        for (a = 0; a < 3; a++) {
            System.out.println("------------------------");
            System.out.println("      ALUNO " + (a + 1));
            System.out.println("------------------------");
            System.out.print("Nome: ");
            nome[a] = scanner.nextLine();
            nota[a] = cadastraProva(gab, prova, scanner);
            s += nota[a];
        }

        System.out.println("        NOTAS FINAIS");
        System.out.println("-----------------------------");
        for (a = 0; a < 3; a++) {
            System.out.printf("%-10s%4.1f%n", nome[a], nota[a]);
        }
        m = s / 3;
        System.out.println("-----------------------------");
        System.out.println("      Media da Turma: " + m);
    }

    public static void cadastroGabarito(char[] gab, Scanner scanner) {
        System.out.println("PASSO 1 - Cadastro de Gabarito");
        System.out.println("-------------------------------");
        for (int c = 0; c < 5; c++) {
            System.out.print("Questao " + (c + 1) + ": ");
            gab[c] = scanner.nextLine().charAt(0);
        }
    }

    public static double cadastraProva(char[] gab, char[] prova, Scanner scanner) {
        double notaFinal = 0;
        System.out.println("RESPOSTAS DADAS");
        for (int c = 0; c < 5; c++) {
            System.out.print("Questao " + (c + 1) + ": ");
            prova[c] = scanner.nextLine().charAt(0);
            if (Character.toUpperCase(prova[c]) == Character.toUpperCase(gab[c])) {
                notaFinal += 2;
            }
        }
        return notaFinal;
    }

    }
}

