import java.io.*;
public class Java_1 {
    public static void main(String[ ] args) throws IOException {
        InputStreamReader ir;
        BufferedReader in;
        int max, x;
        String data;

        max = 0;
        ir = new InputStreamReader(System.in);
        in = new BufferedReader(ir);
        System.out.println("请输入5个正整数：");
        //*********Found**********
        for (int i = 1; ___________; i++) {
            data = in.readLine();
            //*********Found**********
            x = Integer.___________(data);
            if ( max < x )
                //*********Found**********
                ___________;
        }
        System.out.println("输入的最大值是 "+ max);
    }
}
