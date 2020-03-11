public class Java_2 {
    public static void main(String[ ] args) {
        Point pt;
        //*********Found**********
        pt = _____________ Point(2, 3);
        System.out.println(pt);
    }
}

class Point {

    //*********Found**********
    private _____________;
    private int y;

    //*********Found**********
    public _____________ (int a, int b) {
        x = a;
        y = b;
    }

    int getX( ) {
        return x;
    }

    int getY( ) {
        return y;
    }

    void setX(int a) {
        x = a;
    }

    void setY(int b) {
        y = b;
    }

    //*********Found**********
    public String _____________ ( ) {
        return "( " + x + "," + y + " ) ";
    }
}
