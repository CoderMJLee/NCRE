//*********Found**********
import java.______________.*;

public class Java_1 {
    public static void main(String[ ] args) throws IOException {
        InputStreamReader ir;
        BufferedReader in;
        int sum, x;
        String data;
        //*********Found**********
        _______________;
        ir = new InputStreamReader(System.in);
        in = new BufferedReader(ir);
        System.out.println("请输入5个整数：");
        //*********Found**********
        for (int i = 1; ____________; i++) {
            data = in.readLine();
            x = Integer.parseInt(data);
            //*********Found**********
            if (___________) 
                sum += x;
        }
        System.out.println("偶数之和为"+ sum );
    }
}


















