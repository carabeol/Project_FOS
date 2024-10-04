package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class StartGame extends Game{
    ArrayList<HumanPlayer> players = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    public StartGame(String name) {
        super(name);
    }

    public Deck build_deck (){
        GameCard card = new GameCard();
        String[] values = card.getValues();
        char[] suits = card.getSuits();
        ArrayList<GameCard> cards = new ArrayList<>();
        Deck deck = new Deck(52);
        for (int i = 0; i<values.length; i++){
            for (int j=0;j<suits.length;j++){
                deck.addCards(new GameCard(values[i], suits[j]));

            }

        }

        return deck;
    }



    public void set_up_game_cards(){
        Deck deck = build_deck();
        play(deck);
    }

    public void set_up_game_names(int num_of_players){
        int cont = 0;
        System.out.println("You have selected " + num_of_players + " Players\nPlease enter your players names.\n");
        while (cont < num_of_players){
            System.out.print("name "+(cont+1)+": ");
            String name = in.nextLine();
            this.players.add(new HumanPlayer(name));
            cont+=1;

        }
        this.players.add(new HumanPlayer("Dealer"));
        set_up_game_cards();

    }



    @Override
    public void play(Deck deck) {
        Random rand = new Random();
        int cont = 0;
        while(cont<2){
            for (HumanPlayer player : players){
                player.setHand(deck.getAndPop(rand.nextInt(deck.getCards().size())));
            }
            cont+=1;
        }
        for (HumanPlayer player : players){
            System.out.println(player.getName() + player.getHand());
        }
    }

    @Override
    public void declareWinner() {

    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StartGame game = new StartGame("Crazy 8s' Game");
        System.out.println("Welcome to "+ game +"\n--------------------------");
        System.out.println("How many players are going to play.\n1.One Player\n2.Two Players\n3.Exit\n---------------------------");
        System.out.print("Enter your choice: ");
        int opt =  in.nextInt();
        switch (opt) {
            case 1:
                game.set_up_game_names(1);
                break;
            case 2:
                game.set_up_game_names(2);

                break;

        }


    }


}