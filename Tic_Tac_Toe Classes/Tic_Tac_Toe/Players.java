public class Players {
    public String playerName;
    public int playerScore = 0;

    Players(String name){
        this.playerName=name;
    }
    public int updateScore(){
        return this.playerScore+1;
    }
    
}
