/*Implement a class SodaCan with methods getSurfaceArea() and get­­
Volume() . In the constructor, supply the height and radius of the can.*/

public class P8_05 {
    private double height;
    private double radius;

    public P8_05(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public double getSurface() {
        return 2 * Math.PI * this.radius * this.radius + 2 * Math.PI * this.radius * this.height;
    }

    public double getVolume() {
        return Math.PI * this.radius * this.radius * 2 * this.height;
    }
}
