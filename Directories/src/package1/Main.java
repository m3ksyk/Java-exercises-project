package package1;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.Iterator;

public class Main {
//filtering files in a path
    public static void main(String[] args) {
        DirectoryStream.Filter<Path> filter = new DirectoryStream.Filter<Path>() {
            public boolean accept(Path path) throws IOException{
                return (Files.isRegularFile(path));
            }
        };


//printing directories
       // Path directory = FileSystems.getDefault().getPath("Filetree\\Dir1");
        Path directory = FileSystems.getDefault().getPath("Filetree" + File.separator + "Dir2");
        try(DirectoryStream<Path> contents = Files.newDirectoryStream(directory)) {
            for(Path file: contents){
                System.out.println(file.getFileName());
            }
        }catch(IOException | DirectoryIteratorException e) {
            System.out.println(e.getMessage());
        }
        //checking the separator type (useful on multi-platform programs)
        String separator = File.separator;
        System.out.println(separator);
        separator = FileSystems.getDefault().getSeparator();
        System.out.println(separator);
// creating temporary files
        try{
            Path tempFile = Files.createTempFile("myTemp", ".appext");
            System.out.println("Temp file path: " +tempFile.toAbsolutePath());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        //file stores
        Iterable<FileStore> stores = FileSystems.getDefault().getFileStores();
        for(FileStore store : stores) {
            System.out.println(store.name());
            System.out.println(store);
        }
        //getting root paths
        Iterable<Path> rootPath = FileSystems.getDefault().getRootDirectories();
        for(Path path : rootPath){
            System.out.println(path);
        }
// walking the directories
        System.out.println(" -- walking tree - dir2 --");
        Path dir2Path = FileSystems.getDefault().getPath("FileTree" + File.separator + "Dir2");
        try {
            Files.walkFileTree(dir2Path, new PrintNames());

        }catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
//copying directories
        System.out.println("******");
        System.out.println("Copying dir2 to dir4/dir2copy");
        Path copyPath = FileSystems.getDefault().getPath("FileTree" + File.separator + "Dir4" + File.separator + "Dir2copy");
        try{
            Files.walkFileTree(dir2Path, new CopyFiles(dir2Path, copyPath));

        }catch(IOException e){
            System.out.println(e.getMessage());

        }

    }
}
