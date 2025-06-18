public class FinancialRecord {
    private final double income;
    private final double expenses;

    public FinancialRecord(double income, double expenses) {
        this.income = income;
        this.expenses = expenses;
    }

    public double getIncome() {
        return income;
    }

    public double getExpenses() {
        return expenses;
    }

    public double getNetSavings() {
        return income - expenses;
    }
}
