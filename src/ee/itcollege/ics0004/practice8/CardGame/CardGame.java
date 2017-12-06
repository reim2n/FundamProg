package ee.itcollege.ics0004.practice8.CardGame;

import ee.itcollege.ics0004.practice8.CardGame.Card.CardRank;

import java.util.ArrayList;

public class CardGame {

    public static void main(String[] args) {

        CardDeck mCardDeck = new CardDeck();

        mCardDeck.shuffle();

        CardHand hand = new CardHand(mCardDeck);

        hand.showHand();

        System.out.println(hand.checkForPokerHand());

        // For deck printout
//        for (Card card : cardDeck) {
//
//            System.out.println(card);
//
//        }
//
//        System.out.println(cardDeck.size());

    }
}