import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.awt.*;

public class Java_3 implements ActionListener
{
   private JFrame frame;
   private JButton button;
   private JButton saveButton;
   private JTextArea textArea;
   private JFileChooser dia;
   private JPanel buttonPanel;

   public void initGUI()
   {
      //*********Found**********
      frame=new JFrame("_____________________");

      button=new JButton("open file");
      button.setActionCommand("open");
      //*********Found**********
      button.addActionListener(___________);
      saveButton=new JButton("save file");
      saveButton.setActionCommand("save");
      //*********Found**********
      saveButton.addActionListener(___________);

      textArea=new JTextArea("",10,10);
      buttonPanel=new JPanel();
      dia=new JFileChooser();
      frame.addWindowListener(new WindowAdapter()
      {
         public void windowClosing(WindowEvent e)
         {
            System.exit(0);
         }
      });
      buttonPanel.add(button);
      buttonPanel.add(saveButton);
      frame.getContentPane().add(buttonPanel,BorderLayout.NORTH);
      frame.getContentPane().add(textArea,BorderLayout.CENTER);
      frame.setSize(300,300);
      //*********Found**********
      frame.setVisible(___________);
   }
	
   //*********Found**********
   public void actionPerformed(ActionEvent ___________)
   {
      if(event.getActionCommand().equals("open"))
      {
         dia.showOpenDialog( frame );
         dia.setVisible(true);	
         File file=dia.getSelectedFile();
         String fileName=file.getAbsolutePath();
         textArea.append("path of selected file: "+fileName+"\r\n");						
      }
      else if(event.getActionCommand().equals("save"))
      {
         dia.showSaveDialog(frame);
         dia.setVisible(true);
         File file=dia.getSelectedFile();
         String fileName=file.getAbsolutePath();
         textArea.append("path of saved file: "+fileName+"\r\n");			
      }
   }
	
   public static void main(String args[])
   {
      Java_3 example=new Java_3();
      example.initGUI();
   }
}
