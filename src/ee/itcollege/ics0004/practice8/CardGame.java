package ee.itcollege.ics0004.practice8;

import java.util.ArrayList;

public class CardGame {

    public static void main(String[] args) {

        CardDeck mCardDeck = new CardDeck();

        mCardDeck.shuffle();

        ArrayList<Object> hand = new ArrayList<>();

        for(int i = 0; i < 5; i++ ){

            hand.add(mCardDeck.getCardDeck().remove(0));

        }

        for (Object card: hand) {

            System.out.println(card);

        }



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