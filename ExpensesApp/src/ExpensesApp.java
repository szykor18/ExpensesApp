import java.util.Scanner;

public class ExpensesApp {
    public void start() {
        Scanner scanner = new Scanner(System.in);
        ExpenseManage expenseManage = new ExpenseManage();
        while (true) {
            System.out.println("1: Wyświetl wydatki");
            System.out.println("2: Wyświetl wydatki z danego miesiąca");
            System.out.println("3: Dodaj wydatek");
            System.out.println("4: Zakończ aplikację");
            System.out.println("Wybierz opcję: (1-4)");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> expenseManage.displayAllExpenses();
                case 2 -> expenseManage.displayMonthExpenses(scanner);
                case 3 -> expenseManage.addExpense(scanner);
                case 4 -> {
                    System.out.println("Aplikacja została wyłączona. ");
                    scanner.close();
                    System.exit(0);
                }
            }
        }
    }
}
