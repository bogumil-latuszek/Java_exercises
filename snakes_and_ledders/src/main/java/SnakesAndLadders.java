import java.util.HashMap;
import java.util.Map;

public class SnakesAndLadders {
    private Map<Integer, Integer> snakes_and_ladders;

    public SnakesAndLadders() {
        snakes_and_ladders = new HashMap<Integer,Integer>();
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
    }

    public int get(int key){
        return snakes_and_ladders.get(key);
    }
    public boolean containsKey(int key){
        return snakes_and_ladders.containsKey(key);
    }

}
