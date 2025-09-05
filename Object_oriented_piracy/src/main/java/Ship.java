public class Ship {

    private double draft;
    private int crew;

    public Ship(double draft, int crew) {
        this.draft = draft;
        this.crew = crew;
    }

    public boolean isWorthIt(){
        double total_crew_weight = crew*1.5;
        if (draft > total_crew_weight + 20 ){
            return true;
        }
        return false;
    }

}
