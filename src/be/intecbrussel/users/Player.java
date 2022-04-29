package be.intecbrussel.users;

public class Player {

    private String player;
    private double money;
    private int age;
//    private Statistics Statistics;


    public String getPlayer() {
        return player;
    }

    public double getMoney() {
        return money;
    }

    public int getAge() {
        return age;
    }

    public void addMoney(double money) {
        this.money += Math.abs(money);
    }

    public void subtractMoney(double money) {
        if (this.money - Math.abs(money) < 0) {
            System.out.println("Your balance cannot go under 0!");
        } else {
            this.money -= Math.abs(money);
        }
    }



}



