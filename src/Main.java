import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final int THE_MONTH= 12;
        final int PERCENT= 100;
        long principal;
        int timeInYears = 1;
        double annualInterest;
        double monthlyInterest=0;
        int numberOfPayments=0;

        Scanner scanner = new Scanner(System.in);
            while(true) {
                System.out.print("Enter the Amount you need($1k - $1M) :");
                principal = scanner.nextLong();
                if (principal>=1000 && principal<=1_000_000_000)
                    break;
                else
                    System.out.println("Amount not readable in our system");
            }

            while(true) {
                System.out.print("The annualInterest Rate :");
                 annualInterest = scanner.nextDouble();
                if (annualInterest> 0 && annualInterest<= 30)
                    break;
                    else
                    System.out.println("We are currently not offering this rate");
                monthlyInterest = annualInterest / PERCENT / THE_MONTH;
            }
            while(true) {
                System.out.print("How long would you pay back (years) :");
                timeInYears = scanner.nextInt();
                if (timeInYears > 0 && timeInYears<=20)
                    break;
                else
                    System.out.println("We cant offer you a loan with this year range");
                numberOfPayments = timeInYears * THE_MONTH;
            }
        //double loanCalculator = principal * ( monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))/
        //                                            (Math.pow(1 + monthlyInterest, numberOfPayments) -1);
        double interest = (principal * annualInterest * timeInYears) / 100;
            double caculateTotal = principal + interest;



        String loan = NumberFormat.getCurrencyInstance().format(caculateTotal);
        System.out.println("Total loan refund : "+ loan);



    }
}
