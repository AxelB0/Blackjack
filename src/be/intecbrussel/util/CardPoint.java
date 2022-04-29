package be.intecbrussel.util;

import be.intecbrussel.cards.Card;

public class CardPoint {
    public int getScore(Card card){
        String value = card.getValue();
        if (value.equals("K")|| value.equals("Q")||value.equals("J")){
            return 10;
        } else if(value.equals("A")){
            return 11;
        } else {
            return Integer.valueOf(value);
        }
    }







}
