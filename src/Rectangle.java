public class Rectangle extends Shape {

    private Point topLeft;
    private int sideA , sideB;

    public static int counter = 0;
    public int counterForObject = 0;

    public Rectangle(Point topLeft, int sideA, int sideB) {
        super(topLeft);
        this.topLeft = topLeft;
        setSideA(sideA);
        setSideB(sideB);
        counter ++;
        counterForObject++ ;
    }

    public Rectangle(Point topLeft, int sideA) {
        super(topLeft);
        this.topLeft = topLeft;
        setSideA(sideA);
        setSideB(sideA);
        counter ++;
        counterForObject++ ;

    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA < 0){
            this.sideA = 0;
            throw new IllegalArgumentException("Side can't be negative.");
        }
        else {
            this.sideA = sideA;
        }
    }

    public int getSideB() {
        return sideB;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "topLeft=" + topLeft +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                ", counterForObject=" + counterForObject +
                '}';
    }

    public void setSideB(int sideB) {
        if (sideB < 0) {
            this.sideB = 0;
            System.out.println("Side B can't be negative!!");
        } else {
            this.sideB = sideB;
        }



    }
    @Override
    public int perimeter(){
        return 2 * (sideA + sideB);
    }

    @Override
    public double area(){
        return sideA * sideB;
    }
}
