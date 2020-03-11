public  class  Java_2
{    
   public static void main(String[] args)
   {
      Thread t = new SimpleThread("Testing_Thread");
       //*********Found**********
      ______________  ;   
   }
} 
 //*********Found**********
class SimpleThread extends _________ 
{
   public SimpleThread(String str)
   {
      //*********Found**********
      _____________   ;
   }
    //*********Found**********
   public void _________()
   {  
      System.out.println("Running the " + getName() + ":");
      for (int i = 0; i < 5; i++)
      {
         System.out.println("---" + i + "---" + getName());
         try
         {
            sleep((int)(2 * 100));
         }
         //*********Found**********
         _________(InterruptedException e) { }
      }
   }
}