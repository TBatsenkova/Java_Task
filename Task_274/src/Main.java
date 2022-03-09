import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file1 = new File("file1.txt");
        file1.createNewFile();
        System.out.println("Файл занимает " + file1.length() + " КБ");
        System.out.println("Свободно " + file1.getTotalSpace() + " КБ");
        System.out.println("Свободно для записи " + file1.getFreeSpace() + " КБ");
        System.out.println("Время последней модификации " + file1.lastModified() + "КБ");
    }
}
