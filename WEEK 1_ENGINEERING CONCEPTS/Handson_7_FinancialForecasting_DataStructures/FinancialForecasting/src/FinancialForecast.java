import java.util.Scanner;
public class FinancialForecast {
    public static double Forecast(double presentValue,double growthRate,int years) {
        if (years == 0) {
            return presentValue;
        }
        return Forecast(presentValue,growthRate,years - 1)*(1 + growthRate);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter present value (₹): ");
        double presentValue=sc.nextDouble();

        System.out.print("Enter annual growth rate (in %, e.g., 10 for 10%): ");
        double growthRatePercent=sc.nextDouble();
        double growthRate=growthRatePercent / 100.0;

        System.out.print("Enter number of years: ");
        int years=sc.nextInt();

        double futureValue=Forecast(presentValue, growthRate, years);
        System.out.println("Future value after " + years + " years: ₹" + String.format("%.2f", futureValue));
        sc.close();
    }
}
