package chapter03;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by evgeniyavakarina on 7/19/17.
 *
 * TABLE 3.2 2009 U.S. Federal Personal Tax Rates
 Marginal
 Tax                        Married Filing Jointly or
 Rate   Single              Qualifying Widow(er)        Married Filing Separately       Head of Household
 10% $0 – $8,350            $0 – $16,700                $0 – $8,350                     $0 – $11,950
 15% $8351– $33,950        $16701 – $67,900           $8351 – $33,950                $11951 – $45,500
 25% $33951 – $82,250      $67901 – $137,050          $33951 – $68,525               $45501 – $117,450
 28% $82251 – $171,550     $137051 – $208,850         $68526 – $104,425              $117451 – $190,200
 33% $171551 – $372,950    $208851 – $372,950         $104426 – $186,475             $190201 – $372,950
 35% $372951...            $372951...                 $186476...                     $372951...

 */

public class ComputeTax {
    private Map<Double, Double> steps = new TreeMap<>();

    public static void main(String[] args) {
        ComputeTax computeTax = new ComputeTax();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 for single filers, 2 for married filing jointly or qualified widow(er), 3 for married filing separately, and 4 for head of household.");
        int filingStatus = scanner.nextInt();
        System.out.println("Enter income: ");
        double income = scanner.nextDouble();
        double tax = computeTax.solveForTax(income, filingStatus);
        System.out.printf("Tax is calculated as: %.2f%n", tax);
    }

    private double solveForTax (double income, int typeOfFiler) {
        assignSteps(typeOfFiler);

        double tax = 0.0;


        double moneyPreviousStep = 0.0;
        for (Map.Entry<Double, Double> step :
                steps.entrySet()) {
            double percentage = step.getKey();
            double moneyCurrentStep = step.getValue();

            if (income < moneyCurrentStep || percentage == .35) {
                tax += (income - moneyPreviousStep) * percentage;
                break;
            } else {
                tax += (moneyCurrentStep - moneyPreviousStep) * percentage;
                moneyPreviousStep = moneyCurrentStep;
            }
        }

        return tax;
    }


    private void assignSteps (int typeOfFiler) {
        steps.clear();

        switch (typeOfFiler) {
            case 1:
                steps.put(.10, 8351.0);
                steps.put(.15, 33951.0);
                steps.put(.25, 82251.0);
                steps.put(.28, 171551.0);
                steps.put(.33, 372951.0);
                steps.put(.35, 0.0);
                break;
            case 2:
                steps.put(.10, 16701.0);
                steps.put(.15, 67901.0);
                steps.put(.25, 137051.0);
                steps.put(.28, 208851.0);
                steps.put(.33, 372951.0);
                steps.put(.35, 0.0);
                break;
            case 3:
                steps.put(.10, 8351.0);
                steps.put(.15, 33951.0);
                steps.put(.25, 68526.0);
                steps.put(.28, 104426.0);
                steps.put(.33, 186476.0);
                steps.put(.35, 0.0);
                break;
            case 4:
                steps.put(.10, 11951.0);
                steps.put(.15, 45501.0);
                steps.put(.25, 117451.0);
                steps.put(.28, 190201.0);
                steps.put(.33, 372951.0);
                steps.put(.35, 0.0);
                break;
            default:
                System.out.println("Something went wrong! typeOfFiler = " + typeOfFiler);
        }
    }

}
