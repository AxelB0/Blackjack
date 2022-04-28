package be.intecbrussel.debug;

import be.intecbrussel.cards.Card;
import be.intecbrussel.cards.Deck;

import java.util.Arrays;

public class debug {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Card[] cards = deck.getCards();

        for (Card c: cards){
            System.out.println(c.getValue());
            System.out.println(c.getSuit());


        }

    }
}
