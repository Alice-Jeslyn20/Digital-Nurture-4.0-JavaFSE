public class Main {
    public static void main(String[] args) {
        // Get singleton Logger instance
        Logger logger1 = Logger.getInstance();
        logger1.log("First log message.");

        Logger logger2 = Logger.getInstance();
        logger2.log("Second log message.");

        // Check if both loggers are the same instance
        if (logger1 == logger2) {
            System.out.println("Both loggers are the same instance.");
        } else {
            System.out.println("Different instances — Singleton not implemented correctly.");
        }
    }
}

