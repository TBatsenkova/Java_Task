import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        File file1 = new File ("file1.txt");
        FileOutputStream out = new FileOutputStream("file1.txt");
        FileInputStream in = new FileInputStream("file1.txt");
        int[] b =  {1, 2, 3, 4, 5};
        //записываем массив b в file1
        for (int i = 0; i < b.length; i++) {
            out.write(b[i]);
        }
        //читаем file1
        int res = in.read();
        while (res  != -1) {
            System.out.println(res);
            res = in.read();
        }
        //закрываем потоки
        out.close();
        in.close();

    }
}
