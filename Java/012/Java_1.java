//*********Found**********
import javax.________________.JOptionPane;

public class Java_1{
   public static void main( String args[] ){
      String s1, s2, s3, s4, output;
      s1 = new String( "hello" );
      s2 = new String( "good bye" );
      s3 = new String( "Happy Birthday" );
      s4 = new String( "happy birthday" );
      output = "s1 = " + s1 + "\ns2 = " + s2 +
               "\ns3 = " + s3 + "\ns4 = " + s4 + "\n\n";
      //测试字符串相等
      if ( s1.equals( "hello" ) )
         //*********Found**********
         output = output + "_________________________";
      else
         output = output + "s1 does not equal \"hello\"\n"; 
      //用==测试相等
      if ( s1 == "hello" )
         output += "s1 equals \"hello\"\n";
      else
         output += "s1 does not equal \"hello\"\n";
      //忽略字符格式测试相等
      if ( s3.equalsIgnoreCase( s4 ) )
         output += "s3 equals s4\n";
      else
         output += "s3 does not equal s4\n";
      //内容比较
      output +=
         "\ns1.compareTo( s2 ) is " + s1.compareTo( s2 ) +
         "\ns2.compareTo( s1 ) is " + s2.compareTo( s1 ) +
         "\ns1.compareTo( s1 ) is " + s1.compareTo( s1 ) +
         "\ns3.compareTo( s4 ) is " + s3.compareTo( s4 ) +
         "\ns4.compareTo( s3 ) is " + s4.compareTo( s3 ) +
         "\n\n";
      //测试包含字符格式的域匹配
      if ( s3.regionMatches( 0, s4, 0, 5 ) )
         output += "First 5 characters of s3 and s4 match\n";
      else
         output +=
            "First 5 characters of s3 and s4 do not match\n";
      //忽略字符格式的域匹配
      if ( s3.regionMatches( true, 0, s4, 0, 5 ) )
         output += "First 5 characters of s3 and s4 match";
      else
         output +=
            "First 5 characters of s3 and s4 do not match";
      //*********Found**********
      JOptionPane.______________________( null, output,
         "字符串构造方法示例",
         JOptionPane.INFORMATION_MESSAGE );
    System.exit( 0 );
  }  
}
