public class TipCalculator {
    public static void main(String[] args) {
        private double bill;
        private int tipPercentage;
        private int numPeople;

    public TipCalculator ( double b, int tP, int g) {
            this.bill = b;
            this.tipPercentage = tP;
            this.numPeople = g;
        }

        public void findTotalTip (double tipTotal)
        {
            tipTotal = (this.bill * this.tipPercentage) / 100.0;
        }

        public void findTotal (double total)
        {
            total = (tipTotal + this.bill);
        }

        public void findTipEach (double tipPerPerson)
        {
            tipPerPerson = (tipTotal / this.numPeople);
        }

        public void findTotalEach (double totalPerPerson)
        {
            totalPerPerson = (total / this.numPeople);
        }

        public void findAll {
            findTotalTip();
            findTotal();
            findTipEach();
            findTotalEach();
        }

        public void printInfo() {
            System.out.printf("The total tip amount is: $%.2f\n", tipTotal);
            System.out.printf("The total bill including tip is: $%.2f\n", total);
            System.out.printf("The tip per person is: $%.2f\n", tipPerPerson);
            System.out.printf("The total per person is: $%.2f\n", totalPerPerson);
        }
    }
}
