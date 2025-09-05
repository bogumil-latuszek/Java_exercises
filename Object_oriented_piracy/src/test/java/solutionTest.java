import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class solutionTest {

    @Test
    public void shipShouldBeWorthLooting(){
        Ship rich_ship = new Ship(36.0,10);
        assertEquals(true, rich_ship.isWorthIt());
    }

    @Test
    public void shipShouldBeNOTWorthLooting(){
        Ship poor_ship = new Ship(8.0,2);
        assertEquals(false, poor_ship.isWorthIt());
    }
}
