import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file1 = new File("file1.txt");
        if (file1.exists()) {
            file1.delete();
        } else {
            file1.createNewFile();
        }
        System.out.println("file1.txt существует? - " + file1.exists());
        System.out.println("Можно читать? - " + file1.canRead());
        System.out.println("Можно писать? - " + file1.canWrite());
        System.out.println("Запрет редактирования  " + file1.setReadOnly());
        System.out.println("Можно писать? - " + file1.canWrite());
    }
}
