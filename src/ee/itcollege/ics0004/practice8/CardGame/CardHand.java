package ee.itcollege.ics0004.practice8.CardGame;

import ee.itcollege.ics0004.practice8.CardGame.Card.Card;
import ee.itcollege.ics0004.practice8.CardGame.Card.CardRank;

import java.util.ArrayList;

public class CardHand {

    private ArrayList<Card> mHand = new ArrayList<>();

    public CardHand(CardDeck mCardDeck) {

        for (int i = 0; i < 5; i++) {

            mHand.add(mCardDeck.getCard());
        }
    }

    public void showHand() {

        for (Object card : mHand) {

            System.out.println(card);

        }
    }

    public String checkForPokerHand() {

        int sumOfCards = 0;

        for (CardRank rank : CardRank.values()) {
            for (Card card : mHand) {

                if (card.getValue() == rank)
                    sumOfCards++;

                if (sumOfCards == 2)
                    return "You have a pair of " + rank + "s";

            }
        }

        return "TODO"; // TODO

    }
}