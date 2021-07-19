package red.patterns.structural.proxy;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class Passenger {
    private String name;
    private int balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void addToBalance(int plus) {
        this.balance += plus;
    }

    public void removeFromBalance(int minus) {
        if (minus > balance)
            throw new IllegalStateException("Not enough money on balance");
        this.balance -= minus;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
