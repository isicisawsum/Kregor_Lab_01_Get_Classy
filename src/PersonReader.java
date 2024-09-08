import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JFileChooser;
import java.util.ArrayList;
public class PersonReader {
    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        Scanner inFile;
        String line;
        Path target = new File(System.getProperty("user.dir")).toPath();
        target = target.resolve("src");
        ArrayList<String> Rray = new ArrayList<>();

        chooser.setCurrentDirectory(target.toFile());

        try {
            if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
                target = chooser.getSelectedFile().toPath();

                inFile = new Scanner(target);

                System.out.printf("%-10s", "ID#");
                System.out.printf("%-10s", "FirstName");
                System.out.printf("%-10s", "LastName");
                System.out.printf("%-10s", "Title");
                System.out.printf("%-10s", "YOB");
                System.out.println("\n==============================================="); //nice title

                while (inFile.hasNextLine()){
                    line = inFile.nextLine();
                    String[] parts = line.split(",", 50); //splits the string at a comma
                    for (String part : parts) {
                        System.out.printf("%-10s", part);
                    }
                    System.out.println(); //prints new line
                    Rray.add(Arrays.toString(parts));
                }
                inFile.close();
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
