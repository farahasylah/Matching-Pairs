package FindThePair;

    public class Player extends Game{
        private int CardsCollects  = 0;
        private int Ranking = 0;
        
        public Player(){
        CardsCollects  = 0;
        Ranking = 0;
        }
      
        public int getCardsCollects (){
            return CardsCollects;
        }
 
        public void setCardsCollect () {
            CardsCollects+=2;
        }
        
        public int getRanking (){
            return Ranking;
        }
 
        public void setRanking (int Rank) {
            Ranking = Rank;
        }
  
}
