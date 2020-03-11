import java.awt.*;
import java.awt.event.*;
//*********Found**********
import javax._____________.*;

public class Java_3 {

    public static void main(String[ ] args) {
        JFrame frame = new JFrame("Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //*********Found**********
        frame.___________________().add(new Change());

        frame.pack();
        frame.setVisible(true);
    }
}

class Change extends JPanel {

    int count = 200;
    JLabel l1;
    JButton b1, b2;

    public Change( ) {
        setPreferredSize(new Dimension(280, 60));
        l1 = new JLabel("200");
        b1 = new JButton("Ôö´ó");
        b2 = new JButton("¼õÐ¡");
        add(l1);
        //*********Found**********
        add_____________;
        //*********Found**********
        add_____________;
        b1.addActionListener( new BListener( ) );
        b2.addActionListener( new BListener( ) );
    }

    //*********Found**********
    private class  _____________ implements ActionListener {

        //*********Found**********
        public void  _____________(ActionEvent e) {
            if (e.getSource( ) == b1) {
                count++;
            } else {
                count--;
            }
            l1.setText("" + count);
        }
    }
}
