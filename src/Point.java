public class Point {
    private int x;
    private int y;
    public Point(){
        System.out.println("no agrs constructor");
    }
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(){
        return Math.sqrt((0-this.getX())*(0-this.getX())+(0-this.getY())*(0-this.getY()));
    }
    public double distance(int x,int y){
        return Math.sqrt((x-this.getX())*(y-this.getX())+(x-this.getY())*(y-this.getY()));
    }
    public double distance(Point p){
        return Math.sqrt((p.getX()-this.getX())*(p.getX()-this.getX())+(p.getY()-this.getY())*(p.getY()-this.getY()));
    }
}
