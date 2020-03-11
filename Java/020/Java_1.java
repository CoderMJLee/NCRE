class MethodOverloading {

    void receive(int i) {
        System.out.println("Receive one int data");
        System.out.println("i=" + i);
    }

    //*********Found**********
    void receive(_________ x, _________ y) {
        System.out.println("Receive two int data");
        System.out.println("x=" + x + "  y =" + y);
    }
    //*********Found**********
    void receive(double _________) {
        System.out.println("Receive one double data");
        System.out.println("d=" + d);
    }

    //*********Found**********
    void receive(String _________ ) {
        System.out.println("Receive a string");
        System.out.println("s=" + s);
    }
}

public class Java_1 {

    public static void main(String args[]) {
        MethodOverloading mo = new MethodOverloading();
        mo.receive(1);
        mo.receive(2, 3);
        mo.receive(12.56);
        mo.receive("very interesting, is not it?");
    }
}
