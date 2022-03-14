import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Inverter {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //to read pbmpixelScanner scan = new Scanner(readPBM);
       Scanner userInput = new Scanner(System.in);
       System.out.print("Enter filename: ");
       String filename = userInput.nextLine();
       //input from user
       //write to file
       File readPBM = new File(filename);     
       Scanner scan = new Scanner(readPBM);
        FileWriter fileOutput = new FileWriter("inverted.pbm");
       String FileContent = scan.nextLine();
       fileOutput.write(FileContent + "\n");
       String FileContent2 = scan.nextLine().concat(" inverted");
         fileOutput.write(FileContent2 + "\n");
        int col = scan.nextInt();
      int rows = scan.nextInt();
       String FileContent3 = col + " " + rows;
       fileOutput.write(FileContent3 + "\n");
            //lines 4-13
      
        for(int i = 0; i < rows; i++){
        for(int j = 0; j< col; j++){
       // new constructor for object
       PBMPixel file = new PBMPixel(scan);
        
        fileOutput.write(file.getInvertedValue() + " ");
    }
        
           fileOutput.write("\n");
        }
        fileOutput.close();
        scan.close();
                //6 by 10 for loop
                //after reading lines add it to file
                //nested loop for invetered pixel file
    }
   
    
}       
        
        
    


