package pie;
import java.io.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner; 
import java.lang.*;

//SOME CHANGES



public class pie {

    public static void main(String[] argv) throws IOException {

	Scanner input = new Scanner(System.in);
	String nameTotal;
	int i = 0;
	int j =0;
	String location;
	String result1;
	String name;
	//NOW WE MADE A MODIF TO BE V1.1

	System.out.println("Enter the parts folder location");
	location=input.nextLine();

	System.out.println("Enter the starting key number ( ex:100 ) , and hit enter");
	j = input.nextInt();

	 input.close();
	
	
    File folder = new File(location);
    File[] listOfFiles = folder.listFiles();

    

	while (i < listOfFiles.length) {
		
		if (listOfFiles[i].isFile()) {
			nameTotal=listOfFiles[i].getName();

			name=nameTotal.substring(0, nameTotal.lastIndexOf('.'));

			File f = new File(location + "\\" +nameTotal);

			j++;
			result1=String.format("%03d",j);

			f.renameTo(new File(location + "\\" +result1+" "+nameTotal));
			i++;
		}

	}
        
        System.out.println("conversion is done");
    }
   
}
