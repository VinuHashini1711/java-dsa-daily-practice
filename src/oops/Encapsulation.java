package oops;

public class Encapsulation {
    public static class Expense {
        private String description;
        private double amount;
        private String category;
        public Expense(String description, double amount, String category) {
            this.description = description;
            this.amount = amount;
            this.category = category;
        }
        // Getter
        public double getAmount() {
            return amount;
        }

        // Controlled modification
        public void setAmount(double amount) {

            if (amount > 0) {
                this.amount = amount;
            } else {
                System.out.println("Amount must be positive");
            }
        }
        public String getDescription() {
            return description;
        }
        public String getCategory() {
            return category;
        }
    }
        public static void main(String[] args) {

            Expense expense =
                    new Expense("Grocery", 1500, "Food");

            System.out.println(expense.getAmount());

            expense.setAmount(2000);

            System.out.println(expense.getAmount());
        }
}
