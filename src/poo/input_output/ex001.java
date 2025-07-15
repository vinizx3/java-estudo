package poo.input_output;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class ArchiveHandling{
    public void writeInArchive(String nameArchive, String content){
        try {
            FileWriter writer = new FileWriter(nameArchive);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public String ReadArchive(String nameArchive){
        StringBuilder content = new StringBuilder();
        try {
            FileReader reader = new FileReader(nameArchive);
            int character;
            while ((character = reader.read()) != -1){
                content.append((char) character);
            }
            reader.close();
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        return content.toString();
    }
}

public class ex001 {
    public static void main(String[] args) {
        String nameArchive = "src/poo/input_output/data_file/MyArchive.Txt";
        String content = "Hello world";

        ArchiveHandling archive = new ArchiveHandling();
        archive.writeInArchive(nameArchive, content);
        System.out.println(archive.ReadArchive(nameArchive));

    }
}
