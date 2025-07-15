package poo.input_output;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestIO {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("src/poo/input_output/data_file/MyArchive.txt");
            writer.write("Hello world");
            writer.close();

            FileReader reader = new FileReader("src/poo/input_output/data_file/MyArchive.txt");
            int data = reader.read();

            while(data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
        } catch (IOException e){
            System.out.println("Error :" + e.getMessage());
        }
    }
}
