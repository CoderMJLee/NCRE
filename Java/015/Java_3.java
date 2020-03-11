import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Java_3{
   public static void main(String[] args){
      MulticastFrame frame = new MulticastFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.show();
   }
}

class MulticastFrame extends JFrame{
   public MulticastFrame(){
      setTitle("MulticastTest");
      setSize(WIDTH, HEIGHT);
      MulticastPanel panel = new MulticastPanel();
      Container contentPane = getContentPane();
      //*********Found**********
      contentPane.add(_________________);
   }
   public static final int WIDTH = 300;
   public static final int HEIGHT = 200;  
}

class MulticastPanel extends JPanel{
   public MulticastPanel(){
      JButton newButton = new JButton("New");
      add(newButton);
      ActionListener newListener = new ActionListener(){
         public void actionPerformed(ActionEvent event){
            makeNewFrame();
         }
      };
      newButton.addActionListener(newListener);
      closeAllButton = new JButton("Close all");
      add(closeAllButton);
   }
   private void makeNewFrame(){
      final BlankFrame frame = new BlankFrame();
      frame.show();
      ActionListener closeAllListener = new ActionListener(){
         public void actionPerformed(ActionEvent event){
            //*********Found**********
            frame.___________________();     //使窗口隐藏或消除
         }
      };
      //*********Found**********
      closeAllButton.addActionListener(__________________________________);
   }
   private JButton closeAllButton;
}

class BlankFrame extends JFrame{
   public BlankFrame(){
      //*********Found**********
      ______________ ++ ;
      setTitle("Frame " + counter);
      setSize(WIDTH, HEIGHT);
      setLocation(SPACING * counter, SPACING * counter);     
   }
   public static final int WIDTH = 200;
   public static final int HEIGHT = 150;  
   public static final int SPACING = 30;
   private static int counter = 0;
}
