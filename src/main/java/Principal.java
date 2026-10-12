
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();

        int sapos = 0;
        int coelhos = 0;
        int ratos = 0;
        int total = 0;

        for (int i = 0; i < n; i++) {
            int quantidade = leitor.nextInt();
            char tipo = leitor.next().charAt(0);

            total += quantidade;

            if (tipo == 'C') {
                coelhos += quantidade;
            } else if (tipo == 'R') {
                ratos += quantidade;
            } else if (tipo == 'S') {
                sapos += quantidade;
            }
        }

        double percentualCoelhos = (coelhos * 100.0) / total;
        double percentualRatos = (ratos * 100.0) / total;
        double percentualSapos = (sapos * 100.0) / total;

        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + coelhos);
        System.out.println("Total de ratos: " + ratos);
        System.out.println("Total de sapos: " + sapos);

        System.out.printf("Percentual de coelhos: %.2f %%\n", percentualCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%\n", percentualRatos);
        System.out.printf("Percentual de sapos: %.2f %%\n", percentualSapos);

        leitor.close();
    }
}
