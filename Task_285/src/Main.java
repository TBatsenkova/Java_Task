import java.io.*;

public class Main {
    public static void main(String[] args) {

        File file = new File("test.txt");

        long timeStart1 = System.currentTimeMillis();
        try (OutputStream outputStream = new BufferedOutputStream(new
                FileOutputStream(file))) {
            for (int i = 0; i< 1 * 1024 * 1024; i++) {
                outputStream.write(i);
                outputStream.flush();
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        System.out.println("Время записи 1 мегабайт с буферизацией: " +
                (System.currentTimeMillis() - timeStart1) + " миллисекунд");

        long timeStart2 = System.currentTimeMillis();
        try (InputStream inputStream = new BufferedInputStream(new
                FileInputStream(file))) {
            while (inputStream.read() != -1) {
                inputStream.read();
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        System.out.println("Время чтения 1 мегабайт с буферизацией: " +
                (System.currentTimeMillis() - timeStart2) + " миллисекунд");

        long timeStart3 = System.currentTimeMillis();
        try (OutputStream outputStream = new
                FileOutputStream(file)) {
            for (int i = 0; i< 1 * 1024 * 1024; i++) {
                outputStream.write(i);
                outputStream.flush();
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        System.out.println("Время записи 1 мегабайт без буферизации: " +
                (System.currentTimeMillis() - timeStart3) + " миллисекунд");

        long timeStart4 = System.currentTimeMillis();
        try (InputStream inputStream = new
                FileInputStream(file)) {
            while (inputStream.read() != -1) {
                inputStream.read();
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        System.out.println("Время чтения 1 мегабайт без буферизации: " +
                (System.currentTimeMillis() - timeStart4) + " миллисекунд");

        file.delete();
    }
}
