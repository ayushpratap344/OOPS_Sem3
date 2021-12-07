abstract class Shape {
    double area, peri;

    public Shape() {
    }

    abstract void output_area();

    abstract void output_perimeter();
}

class ShapeRectangle extends Shape {
    double width, height;
    double temp1, temp2;

    void input_data() {
        temp1 = width;
        temp2 = height;
    }

    ShapeRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void output_area() {
        area = width * height;
        System.out.println("Area of Rectangle : " + String.valueOf(area));
    }

    public void output_perimeter() {
        peri = 2 * (width + height);
        System.out.println("Perimeter of Rectangle : " + String.valueOf(peri));
    }
}

class ShapeTriangle extends Shape {
    double side1, side2, side3;
    double temp3, temp4, temp5;

    void input_data() {
        temp3 = side1;
        temp4 = side2;
        temp5 = side3;
    }

    ShapeTriangle(double side1, double side2, double side3) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void output_area() {
        double semi_peri = 0.5 * (side1 + side2 + side3);
        area = Math.sqrt(semi_peri * (semi_peri - side1) * (semi_peri - side2) * (semi_peri - side3));
        System.out.println("Area of Tringle : " + String.valueOf(area));
    }

    public void output_perimeter() {
        peri = side3 + side2 + side1;
        System.out.println("Perimeter of Tringle : " + String.valueOf(peri));
    }
}

public class BT20CSE212_Shape {
    public static void main(String[] args) {

        ShapeTriangle tri_temp = new ShapeTriangle(11, 10, 9);
        ShapeRectangle rect_temp = new ShapeRectangle(54, 26);

        tri_temp.output_area();
        tri_temp.output_perimeter();

        rect_temp.output_area();
        rect_temp.output_perimeter();
    }
}