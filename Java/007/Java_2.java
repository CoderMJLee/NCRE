//*********Found**********
import java.__________________.*;
import java.util.Vector;

public class Java_2
{
   public static void main(String args[])
   {
      Vector v=new Vector();
      try
      {
         //*********Found**********
         BufferedReader in = new BufferedReader(new InputStreamReader(___________________));
         String str = "";
         System.out.println("请输入用户和密码信息，中间用空格隔开，输入quit退出:");
         //*********Found**********
         while (!(str.equals("_________________")||str.equals("QUIT")))
         {
            str = in.readLine();
            if(isValid(str))
               v.add(str);
            else 
            {
               if(!(str.equals("quit")||str.equals("QUIT")))
                  System.out.println("The string is NOT valid!");
            }
         }
        
         System.out.println("请输入保存到的文件名:");
         str=in.readLine();

         String curDir = System.getProperty("user.dir");
         File savedfile=new File(curDir+"\\"+   str   );
            
         BufferedWriter out = new BufferedWriter(new FileWriter(savedfile));
         for(int i=0; i<v.size(); i++)
         {
            String tmp=(String)v.elementAt(i);
         //*********Found**********
            out.write(__________________);
            out.write("\n");
         }
         out.close();
        
      }
      catch (Exception e)
      {
         System.out.print("ERROR:"+e.getMessage());	
      }
   }
	
   /**
   * 判定输入的字符串是否符合规范
   * @param  s  输入的待校验的字符串
   * @return    校验的结果，正确则返回为真
   */
   public static boolean isValid(String s)
   {
      if(s.indexOf(" ")>0)
         return true;
      else
         return false;
   }
}
