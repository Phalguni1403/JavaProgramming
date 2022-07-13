import java.io.File;
import java.io.FileReader;

public class CreateFile {

	public static void main(String[] args) {

		// Create the new file
		
//		File file = new File("Newfile.txt");
//
//		try {
//			boolean value = file.createNewFile();
//
//			if (value) {
//				System.out.println("the new file is created");
//			} else {
//				System.out.println("file already present in the system");
//			}
//		} catch (Exception e) {
//			e.getStackTrace();
//			System.out.println("ERROR!!! File can't be created");
//		}
		
		
		// Read the file
		
		char[] arr = new char[1000];
		
		try {
			FileReader input = new FileReader("Newfile.txt");
			// Read the letters / characters
			input.read(arr);
			
			System.out.println("Data in the file --> \n");;
			System.out.println(arr);
			
			// close the file
			input.close();
			
		}catch (Exception e) {
			e.getStackTrace();
		}

	}

}
