import java.io.*;

public class Main {
    public static void main(String[] args) {

        File file = new File("test.csv");
        String[] s = {"Value 1", ";", "Value 2", ";", "Value 3"};

        try (DataOutputStream dataOutputStream = new DataOutputStream(new
                FileOutputStream(file))) {
            for (String string : s) {
                dataOutputStream.writeChars(string);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream dataInputStream = new DataInputStream(new
                FileInputStream(file))) {
            int a = dataInputStream.read();
            while (a != -1) {
                System.out.print((char) dataInputStream.read());
                a = dataInputStream.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        file.delete();
    }
}
