package ee.itcollege.ics0004.practice8;

import java.util.ArrayList;
import java.util.Collections;

public class CardDeck {

    ArrayList<Card> cardDeck;

    public CardDeck(){

        cardDeck = new ArrayList<>();

        for (CardRank rank : CardRank.values()) {

            for(CardSuit suit : CardSuit.values()){

                cardDeck.add(new Card(rank, suit));

            }
        }

    }

    public ArrayList getCardDeck(){
        return cardDeck;
    }

    public void shuffle(){
        Collections.shuffle(cardDeck);
    }
}