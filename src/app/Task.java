package app;
import java.util.Scanner;
public class Task {
    public static double amountIncome;
    public static double tax;
    private final static String CURRENCY = "UAH";

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("If you want to calculate your tax, enter the amount of your income, %s: ",
                CURRENCY);
        amountIncome = sc.nextDouble();

        if (amountIncome >= 0 & amountIncome <= 10000){
            tax = amountIncome / 100 * 2.5;
            System.out.print("Your tax rate is 2,5%");
            System.out.printf("%nYour tax is %s: %.2f",
                    CURRENCY, tax);
        }
        else if (amountIncome >= 10001 & amountIncome <= 25001){
            tax = amountIncome / 100 * 4.3;
            System.out.print("Your tax rate is 4,3%");
            System.out.printf("%nYour tax is %s: %.2f",
                    CURRENCY, tax);
        }
        else {
            tax = amountIncome / 100 * 6.7;
            System.out.print("Your tax rate is 6,7%");
            System.out.printf("%nYour tax is %s: %.2f",
                    CURRENCY, tax);
        }
        sc.close();
    }
}
