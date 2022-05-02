package be.intecbrussel.users;

public class Player {

    private String player;
    private double money;
    private int age;

//    private Statistics Statistics;

    public Player(){
        this ("Default",0.00,18);
    }

    public Player(String player, double money, int age){
        this.player = player;
        this.money = money;
        this.age = age;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setAge(int age) {
        this.age = age;
        if (age<18){
            System.out.println("Too young to play, come back later!");
            System.exit(0);
        }
    }

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



