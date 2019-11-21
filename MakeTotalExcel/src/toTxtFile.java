
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;


public class toTxtFile {
	private static toTxtFile uniqueInstance = null;
	private toTxtFile() {}
	public static toTxtFile getToTxtFile() {
		if(uniqueInstance==null) uniqueInstance = new toTxtFile();
		return uniqueInstance;
	}
	
	public void stringsToTxt(ArrayList<String> strings, String str) throws IOException {
    	OutputStream output = new FileOutputStream(str);
    	strings.stream().forEachOrdered(s -> {
			try {
				output.write(s.getBytes());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
    	output.close();	
    }
}
