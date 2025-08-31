import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class SnakesLadders {
    private LoopingArray<Player> players;
    private Map<Integer, Integer> snakes_and_ladders;
    private boolean game_over;

    public SnakesLadders() {
        game_over = false;
        players = new LoopingArray<Player>(Player[].class, 2);
        Player player1 = new Player();
        Player player2 = new Player();
        players.put(0,player1);
        players.put(1,player2);
        snakes_and_ladders = new HashMap<Integer,Integer>();
        //ladders
        snakes_and_ladders.put(2,38);
        snakes_and_ladders.put(7,14);
        snakes_and_ladders.put(8,31);
        snakes_and_ladders.put(15,26);
        snakes_and_ladders.put(21,42);
        snakes_and_ladders.put(28,84);
        snakes_and_ladders.put(36,44);
        snakes_and_ladders.put(51,67);
        snakes_and_ladders.put(78,98);
        snakes_and_ladders.put(71,91);
        snakes_and_ladders.put(87,94);
        //snakes
        snakes_and_ladders.put(99,80);
        snakes_and_ladders.put(95,75);
        snakes_and_ladders.put(92,88);
        snakes_and_ladders.put(89,68);
        snakes_and_ladders.put(74,53);
        snakes_and_ladders.put(64,60);
        snakes_and_ladders.put(62,19);
        snakes_and_ladders.put(46,25);
        snakes_and_ladders.put(49,11);
        snakes_and_ladders.put(16,6);




    }

    public String play(int die1, int die2) {
        if (game_over){
            return "Game over!";
        }
        if (die1 == die2){
            int player_number = players.nextNoLooping();
            Player active_player = players.get(player_number);
            int target_position = active_player.getPosition() + die1 + die2;
            if(snakes_and_ladders.containsKey(target_position)){
                target_position = snakes_and_ladders.get(target_position);
            }
            active_player.setPosition(target_position);
            int new_position = active_player.getPosition();
            if(snakes_and_ladders.containsKey(new_position)){
                new_position = snakes_and_ladders.get(new_position);
            }
            active_player.setPosition(new_position);
            if (new_position == 100){
                game_over = true;
                return "Player "+(player_number+1)+" Wins!";
            }
            return "Player "+(player_number +1)+" is on square "+new_position;
        }
        else{
            int player_number = players.next();
            Player active_player = players.get(player_number);
            int target_position = active_player.getPosition() + die1 + die2;
            if(snakes_and_ladders.containsKey(target_position)){
                target_position = snakes_and_ladders.get(target_position);
            }
            active_player.setPosition(target_position);
            int new_position = active_player.getPosition();
            if(snakes_and_ladders.containsKey(new_position)){
                new_position = snakes_and_ladders.get(new_position);
            }
            active_player.setPosition(new_position);
            if (new_position == 100){
                game_over = true;
                return "Player "+(player_number+1)+" Wins!";
            }
            return "Player "+(player_number +1)+" is on square "+new_position;
        }
    }
}