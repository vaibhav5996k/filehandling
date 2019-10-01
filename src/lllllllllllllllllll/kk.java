package lllllllllllllllllll;

import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors

public class kk {
    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt");
            if (myObj.exists()) {
                System.out.println("File created: " + myObj.getName());
                System.out.println("Length of file is: " + myObj.length());
                System.out.println("it is directiry: " + myObj.isDirectory());
                System.out.println("File created: " + myObj.isAbsolute());
                System.out.println("File created: " + myObj.isFile());
                System.out.println("File created: " + myObj.isHidden());
                System.out.println("File created: " + myObj.exists());
                System.out.println("File created: " + myObj.getPath());
                System.out.println("File created: " + myObj.getCanonicalPath());
                System.out.println("File created: " + myObj.getParent());
                FileWriter myFileWriter = new FileWriter("filename.txt");
                        myFileWriter.write("LOL i just crated file and succesfully writein it toooo");
                myFileWriter.close();
                System.out.println("File successfully updated");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

