package poo.input_output;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class NewArchiveHandling{
    public void writeArchive(String nameArchive, String content){
        Path path = Paths.get("MyArchive.txt");
        try {
            byte[] bytes = content.getBytes();
            Files.write(path, content.getBytes());
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    public String ReaderArchive(String nameArchive){
        try {
            Path path = Paths.get(nameArchive);
            byte[] bytes = Files.readAllBytes(path);
            return new String(bytes);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return "";
    }
}

public class ex002 {
    public static void main(String[] args) {
        String nameArchive = "src/poo/input_output/data_file/MyArchive.Txt";
        String content = "Hello world";

        NewArchiveHandling archive = new NewArchiveHandling();
        archive.writeArchive(nameArchive, content);
        System.out.println(archive.ReaderArchive(nameArchive));

    }
}
