import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {

        File file = new File("test.txt");
        String s = "cat";

        try (OutputStream outputStream = new BufferedOutputStream(new
                FileOutputStream(file))) {
            outputStream.write(s.getBytes(StandardCharsets.UTF_8));
            outputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (InputStream inputStream = new BufferedInputStream(new
                FileInputStream(file))) {
            for ( int i = 0; i < file.length(); i ++) {
                System.out.print((char)inputStream.read());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        file.delete();
    }
}
