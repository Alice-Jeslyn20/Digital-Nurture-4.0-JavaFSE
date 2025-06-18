import java.util.ArrayList;
import java.util.List;

public class FinancialForecast {
    private final List<FinancialRecord> records;

    public FinancialForecast() {
        records = new ArrayList<>();
    }

    public void addMonthlyRecord(double income, double expenses) {
        records.add(new FinancialRecord(income, expenses));
    }

    public double calculateAverageIncome() {
        double totalIncome = 0;
        for (FinancialRecord record : records) {
            totalIncome += record.getIncome();
        }
        return totalIncome / records.size();
    }

    public double calculateAverageExpenses() {
        double totalExpenses = 0;
        for (FinancialRecord record : records) {
            totalExpenses += record.getExpenses();
        }
        return totalExpenses / records.size();
    }

    public double forecastSavings(int futureMonths) {
        double avgIncome = calculateAverageIncome();
        double avgExpenses = calculateAverageExpenses();
        return (avgIncome - avgExpenses) * futureMonths;
    }

    public void showReport() {
        System.out.println("=== Financial Records ===");
        for (int i = 0; i < records.size(); i++) {
            FinancialRecord r = records.get(i);
            System.out.println("Month " + (i + 1) + ": Income = $" + r.getIncome() + 
                ", Expenses = $" + r.getExpenses() + ", Net Savings = $" + r.getNetSavings());
        }
    }
}
