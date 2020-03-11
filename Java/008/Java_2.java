//*********Found**********
import javax.________________.*;
public class Java_2{
   public static void main( String args[] ){
      int frequency1 = 0, frequency2 = 0,
          frequency3 = 0, frequency4 = 0,
          frequency5 = 0, frequency6 = 0, face; 
      //骰子旋转500次的代码
      for ( int roll = 1; roll <= 500; roll++ ) {
         face = 1 + (int) ( Math.random() * 6 );
//*********Found**********
         switch ( __________________ ) {
            case 1:
               ++frequency1;
               break;
            case 2:
               ++frequency2;
               break;
            case 3:
               ++frequency3;
               break;
            case 4:
               ++frequency4;
               break;
            case 5:
               ++frequency5;
               break;
            case 6:
               ++frequency6;
               break;
         }
      }
//*********Found**********
      JTextArea outputArea = _____________________ JTextArea( 7, 10 );
      outputArea.setText(
         "面\t频率" +
         "\n1\t" + frequency1 +
         "\n2\t" + frequency2 +
         "\n3\t" + frequency3 +
         "\n4\t" + frequency4 +
         "\n5\t" + frequency5 +
         "\n6\t" + frequency6 );
//*********Found**********
      JOptionPane.showMessageDialog( null, ___________________,
         "骰子旋转500次",
         JOptionPane.INFORMATION_MESSAGE );
//*********Found**********
      System.____________________( 0 );
   }
}