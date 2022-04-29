package be.intecbrussel.util;

import be.intecbrussel.cards.Card;
import be.intecbrussel.cards.Deck;

import java.util.Random;

public class CardRandom {


    public static Deck shuffleDeck(Deck deck) {
        Random random = new Random();
        Card tempCard = new Card("A", "Spades");
        boolean[] cardsAreUnique = new boolean[52];
        int[] shuffleLocation = new int[52];

        for (int index = 0; index < shuffleLocation.length;) {
            int value = random.nextInt(52);
            if (!cardsAreUnique[value]) {
                shuffleLocation[index] = value;
                cardsAreUnique[value] = true;
                index++;
            }
        }

        for (int index =0;index<shuffleLocation.length;index++){
            tempCard = deck.getCards(index);
            deck.setCards(deck.getCards(shuffleLocation[index]),index);
            deck.setCards(tempCard,shuffleLocation[index]);

        }



        return deck;
    }
}
