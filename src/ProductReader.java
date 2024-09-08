import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JFileChooser;
public class ProductReader {
    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        Scanner inFile;
        String line;
        Path target = new File(System.getProperty("user.dir")).toPath();
        target = target.resolve("src");
        ArrayList<String> peeps = new ArrayList<>();

        chooser.setCurrentDirectory(target.toFile());

        try {
            if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
                target = chooser.getSelectedFile().toPath();

                inFile = new Scanner(target);

                System.out.printf("%-15s", "ID#");
                System.out.printf("%-15s", "Name");
                System.out.printf("%-15s", "Description");
                System.out.printf("%-15s", "Cost");
                System.out.println("\n===============================================");

                while (inFile.hasNextLine()){
                    line = inFile.nextLine();
                    String[] parts = line.split(",", 50); //splits the string at a comma
                    for (String part : parts) {
                        System.out.printf("%-15s", part);
                    }
                    System.out.println(); //prints new line
                    peeps.add(Arrays.toString(parts));
                }
            }
            else{
                System.out.println("You must print a file!");
                System.exit(0);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
