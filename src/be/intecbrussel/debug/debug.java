package be.intecbrussel.debug;

import be.intecbrussel.cards.Card;
import be.intecbrussel.cards.Deck;
import be.intecbrussel.util.CardRandom;


public class debug {
    public static void main(String[] args) {
        Deck deck = new Deck();
//        Card[] cards = deck.getCards();

        for (Card c: deck.getCards()){
            System.out.println(c.getValue());
            System.out.println(c.getSuit());

        }

        System.out.println(deck.getCards(3).getValue() + " of " + deck.getCards(3).getSuit());

        deck = CardRandom.shuffleDeck(deck);

        for (Card c: deck.getCards()){
            System.out.println(c.getValue() + " " + c.getSuit());

        }

    }
}
