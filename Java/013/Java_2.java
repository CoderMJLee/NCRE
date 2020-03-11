public class Java_2{
   public static void main(String args[]) { 
      //*********Found**********
      int a[][] = ________________ int[5][5];
      int i,j,k = 1;
      for(i=0;i<5;i++)
         for(j=0;j<5;j++)
            if((i+j)<5){
               a[i][j] = k;
               //*********Found**********
               ____________________;
               if (k > 9) k = 1;
            }else
               //*********Found**********
               ____________________;
      for(i=0;i<5;i++){ 
         for(j=0;j<5;j++)
            System.out.print(a[i][j]+ "   ");
         //*********Found**********
         _________________________;
      }
   }
}