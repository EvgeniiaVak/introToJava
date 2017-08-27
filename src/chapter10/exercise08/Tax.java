package chapter10.exercise08;

public class Tax {
    public static final int
            SINGLE_FILER = 0,
            MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER = 1,
            MARRIED_SEPARATELY = 2,
            HEAD_OF_HOUSEHOLD = 3;

    private int filingStatus;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;

    public Tax() {
        this(SINGLE_FILER, TaxData.BRACKETS_2009, TaxData.RATES_2009, 30000);
    }

    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public int getFilingStatus() {
        return filingStatus;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double getTax() {
        double tax = 0;
        double incomeLeft = taxableIncome;
        for (int i = 0; i < rates.length; i++) {
            //if it's the largest rate
            if (i == rates.length - 1) {
                //no need to look for other steps, just add what's left of
                //of the income from previous steps
                tax += incomeLeft * (rates[i]);
                break;
            }

            //if income is larger than this step upper margin
            if (taxableIncome > brackets[filingStatus][i]) {
                //add the money
                tax += brackets[filingStatus][i] * (rates[i] / 100);
                //make sure the las step will have the correct income left
                incomeLeft -= brackets[filingStatus][i];
            } else {
                //it's the last step
                tax += incomeLeft * (rates[i] / 100);
                break;
            }

        }

        return tax;
    }
}
