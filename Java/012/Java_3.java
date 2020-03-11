import java.awt.*;
import javax.swing.*;
public class Java_3{
   public static void main(String[] args){
      BeijingFrame frame = new BeijingFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.show();
   }
}
//*********Found*********
class  _________________   extends JFrame{
   public BeijingFrame(){
      setTitle("Welcome to Beijing");
      Container contentPane = getContentPane();
      BeijingPanel panel = new BeijingPanel();
      contentPane.add(panel);
      pack();
   }
}
class BeijingPanel extends JPanel{
   public BeijingPanel(){
      //*********Found*********
      setLayout(new  _______________  );
      ImageIcon icon = new ImageIcon("tiantan.jpg");
      //*********Found*********
      jLC = new JLabel( _______________ );
      add(jLC, BorderLayout.CENTER);
      lpanel = new JPanel();
      jLS = new JLabel("The Temple of Heaven");
      lpanel.add(jLS);
      add(lpanel, BorderLayout.SOUTH);
   }
   private JLabel jLC;
   private JLabel jLS;
   private JPanel panel;
   private JPanel lpanel;
}
