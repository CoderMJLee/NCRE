import javax.swing.*;
import java.awt.*;
public class Java_3{
   static final int WIDTH=300;
   static final int HEIGHT=200;
   public static void main(String[] args){
      //*********Found**********
      JFrame jf=_______________();
      jf.setSize(WIDTH,HEIGHT);
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //*********Found**********
      jf._________ ("股票分析系统");
      Toolkit kit=Toolkit.getDefaultToolkit();
      Dimension screenSize=kit.getScreenSize();
      int width=screenSize.width;
      int height=screenSize.height;
      int x=(width-WIDTH)/2;
      int y=(height-HEIGHT)/2;
      jf.setLocation (x,y);
      //*********Found**********
      _________.setVisible(true);
   }
}








