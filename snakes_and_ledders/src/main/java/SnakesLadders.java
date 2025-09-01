import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class SnakesLadders {
    private LoopingArray<Player> players;
    private SnakesAndLadders snakesAndLadders;
    private boolean game_over;

    private void initializePlayers(int number_of_players){
        players = new LoopingArray<Player>(Player[].class, number_of_players);
        for (int i = 0; i < number_of_players; i++) {
            Player player = new Player();
            players.put(i,player);
        }
    }

    public SnakesLadders() {
        game_over = false;
        initializePlayers(2);
        snakesAndLadders = new SnakesAndLadders();
    }

    private int choose_player(int die1, int die2){
        if (die1 == die2){
            return  players.nextNoLooping();
        }
        return  players.next();
    }
    private int correctPositionIfInSnakesAndLadders(int target_position){
        int corrected_position = target_position;
        if(snakesAndLadders.containsKey(target_position)){
            corrected_position = snakesAndLadders.get(target_position);
        }
        return  corrected_position;
    }
    private int correctPositionIfOverflow(int target_position){
        if(target_position>100){
            int overflow = target_position%100;
            return  100-overflow;
        }
        return  target_position;
    }
    public String play(int die1, int die2) {
        if (game_over){
            return "Game over!";
        }
        int player_number = choose_player(die1, die2);
        Player active_player = players.get(player_number);
        int target_position = active_player.getPosition() + die1 + die2;
        int target_position_no_overflow = correctPositionIfOverflow(target_position);
        int final_position = correctPositionIfInSnakesAndLadders(target_position_no_overflow);
        active_player.setPosition(final_position);
        if (final_position == 100){
            game_over = true;
            return "Player "+(player_number+1)+" Wins!";
        }
        return "Player "+(player_number +1)+" is on square "+final_position;
    }
}