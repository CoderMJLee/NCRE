import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Java_3 {
    public static void main(String[ ] args) {
        JFrame frame = new JFrame("Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //*********Found**********
        frame.getContentPane().___________(new Change());

        frame.pack();
        //*********Found**********
        frame.setVisible(___________);
    }
}

class Change extends JPanel{

    int count = 200;
    JLabel l1;
    JButton b1, b2;

    public Change() {
        setPreferredSize(new Dimension(280, 60));
        l1 = new JLabel("200");
        b1 = new JButton("Ôö´ó");
        b2 = new JButton("¼õÐ¡");
        add(l1);
        add(b1);
        add(b2);
        b1.addActionListener(new BListener1());
        //*********Found**********
        b2.addActionListener(new ___________());
    }

    private class BListener1 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            count++;
            l1.setText("" + count);
        }
    }
    private class BListener2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            //*********Found**********
            count _________;
            l1.setText("" + count);
        }
    }
}
