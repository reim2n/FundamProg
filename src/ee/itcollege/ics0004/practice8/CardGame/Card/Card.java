package ee.itcollege.ics0004.practice8.CardGame.Card;

public class Card {

    private CardRank cardRank;
    private CardSuit cardSuit;

    public Card(CardRank cardRank, CardSuit cardSuit){

        this.cardRank = cardRank;
        this.cardSuit = cardSuit;

    }

    public CardRank getValue(){
        return cardRank;
    }


    @Override
    public String toString() {
        return cardRank + " of " + cardSuit;
    }
}