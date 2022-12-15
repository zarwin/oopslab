// Java code for using this() to
// invoke current class constructor
class Test2 {
    int a;
    int b;

    // Default constructor
    Test2() {
        this(10, 20);
        System.out.println("Inside default constructor \n");
    }

    // Parameterized constructor
    Test2(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Inside parameterized constructor");
    }

    public static void main(String[] args) {
        Test2 object = new Test2();
    }
}
