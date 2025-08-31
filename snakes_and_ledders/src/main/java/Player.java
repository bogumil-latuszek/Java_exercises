public class Player {
    private int position;

    public Player() {
        this.position = 0;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        if(position>100){
            int overflow = position%100;
            this.position = 100-overflow;
        }
        else{
            this.position = position;
        }
    }
}
