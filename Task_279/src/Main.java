import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            for (int i = 0; i < 5; i ++) {
                fileOutputStream.write((int) (Math.random() * 9 + 1));
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
        try(FileInputStream fileInputStream = new FileInputStream(file)) {
             int a = fileInputStream.read();
             while (a != -1) {
                 System.out.println(a + " ");
                 a = fileInputStream.read();
             }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
