//*********Found**********
import javax.___________________.*;
import java.awt.event.*;
import java.awt.*;

//*********Found**********
public class Java_3 extends MouseAdapter implements _____________________
{
   //*********Found**********
   private __________________ pop;
   private JMenu subPop;
   private JMenuItem color;
   private JMenuItem exit;
   private JMenuItem red;
   private JMenuItem blue;
   private JTextArea textArea;
   private JFrame frame;

   public void initGUI()
   {
      pop=new JPopupMenu();
   
      subPop=new JMenu("color");
      red=new JMenuItem("red");
      red.addActionListener(this);
      blue=new JMenuItem("blue");
      blue.addActionListener(this);
      subPop.add(red);
      subPop.add(blue);

      exit=new JMenuItem("exit");
      exit.addActionListener(this);

      pop.add(subPop);
      pop.add(exit);
		
      //*********Found**********  
      frame=new JFrame("____________________");
      textArea=new JTextArea("",10,10);
	
      textArea.addMouseListener(this);
      frame.getContentPane().add(textArea);
      frame.setSize(300,300);
      frame.setVisible(true);
	
      frame.addWindowListener(new WindowAdapter()
      {
         //*********Found**********  
         public void windowClosing(_____________________ e)
         {
            System.exit(0);
         }
      });
   }
	
   public void actionPerformed(ActionEvent event)
   {
      if(event.getSource()==red)
      {
         textArea.setForeground(Color.red);
         textArea.setText("red menu is selected");
      }
      else if(event.getSource()==blue)
      {
         textArea.setForeground(Color.blue);
         textArea.setText("blue menu is selected");
      }
      else if(event.getSource()==exit)
      {
         frame.setVisible(false);
         System.exit(0);
      }
   }

   public void mousePressed(MouseEvent e)
   {
      if(e.getModifiers()==e.BUTTON3_MASK)
      {
         pop.show(e.getComponent(),e.getX(),e.getY());
      }
   }
	
   public static void main(String args[])
   {
      Java_3 example=new Java_3();
      example.initGUI();
   } 
}





























