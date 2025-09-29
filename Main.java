class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}

class InvalidAmountException extends RuntimeException {
    public InvalidAmountException(String msg) {
        super(msg);
    }
}

public class Main {
    private String acc_name;
    private double bal;

    public Main(String name, double openbal) throws InvalidAmountException {
        if (openbal < 0) {
            throw new InvalidAmountException("Opening balance can't be negative");
        }
        this.acc_name = name;
        this.bal = openbal;
    }

    public void withdraw(double amt, int pin) throws InsufficientFundsException {
        if (amt <= 0) {
            throw new InsufficientFundsException("Withdraw amount must be positive");
        }
        if (amt > bal) {
            throw new InsufficientFundsException("Insufficient funds: short by " + (amt - bal));
        }
        bal -= amt;
        System.out.println("Withdraw amt: " + amt + ", Remaining bal: " + bal);
    }

    public void deposit(double amt) throws InvalidAmountException {
        if (amt <= 0) {
            throw new InvalidAmountException("Deposit amount must be positive");
        }
        bal += amt;
    }

    public double getbal() {
        return bal;
    }

    public static void main(String[] args) {
        try {
            Main rahul = new Main("Rahul", 1000.45);
            rahul.withdraw(2000, 1234);
        } catch (InvalidAmountException e) {
            System.out.println("Invalid Amount: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Parent exception class: " + e.getMessage());
        } finally {
            System.out.println("Your session expired");
        }

        try {
            Main rahul = new Main("Rahul", 1000.45);
            rahul.deposit(-200);
        } catch (InvalidAmountException e) {
            System.out.println("Deposit error: " + e.getMessage());
        }

        Main rahul = new Main("Rahul", 1000.45);
        System.out.println("Final Balance of " + rahul.acc_name + ": " + rahul.getbal());
    }
}
