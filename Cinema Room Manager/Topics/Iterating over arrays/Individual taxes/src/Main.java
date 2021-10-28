import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCompanies = scanner.nextInt();
        double[] companyIncomes = new double[numCompanies];
        double[] taxPaid = new double[numCompanies];

        for (int i = 0; i < numCompanies; i++) {
            companyIncomes[i] = scanner.nextDouble();
        }
        for (int j = 0; j < numCompanies; j++) {
            taxPaid[j] = scanner.nextDouble();
        }
        double max = companyIncomes[0] * taxPaid[0];
        int highestPayingCompany = 1;

        for (int i = 0; i < numCompanies; i++) {
            double paid = companyIncomes[i] * taxPaid[i];

            if (paid > max) {
                max = paid;
                highestPayingCompany = i + 1;
            }
        }
        System.out.println(highestPayingCompany);

    }
}