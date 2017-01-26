package FindThePair;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;




public class Game {
    private static int GridSize;
    private static int TotalCards;
    private static int CurrentPlayer = 0;
    private static int NoOfPlayers = 0;
    private static Boolean isCardText = true;
    private static String[] GridSelect;
    private static String[] Grid2Text = {"Apple","Grapes","Apple","Grapes"};
    private static String[] Grid4Text = {"Butterfly","Butterfly","Lion","Lion","Cat","Cat","Monkey","Monkey"
                                        ,"Bird","Bird","Elephant","Elephant","Giraffe","Giraffe","Tiger","Tiger"};
    private static String[] Grid6Text = {"Book","Book","Cook","Cook","Stool","Stool","Stew","Stew"
                                         ,"Tape","Tape","Foot","Foot","Bed","Bed","Shirt","Shirt"
                                         ,"Sheet","Sheet","Box","Box","Sock","Sock","Tree","Tree"
                                         ,"Three","Three","Bottle","Bottle","Rope","Rope","Robe","Robe"
                                         ,"Door","Door","Floor","Floor"};
    private String[] GridImage;
    private ArrayList<String> PairCard = new ArrayList<>(2);
    private ArrayList<Integer> PScores = new ArrayList<Integer>();
    private Boolean CardMatch = null;
    private final String path = "/gameimages/";
   
     
    public Game(int NoOfPlayers,int GridSize,Boolean isCardText){
        Game.NoOfPlayers = NoOfPlayers;
        Game.GridSize = GridSize;
        Game.isCardText = isCardText;
        Game.TotalCards = GridSize*GridSize;
        CurrentPlayer = 0;
        PairCard.clear();
        PScores.clear();
    }
    
    public Game(){}
  
    
    public String[] getGridSelect(){
        if (TotalCards==4) {
            if (isCardText){
                GridSelect = Grid2Text;
            }
            else{
                setImagePath("2X2");
                GridSelect = GridImage;
            }
         }
        else if (TotalCards==16) {
            if (isCardText)
                GridSelect = Grid4Text;   
            else{
                setImagePath("4X4");
                GridSelect = GridImage;
            }
        }
        else {
            if (isCardText)
                GridSelect = Grid6Text;
            else{
                setImagePath("6X6");
                GridSelect = GridImage;
            }
        }
       shuffleCards(GridSelect);
       return GridSelect;
    }
    
    public static int getGridSize(){   
       return GridSize;
    }
       
    public static int getNoOfPlayers(){   
         
       return NoOfPlayers;
    }
    
    public static Boolean getIsCardText(){
       return isCardText;
    }
   
    public Boolean getCardMatch() {
      return CardMatch;
    }
    
    public int getCurrentPlayer() {
      return CurrentPlayer;
    }
    
    public ArrayList<String> getPairCard(){
        return PairCard;
    }
    
    public void clearSelection(){
        PairCard.clear();
    }
    
    public void addCardSelect(String cardSelect){
        PairCard.add(cardSelect);
    }

    public ArrayList<String> getCardsSelect() {
        return PairCard;
    }
    //=========SET METHODS============
    public void setCurrentPlayer(){
        CurrentPlayer++;
        if (NoOfPlayers==1)
            CurrentPlayer = 1;
        else if(NoOfPlayers==2&&CurrentPlayer>2)
            CurrentPlayer = 1;
        else if (NoOfPlayers==3&&CurrentPlayer>3)
            CurrentPlayer = 1;
    }
    
    private void setImagePath(String Grid){
        String a;
        GridImage = new String[TotalCards];
        int i = 0;
        int j = 0;
        do{
           j++;
            for(int loop = 1;loop<=2;loop++){
                a =  path + Grid +"/" +j+ ".png";
                GridImage[i] = a;
                i++;
            } 
       }while(i<TotalCards);
    }
    
    public void setPScore(int score){
        PScores.add(score);
    }
    
    public Boolean CheckDraw(){
        if(NoOfPlayers==2){
            if(PScores.get(0)==PScores.get(1))
               return true;
            else
                return false;
        }
         else if (NoOfPlayers==3){
              if( PScores.get(0)==PScores.get(1)&&PScores.get(1)==PScores.get(2))
               return true;
              else
                  return false;
        }
           return false;
    }
    
    public int CheckWinner(int i){
       Collections.sort(PScores ,Collections.reverseOrder());
       return PScores.get(i).intValue();       
    }
        
    public Boolean CheckCard(){
        CardMatch = null;
            String card1  = PairCard.get(0);
            String card2  = PairCard.get(1);
            if (card1.equals(card2))
                return CardMatch =  true;
            else 
                return CardMatch =  false;
    }
 
    private void shuffleCards(String[] Cards){
        Random r = new Random();
        for (String Card : Cards) {
            int c1 = r.nextInt(Cards.length);
            int c2 = r.nextInt(Cards.length);
            String temp = Cards[c1];
            Cards[c1] = Cards[c2];
            Cards[c2] = temp;
        }
    }

    public String ShowCurrentPlayer(){
        return "Player " +Integer.toString(CurrentPlayer);
    }
    
}
