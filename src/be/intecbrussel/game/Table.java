package be.intecbrussel.game;

import be.intecbrussel.cards.Deck;
import be.intecbrussel.users.Player;
import be.intecbrussel.util.CardRandom;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {

        Player player1 = newPlayer();
        startGame();
        bettingPhase(player1.getMoney());
        cardDealingStart();

    }


    public static boolean answerChecker(String answer) {
        String[] answers = new String[]{"Yes", "YES", "Y", "y", "play", "1", "Sure", "Yea", "yes"};

        for (String s : answers) {
            if (s.equals(answer)) {
                return true;
            }
        }
        return false;
    }

    public static Player newPlayer() {
        Scanner keyboardReader = new Scanner(System.in);

        Player player1 = new Player();
        System.out.println("What is your name?");
        player1.setPlayer(keyboardReader.nextLine());
        System.out.println("How much money you got?");
        player1.setMoney(keyboardReader.nextDouble());
        System.out.println("What's your age?");
        player1.setAge(keyboardReader.nextInt());


        return player1;
    }

    public static void startGame() {
        Scanner keyboardReader = new Scanner(System.in);

        System.out.println("do you want to play? Yes/No");

        if (answerChecker(keyboardReader.next())) {
            System.out.println("Make a bet.");
        } else {
            System.out.println("Come back if you want to play.");
            System.exit(0);
        }
    }

    public static void bettingPhase(double maxBet) {
        Scanner keyboardReader = new Scanner(System.in);

        double player1Bet = keyboardReader.nextDouble();
        while (player1Bet <= 0 || player1Bet>maxBet) {
            System.out.println("Please place a valid bet.");
            player1Bet = keyboardReader.nextDouble();
        }
        Bet bet1 = new Bet(player1Bet);
        System.out.println("You have bet " + bet1.getAmountBet());

    }

    public static void cardDealingStart(){
        Deck deck1 = new Deck();
        CardRandom.shuffleDeck(deck1);
        int counter =0;
        int score;
        System.out.println("Your cards are " + deck1.getCards(counter).getValue() + " of " + deck1.getCards(counter).getSuit());
        counter++;
        System.out.println("and " + deck1.getCards(counter).getValue() + " of " + deck1.getCards(counter).getSuit());

    }


}



