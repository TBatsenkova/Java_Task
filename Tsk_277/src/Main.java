import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("test.txt");
        try(OutputStream outputStream = new FileOutputStream(file)){
            byte b = 1;
            outputStream.write(b);
            b = 22;
            outputStream.write(b);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(InputStream inputStream = new FileInputStream(file)) {
            for ( int i = 0; i < file.length(); i++) {
                System.out.println(inputStream.read());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        file.delete();
    }
}
