class Sample {

    int a;
    float b;

    // get
    public int getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    // set
    public void set(int a, float b) {
        this.a = a;
        this.b = b;
    }

    // constructor
    Sample() {
        a = 14;
        b = 12.68f;
    }

    // display method
    void display() {
        System.out.println("Value of A is " + a);
        System.out.println("Value of B is " + b);
    }
}

public class BT20CSE212_Sample {
    public static void main(String[] args) {
        Sample test1 = new Sample();
        test1.display();

        Sample test2 = test1;
        test2.a = 100;
        test2.b = 19.674f;
        test2.display();

    }
}