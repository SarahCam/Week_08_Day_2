import db.DBHelper;
import models.Folder;
import models.File;

public class Runner {

    public static void main(String[] args) {

        Folder folder1 = new Folder("Root");

        File file1 = new File("ReadMe", "txt", 512, folder1);
        DBHelper.save(file1);
        File file2 = new File("Game", "java", 1024, folder1);
        DBHelper.save(file2);

    }
}
