import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        File file = new File("test.txt");
        Random random = new Random();

        try (DataOutputStream dataOutputStream = new DataOutputStream(new
                FileOutputStream(file))) {
            for (int i = 0; i < 10; i++) {
               char ch =(char) (random.nextInt(26)  + 'a');
               dataOutputStream.writeChar(ch);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (DataInputStream dataInputStream = new DataInputStream(new
                FileInputStream(file))) {
            for (int i = 0; i < 10; i++) {
                System.out.println(dataInputStream.readChar());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        file.delete();
    }
}
