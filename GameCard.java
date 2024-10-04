package ca.sheridancollege.project;

public class GameCard extends Card {
    private String card_value;
    private String name;
    private char card_suit;
    private char[] suits = {'\u2665', '\u2666', '\u2663','\u2660'};
    private String[] cardValues = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    public GameCard() {

    }
    public GameCard(String value, char suit) {
        this.card_suit = suit;
        this.card_value = value;
    }


    @Override
    public String toString() {
        return card_value +" "+ card_suit;
    }

    public String getCardValue() {
        return card_value;
    }

    public char getCardSuit() {
        return card_suit;
    }


    public char[] getSuits() {
        return suits;
    }

    public String[] getValues() {
        return cardValues;
    }

    public String getName() {
        return this.name ;
    }
}
