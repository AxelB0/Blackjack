package be.intecbrussel.cards;

public class Card {

    private String value;
    private String suit;
    private static String[] values = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private static String[] suits = new String[] {"Spades", "Clovers", "Hearts", "Diamonds"};


    public Card(String value, String suit) {
        if (checkValue(value)) {
            setValue(value);
        } else {
            System.out.println("Impossible value given!");
        }
        if (checkSuit(suit)) {
            setSuit(suit);
        } else {
            System.out.println("Impossible suit given!");
        }
    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public boolean checkValue(String value) {
        for (String s : values) {
            if (value.equals(s)) {
                return true;
            }
        }
       return false;
    }

    public boolean checkSuit(String suit) {
        for (String s : suits) {
            if (suit.equals(s)) {
                return true;
            }
        }
        return false;
    }

    public static String[] getValues() {
        return values;
    }

    public static String[] getSuits() {
        return suits;
    }
}
