import java.util.List;
import java.util.Stack;

public class DirectoryAndFiles {

    public static void printFiles(Directory directory){
        Stack pile = new Stack () ;
        pile.push(directory);
        while (!pile.isEmpty()){
            Directory dir = (Directory)pile.pop();
            if(dir.getFiles().size()>0){
                for(File file:dir.getFiles()){
                    System.out.println(file.getName());
                }
            }
            if(dir.getDirectories().size()>0){
                for(Directory sd:dir.getDirectories()){
                    pile.push(sd);
                }
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
class Directory{
    private String directoryName;
    private List<Directory> directories;
    private List<File> files;

    public String getDirectoryName() {
        return directoryName;
    }

    public List<Directory> getDirectories() {
        return directories;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    public void setDirectories(List<Directory> directories) {
        this.directories = directories;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }
}

class File {
    private String name;
    private String size;

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
