package period5project1;

/**
 *
 * @author Tahir
 */
public class Card { 
    String suit;
    String value;
    
    public Card(){
        this.suit = "JOKER";
        this.value = "NO SUIT";
    }
    
    public Card(String suit, String value){
        this.suit = suit;
        this.value = value;
    }
    
    public static void main(String[] args){
        Card c1 = new Card();
        System.out.println(c1.suit);
        System.out.println(c1.value);
   
        Card c2= new Card("clubs", "2");
        System.out.println(c2.suit);
        System.out.println(c2.value);
        
        Card c3= new Card("hearts", "K");
        System.out.println(c3.suit);
        System.out.println(c3.value);
        
        Card c4= new Card("spades", "A");
        System.out.println(c4.suit);
        System.out.println(c4.value);
         
        Card c5= new Card("squares", "394839489348394839483948");
        System.out.println(c5.suit);
        System.out.println(c5.value);
        

    
    }
}

 