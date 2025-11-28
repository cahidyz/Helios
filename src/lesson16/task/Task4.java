package lesson16.task;

public class Task4 {

    public enum CardType {
        DEBIT(0, "For daily use"),
        CREDIT(20, "Has a credit limit"),
        VIRTUAL(0, "For online payments only"),
        PREMIUM(100, "Special cashback and VIP service");

        private final int annualFee;
        private final String description;

        CardType(int annualFee, String description) {
            this.annualFee = annualFee;
            this.description = description;
        }

        // Getters to access the data
        public int getAnnualFee() {
            return annualFee;
        }

        public String getDescription() {
            return description;
        }
    }

    public static void main(String[] args) {
        printCardInfo(CardType.DEBIT);
        printCardInfo(CardType.PREMIUM);
        printCardInfo(CardType.VIRTUAL);
    }

    public static void printCardInfo(CardType type) {
        System.out.println("Checking card type: " + type.name());

        switch (type) {
            case DEBIT:
                System.out.println("Category: Standard");
                break;
            case CREDIT:
                System.out.println("Category: Finance");
                break;
            case VIRTUAL:
                System.out.println("Category: Digital Only");
                break;
            case PREMIUM:
                System.out.println("Category: VIP");
                break;
        }
        System.out.println("Annual Fee: $" + type.getAnnualFee());
        System.out.println("Description: " + type.getDescription());
    }
}