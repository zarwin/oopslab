// Not supported in Java but can implement through Interface
interface Printable {
    void print();
}

interface Showable {
    void show();
}

class multiple implements Printable, Showable {
    public void print() {
        System.out.println("Hello");
    }

    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String args[]) {
        multiple obj = new multiple();
        obj.print();
        obj.show();
    }
}