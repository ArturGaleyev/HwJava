package HwClass25;

import java.util.Arrays;
import java.util.LinkedList;

public class Card {
    private double interestRate;
    private String cardType;
    public Card(double interestRate, String cardType){
        this.interestRate = interestRate;
        this.cardType = cardType;
    }
    public double getInterestRate(){
        return interestRate;
    }
    public String getCardType(){
        return cardType;
    }
}
class CardTester {
    public static void main(String[] args) {
        LinkedList<Card> cards = new LinkedList<>();
        cards.addAll(Arrays.asList(new Card(3.3,"SilverCard"),
                new Card(2.8,"PlatinumCard"),
                new Card(5.3,"GoldCard")));
        for(Card card:cards){
            System.out.println(card.getCardType()+" "+card.getInterestRate());
        }
    }
}

