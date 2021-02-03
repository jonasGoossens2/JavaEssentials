package Oefening1;

public class Punt {
    private int x;
    private int y;

    public static final int MAXIMUMGROOTTE = 99;

    public Punt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
        controleer();
    }

    public void setY(int y) {
        this.y = y;
        controleer();
    }

    public double berekenAfstand(Punt punt){
        // x1, y1 => this.x this.Y
        // x2, y2 => punt.x punt.y

        double afstand = Math.sqrt(Math.pow(this.x - punt.x, 2) + Math.pow(this.y - punt.y, 2));
        return afstand;
    }
    private void controleer(){
        if(this.x < 0){
            this.x = 0;
        }
        if(this.y < 0){
            this.y = 0;
        }
        if(this.x > MAXIMUMGROOTTE){
            this.x = MAXIMUMGROOTTE;
        }
        if(this.y > MAXIMUMGROOTTE){
            this.y = MAXIMUMGROOTTE;
        }
    }

    public void drukAf(){
        System.out.printf("x = %d, y = %d%n", x,y);
    }
}
