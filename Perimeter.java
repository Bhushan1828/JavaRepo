public class Perimeter {

    public double calculate(double s) {
        return 4 * s;
    }

    
    public double calculate(double l, double b) {
        return 2 * (l + b);
    }

    public double calculateCircle(double r) {

        return 2 * (22.0 / 7) * r;
    }

    public static void main(String[] args) {
        Perimeter p = new Perimeter();
        
        System.out.println("Perimeter of Square: " + p.calculate(5));           
        System.out.println("Perimeter of Rectangle: " + p.calculate(4, 6));    
        System.out.println("Perimeter of Circle: " + p.calculateCircle(7)); 
    }
}
