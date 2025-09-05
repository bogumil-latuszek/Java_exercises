import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class solutionTest {

    @Test
    public void shipShouldBeWorthLooting(){
        Ship rich_ship = new Ship(36.0,10);
        assertTrue(rich_ship.isWorthIt());
    }

    @Test
    public void oneHoundredRichShipsShouldAllBeWorthLooting(){
        for (int i = 0; i < 100; i++) {
            Double seed_for_crew = (Math.random()*300);
            Double seed_for_draft = (Math.random()*500);
            int crew = seed_for_crew.intValue();
            Double crew_weight = crew *1.5;
            Double draft = seed_for_draft;
            if (draft <= crew_weight+20){
                draft = crew_weight +21;
            }
            Ship random_rich_ship = new Ship(draft,crew);
            assertTrue(random_rich_ship.isWorthIt());
        }
    }

    public void oneHoundredPoorShipsShouldAllBeNOTWorthLooting(){
        for (int i = 0; i < 100; i++) {
            Double seed_for_crew = (Math.random()*300);
            Double seed_for_draft = (Math.random()*300);
            int crew = seed_for_crew.intValue();
            Double crew_weight = crew *1.5;
            Double draft = seed_for_draft;
            if (draft > crew_weight+20){
                draft = crew_weight;
            }
            Ship random_poor_ship = new Ship(draft,crew);
            assertFalse(random_poor_ship.isWorthIt());
        }
    }

    @Test
    public void shipShouldBeNOTWorthLooting(){
        Ship poor_ship = new Ship(8.0,2);
        assertFalse(poor_ship.isWorthIt());
    }
}
