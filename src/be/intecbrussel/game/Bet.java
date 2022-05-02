package be.intecbrussel.game;

public class Bet {

    private final double WINRATE = 2.5;
    private double amountBet;

    public Bet() {
        this(0);
    }

    public Bet(double amount) {
        setAmountBet(amount);
    }

    public void setAmountBet(double amountBet) {
        this.amountBet = amountBet;
    }

    public double getAmountBet() {
        return amountBet;
    }

    public double winBet() {
        return this.amountBet *= WINRATE;
    }

}


