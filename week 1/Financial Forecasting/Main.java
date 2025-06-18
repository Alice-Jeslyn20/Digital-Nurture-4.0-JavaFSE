public class Main {
    public static void main(String[] args) {
        FinancialForecast forecast = new FinancialForecast();

        // Add sample monthly data (real app would take input)
        forecast.addMonthlyRecord(4000, 2500);
        forecast.addMonthlyRecord(4200, 2600);
        forecast.addMonthlyRecord(4100, 2550);

        // Show current records
        forecast.showReport();

        // Forecast for next 6 months
        int futureMonths = 6;
        double expectedSavings = forecast.forecastSavings(futureMonths);

        System.out.println("\n=== Forecast ===");
        System.out.println("Average Income: $" + forecast.calculateAverageIncome());
        System.out.println("Average Expenses: $" + forecast.calculateAverageExpenses());
        System.out.println("Expected Net Savings for next " + futureMonths + " months: $" + expectedSavings);
    }
}
