import java.util.List;

public class DirectoryAndFilesRecursive {

    public static void printFiles(Directory directory){
            if(directory.getFiles().size()>0){
                for(File file:directory.getFiles()){
                    System.out.println(file.getName());
                }
            }
            if(directory.getDirectories().size()>0){
                for(Directory sd:directory.getDirectories()){
                    printFiles(sd);
                }
            }
        }


    public static void main(String[] args) {
        Directory directory=new Directory();
        directory.setDirectoryName("toto");
        directory.setDirectories(null);
        directory.setFiles(null);
        printFiles(directory);
    }
}

