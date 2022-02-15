package Lab6;

public class Tax {
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;

    private int filingStatus;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;

    public Tax(){
        this.filingStatus = SINGLE_FILER;
        this.brackets = new int[][]{
                {8350, 33950, 82250, 171550, 372950},
                {16700, 67900, 137050, 208850, 372950},
                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}
        };
        this.rates = new double[]{0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        this.taxableIncome = 400000;
    }
    public Tax(int filingStatus, int[][]brackets,double[] rates,double taxableIncome){
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }
    public double getTax(){
        if (this.taxableIncome <= this.brackets[this.filingStatus][0])
            return this.taxableIncome * this.rates[0];

        if (this.taxableIncome <= this.brackets[this.filingStatus][1])
            return (this.brackets[this.filingStatus][0] * this.rates[0]) +
                    (this.taxableIncome - this.brackets[this.filingStatus][0]) * this.rates[1];

        if (this.taxableIncome <= this.brackets[this.filingStatus][2])
            return (this.brackets[this.filingStatus][0] * this.rates[0]) +
                    (this.brackets[this.filingStatus][1] - this.brackets[this.filingStatus][0]) * this.rates[1] +
                    (this.taxableIncome - this.brackets[this.filingStatus][1]) * this.rates[2];

        if (this.taxableIncome <= this.brackets[this.filingStatus][3])
            return (this.brackets[this.filingStatus][0] * this.rates[0]) +
                    (this.brackets[this.filingStatus][1] - this.brackets[this.filingStatus][0]) * this.rates[1] +
                    (this.brackets[this.filingStatus][2] - this.brackets[this.filingStatus][1]) * this.rates[2] +
                    (this.taxableIncome - this.brackets[this.filingStatus][2]) * this.rates[3];

        if (this.taxableIncome <= this.brackets[this.filingStatus][4])
            return (this.brackets[this.filingStatus][0] * this.rates[0]) +
                    (this.brackets[this.filingStatus][1] - this.brackets[this.filingStatus][0]) * this.rates[1] +
                    (this.brackets[this.filingStatus][2] - this.brackets[this.filingStatus][1]) * this.rates[2] +
                    (this.brackets[this.filingStatus][3] - this.brackets[this.filingStatus][2]) * this.rates[3] +
                    (this.taxableIncome - this.brackets[this.filingStatus][3]) * this.rates[4];

        return (this.brackets[this.filingStatus][0] * this.rates[0]) +
                (this.brackets[this.filingStatus][1] - this.brackets[this.filingStatus][0]) * this.rates[1] +
                (this.brackets[this.filingStatus][2] - this.brackets[this.filingStatus][1]) * this.rates[2] +
                (this.brackets[this.filingStatus][3] - this.brackets[this.filingStatus][2]) * this.rates[3] +
                (this.brackets[this.filingStatus][4] - this.brackets[this.filingStatus][3]) * this.rates[4] +
                (this.taxableIncome - this.brackets[this.filingStatus][4]) * this.rates[5];
    }

}
