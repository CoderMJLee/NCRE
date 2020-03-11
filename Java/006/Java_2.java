import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Java_2{
   public static void main(String args[]) {
     args=new String[]{"a.txt","b.txt"};
      if(args.length<2)
      {
         System.out.println("ERROR: need parameters.");    
         System.out.println("\n -usage: java <classname> <file1> <file2>");    
         System.exit(0);
      }
      File f1=new File(args[0]);
      //*********Found**********
      File f2=new File(_____________________);
      try {
         //*********Found**********
         FileReader fr=new FileReader(______________________);
         FileWriter fw=new FileWriter(f1,true);
         int b;
         //*********Found**********
         while(( b=fr.read() ) != -1 )  fw.write(_____________________);
         fr.close();
         fw.close();
      }
      catch(IOException e)
      {
         e.printStackTrace();
      }
      System.out.println("has done!");
      //*********Found**********
      if(f2.delete()) System.out.print("___________");
   }
}




