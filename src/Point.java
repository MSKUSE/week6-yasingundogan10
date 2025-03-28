public class Point {

    protected int xCoord, yCoord;

    public Point(){}

    public Point(int x , int y){
        this.xCoord = x;
        this.yCoord = y;
    }

    public Point(int xy){
        this.xCoord = xy;
        this.yCoord = xy;
    }

    @Override
    public String toString() {  //classın ene altına yazılır.

        return "Point{" +
                "xCoord=" + xCoord +
                ", yCoord=" + yCoord +
                '}';
    }
}
