import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//*********Found**********
public class Java_3 __________________ WindowAdapter implements ActionListener
{
   private JFrame frame;
   private JTextField name;
   private JPasswordField pass;
   private JLabel nameLabel;
   private JLabel passLabel;
   private JPanel textPanel;
   private JPanel labelPanel;
   private JButton button;
   private JTextArea textArea;
	
   public void initGUI()
   {
      frame=new JFrame("Frame with Dialog");
      frame.addWindowListener(this);
      button=new JButton("JDialog");
  //*********Found**********
      button._______________(this);
      textArea=new JTextArea("",3,10);
		
      frame.getContentPane().add(textArea,BorderLayout.CENTER);
      frame.getContentPane().add(button,BorderLayout.NORTH);
		
      frame.setSize(400,300);
      frame.setVisible(true);
		
   }
	
   public void actionPerformed(ActionEvent e)
   {
      final JDialog dia=new JDialog(frame,"login information");
      JButton ok=new JButton("ok");
      ok.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            textArea.setText("");
            textArea.append("name:"+name.getText()+"\r\n");
            textArea.append("passWord:"+new String(pass.getPassword())+"\r\n");
            //*********Found**********   
            dia.setVisible(________________);    
         }
      });
		
      name=new JTextField("",10);
      pass=new JPasswordField("",10);	
      pass.setEchoChar('*');
      textPanel=new JPanel();
      textPanel.setLayout(new GridLayout(2,1,10,10));
      textPanel.add(name);
      textPanel.add(pass);
		
      nameLabel=new JLabel("name");
      passLabel=new JLabel("passWord");
      labelPanel=new JPanel();
      labelPanel.setLayout(new GridLayout(2,1,20,20));
      labelPanel.add(nameLabel);
      labelPanel.add(passLabel);
		
      dia.getContentPane().add(labelPanel,BorderLayout.WEST);
      dia.getContentPane().add(textPanel,BorderLayout.CENTER);		
      dia.getContentPane().add(ok,BorderLayout.SOUTH);
      dia.setSize(200,130);
      dia.setVisible(true);
   }
	
   public void windowClosing(WindowEvent event)
   {
      frame.setVisible(false);
      System.exit(0);
   }
	
   public static void main(String args[])
   {
      Java_3 example=new Java_3();
   //*********Found**********
      example.____________;
   }
}













