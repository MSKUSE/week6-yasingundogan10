public class Triangle extends  Shape {

    public Triangle(Point location, int sideA, int sideB, int sideC, int height) {
        super(location);
        this.sideA = sideA;
        this.sideB = sideB;
        this.baseSide = sideC;
        this.height = height;

    private int sideA , sideB ,baseSide , height;

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return baseSide;
    }

    public int getHeight() {
        return height;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public void setSideC(int sideC) {
        this.baseSide = sideC;
    }

    public void setHeight(int height) {
        this.height = height;
    }



    public void setSideA(double sideA) {
        if (sideA < 0){
            this.sideA = 0;
            throw new IllegalArgumentException("Side can't be negative.");
        }
        else {
            this.sideA = sideA;
        }

    }

    public void setSideB(double sideB) {
        if (sideB < 0) {
            this.sideB = 0;
            System.out.println("Side B can't be negative!!");
        } else {
            this.sideB = sideB;
        }


        @Override
        public int perimeter(){
            return sideA + sideB + baseSide;
        }

        @Override
        public double area(){
                return (baseSide * height) / 2 ;





    }
}


    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", baseSide=" + baseSide +
                ", height=" + height +
                '}';
    }