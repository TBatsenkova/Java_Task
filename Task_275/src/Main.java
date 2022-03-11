import java.io.File;

public class Main {
    public static void main(String[] args)  {
        final String way = "C:\\Users\\UNIT\\Java_Task";
        final String extension = "Task";
        File dir = new File(way);
        System.out.println("В каталоге " + dir.getName() + " находятся: ");
        //выводим имена файлов/каталогов, начинающихся с Task
        try {
            for (File files : dir.listFiles()) {
                if (files.isDirectory() && files.getName().startsWith(extension)) {
                    System.out.println("каталог " + files.getName());
                } else if (files.isFile() && files.getName().startsWith(extension)) {
                    System.out.println("файл " + files.getName());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
