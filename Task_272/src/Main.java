import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file1 = new File("file1.txt");
        file1.createNewFile();
        if (file1.exists()) {
            System.out.println("Файл file1.txt существует.");
        }
        else {
            System.out.println("Файл file1.txt не существует.");
        }
        System.out.println("Абсолютный путь - " + file1.getAbsolutePath());
        File file2 = new File("file2.txt");
        file2.createNewFile();
        System.out.println("Абсолютный путь - " + file2.getAbsolutePath());
        File file3 = new File("file3.txt");
        file2.createNewFile();
        System.out.println("Абсолютный путь - " + file3.getAbsolutePath());
        file2.renameTo(file3);
        System.out.println("file2.txt существует? - " + file2.exists());
        System.out.println("file3.txt существует? - " + file3.exists());
        System.out.println("Удаляем все файлы: " + file1.delete() + " " + file2.delete() + " " + file3.delete());
        System.out.println("file1.txt существует? - " + file1.exists());
        System.out.println("file2.txt существует? - " + file2.exists());
        System.out.println("file3.txt существует? - " + file3.exists());

    }
}
