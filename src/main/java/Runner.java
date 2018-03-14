import db.DBHelper;
import models.Folder;
import models.File;
import models.Owner;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Folder folder1 = new Folder("Root");
        DBHelper.save(folder1);

        List<Folder> folders = DBHelper.getAll(Folder.class);

        File file1 = new File("ReadMe", "txt", 512, folder1);
        DBHelper.save(file1);
        File file2 = new File("Game", "java", 1024, folder1);
        DBHelper.save(file2);
        File file3 = new File("Test", "xml", 1024, folder1);
        DBHelper.save(file3);

        Owner owner1 = new Owner("Sarah", "SSS");
        DBHelper.save(owner1);

        file2.setExtension("rb");
        DBHelper.update(file2);
        List<File> files1 = DBHelper.getAll(File.class);

        DBHelper.delete(file1);
        List<File> files2 = DBHelper.getAll(File.class);

        List<File> files3 = DBHelper.getAllFiles(folder1);

    }
}
