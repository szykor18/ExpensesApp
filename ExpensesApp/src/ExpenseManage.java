import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExpenseManage {
    List<Expense> expenses = new ArrayList<>();
    public void displayAllExpenses() {
        expenses.forEach(ExpenseManage::displayExpense);
    }
    private static void displayExpense(Expense expense) {
        System.out.println(expense.type());
        System.out.println(expense.month());
        System.out.println(expense.value());
        System.out.println(expense.description());
    }
    public void displayMonthExpenses(Scanner scanner) {
        System.out.println("Z którego miesiąca wyświetlić wydatki? ");
        int month = Integer.parseInt(scanner.nextLine());
        expenses.stream()
                .filter(expense -> expense.month() == month)
                .forEach(ExpenseManage::displayExpense);
    }
    public void addExpense(Scanner scanner) {
        System.out.println("Podaj typ wydatku: ");
        String type = scanner.nextLine();
        System.out.println("Podaj miesiąc: ");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.println("Podaj cenę: ");
        double value = Double.valueOf(scanner.nextLine());
        System.out.println("Podaj opis wydatku: ");
        String description = scanner.nextLine();

        this.expenses.add(new Expense(type, month, value, description));
    }
}
