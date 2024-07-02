package basic;

public class SIPcalculator
{
    public class SIPCalculator {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter monthly investment: "); double monthlyInvestment = input.nextDouble();

            System.out.print("Enter expected returns in percentage: ");

            double expected ReturnsInPer = input.nextDouble();

            System.out.print("Enter period in years: ");

            int periodInYears = input.nextInt();

            double principleAmount = monthlyInvestment * 12 periodinYears;

            double estimatedReturns = (principleAmount * expected ReturnsInPer) / 100;

            double totalAmount = principleAmount + estimated Returns;

            System.out.println("Principle Amount: " + principleAmount);

            System.out.println("Estimated Returns: " + estimated Returns);

            System.out.println("Total Amount: " + totalAmount);

            input.close();

        }

    }
}
