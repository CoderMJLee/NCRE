import java.awt.event.*;
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import javax.swing.*;

public class Java_3
{
   public static void main(String[] args)
   {
      FontFrame frame = new FontFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}

//*********Found**********
class FontFrame extends ________________
{
   public FontFrame()
   {
      setTitle("北京 2008");
      setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
      FontPanel panel = new FontPanel();
      Container contentPane = getContentPane();
      //*********Found**********
      contentPane.add(_____________________);
   }
   public static final int DEFAULT_WIDTH = 400;
   public static final int DEFAULT_HEIGHT = 250;
}

class FontPanel extends JPanel
{
   public FontPanel()
   {
      JButton yellowButton = new JButton("Yellow");
      JButton blueButton = new JButton("Blue");
      JButton redButton = new JButton("Green");
      add(yellowButton);
      add(blueButton);
      add(redButton);
      ColorAction yellowAction = new ColorAction(Color.YELLOW);
      ColorAction blueAction = new ColorAction(Color.BLUE);
      ColorAction greenAction = new ColorAction(Color.GREEN);
      yellowButton.addActionListener(yellowAction);
      blueButton.addActionListener(blueAction);
      redButton.addActionListener(greenAction);
   }
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      Graphics2D g2 = (Graphics2D)g;
      String message = "同一个世界，同一个梦想！";
      Font f = new Font("隶书", Font.BOLD, 27);
      g2.setFont(f);
      FontRenderContext context = g2.getFontRenderContext();
      Rectangle2D bounds = f.getStringBounds(message, context);
      double x = (getWidth() - bounds.getWidth()) / 2;
      double y = (getHeight() - bounds.getHeight()) / 2;
      double ascent = -bounds.getY();
      double baseY = y + ascent;
      g2.setPaint(Color.RED);
      g2.drawString (message, (int)x, (int)(baseY));
   }
   //*********Found**********
   private class ColorAction ____________________ ActionListener
   {
      public ColorAction(Color c)
      {
         BackgroundColor = c;
      }
      //*********Found**********
      public void _____________________ (ActionEvent event)
      {
         setBackground(BackgroundColor);
      }
      private Color BackgroundColor;
   }
}
