import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        File file = new File("test.txt");

        try (DataOutputStream dataOutputStream = new
                DataOutputStream(new FileOutputStream(file))) {
            for (int i = 0; i < 10; i++) {
                boolean b = random.nextBoolean();
                dataOutputStream.writeBoolean(b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream dataInputStream = new
                DataInputStream(new FileInputStream(file))) {
            for (int i = 0; i <10; i++) {
                System.out.println(dataInputStream.readBoolean());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        file.delete();
    }
}
