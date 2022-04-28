package be.intecbrussel.cards;

import static be.intecbrussel.cards.Card.getSuits;
import static be.intecbrussel.cards.Card.getValues;

public class Deck {

    private Card[] cards;

    public Deck() {
        this.cards = generateDeck();
    }

    public Card[] getCards() {
        return cards;
    }

    public Card[] generateDeck() {
        Card[] deck = new Card[52];
        String[] values = getValues();
        String[] suits = getSuits();

        for (int index = 0, valueCounter = 0, suitCounter = 0; index < deck.length; index++,valueCounter++) {

            if (valueCounter == 13) {
                valueCounter=0;
            }

            if (index % 13 == 0 && index != 0) {
                suitCounter++;
            }
            deck[index] = new Card(values[valueCounter], suits[suitCounter]);


        }
        return deck;
    }
}
