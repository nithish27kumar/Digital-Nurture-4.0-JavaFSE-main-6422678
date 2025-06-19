public class FinancialForecast {

    public static double calculateFutureValue(double presentValue, double rate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return calculateFutureValue(presentValue * (1 + rate), rate, years - 1);
    }

    public static void main(String[] args) {
        double presentValue = 10000;
        double annualGrowthRate = 0.10;
        int forecastYears = 5;

        double futureValue = calculateFutureValue(presentValue, annualGrowthRate, forecastYears);
        System.out.printf("Predicted Future Value after %d years: Rs.%.2f%n", forecastYears, futureValue);
    }
}
