public class Java_2 { 
   public static void main (String args[]) { 
      try { 
         Sleep a = new Sleep (); 
         Thread t = new Thread (a); 
         //*********Found**********
         t._____________();
         t.join(); 
         int j= a.i; 
         System.out.println("j="+j+",a.i="+a.i);
      } catch (Exception e) {} 
   } 
} 

//*********Found**********
class Sleep implements _________________{ 
   int i; 
   public void run () { 
      try { 
         //*********Found**********
         Thread._______________(50); 
         i= 10; 
      } 
      //*********Found**********
      ______________(InterruptedException e) {} 
   } 
}
