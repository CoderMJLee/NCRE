public class Java_1
{
   //*********Found**********
   public  static  void main (_________________ args[])
   {
      new SimpleThread("第1").start();
      new SimpleThread("第2").start();
   }
} 

//*********Found**********
class SimpleThread extends ________________
{
   public SimpleThread(String str)
   {
      super(str);
   }
   public void run()
   {
      for (int i = 0; i < 5; i++)
      {
   //*********Found**********
         System.out.println(i + " " + ______________());
         try
         {
            sleep((int)(2 * 100));
         }
         catch (InterruptedException e) { }
      }
      System.out.println("运行! " + getName());
   }
}
