import java.io.*;

public class Main {
    public static void main(String[] args) {

        File file = new File("test.txt");

        try (DataOutputStream dataOutputStream = new DataOutputStream(new
                FileOutputStream(file))) {
           for (int i = 0; i <10; i++) {
               double d = Math.random()*10 + 1;
               dataOutputStream.writeDouble(d);
           }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream dataInputStream = new DataInputStream(new
                FileInputStream(file))){
            for (int i = 0; i <10; i++) {
                System.out.println(dataInputStream.readDouble());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        file.delete();

    }
}
