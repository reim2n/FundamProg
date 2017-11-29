package ee.itcollege.ics0004.practice8;

public class Card {

    private CardRank cardRank;
    private CardSuit cardSuit;

    public Card(CardRank cardRank, CardSuit cardSuit){

        this.cardRank = cardRank;
        this.cardSuit = cardSuit;

    }

    @Override
    public String toString() {
        return cardRank + " of " + cardSuit;
    }
}