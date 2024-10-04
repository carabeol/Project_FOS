package ca.sheridancollege.project;


import java.util.ArrayList;

public class HumanPlayer extends Player{
    private ArrayList<Card> hand = new ArrayList<>();
    public HumanPlayer(String playerName) {
        super(playerName);
    }
    @Override
    public void play(){
        System.out.println(this.getName()+ " is playing,");
    }



    public ArrayList<Card> getHand(){
        return this.hand;
    }

    public void setHand(Card card){
        this.hand.add(card);
    }

    public void printCurrentHand(){
        System.out.println(this.getHand()+ " is "+ this.getName() +  " now hand:");
    }

}
