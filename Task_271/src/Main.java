import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File dir = new File("New Dir");
        dir.mkdir();
        System.out.println("New Dir - это файл? - " + dir.isFile());
        System.out.println("New Dir - это каталог? - " + dir.isDirectory());
        File newDir = new File("New Directory");
        System.out.println("Переименовываем New Dir в New Directory - " + dir.renameTo(newDir));
        File newDirec = new File("New Direc");
        newDirec.mkdir();
        System.out.println("Папка New Direc существует? - " + newDirec.exists());
        System.out.println("New Direc удален? - " + newDirec.delete());



    }
}
