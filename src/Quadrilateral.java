class Quadrilateral extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;

    public Quadrilateral(double sideA, double sideB, double sideC, double sideD) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }

    public String getShapeName() {
        return "Quadrilateral";
    }
}