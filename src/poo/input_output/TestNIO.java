package poo.input_output;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestNIO {
    public static void main(String[] args) {
        Path path = Paths.get("src/poo/input_output/data_file/MyArchive.txt");

        try{
            Files.write(path, "Hello World".getBytes());

            byte[] bytes = Files.readAllBytes(path);
            String content = new String(bytes);

            System.out.println(content);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
