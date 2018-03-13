import db.DBHelper;
import models.Folder;
import models.File;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Folder folder1 = new Folder("Root");
        DBHelper.save(folder1);

        File file1 = new File("ReadMe", "txt", 512, folder1);
        DBHelper.save(file1);
        File file2 = new File("Game", "java", 1024, folder1);
        DBHelper.save(file2);

        file2.setExtension("rb");
        DBHelper.update(file2);
        List<File> files1 = DBHelper.getAll(File.class);

        DBHelper.delete(file1);
        List<File> files2 = DBHelper.getAll(File.class);

    }
}
