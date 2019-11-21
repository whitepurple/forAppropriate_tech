import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class makeTotalExcel {
	private static final String path ="C:/Users/user/Desktop/gep/data/newTotal"; 
	private ArrayList<String> xlsx = new ArrayList<>();
	public void make() throws IOException {
		File file = new File(path);
		for(File day:file.listFiles(e -> e.getName().startsWith("2019"))) {
			String date = day.getName();
			for(File store: day.listFiles()) {
				String storeInfo = "";
				String name = store.getName();
				int gpsIndex = name.indexOf("(");
				String gps = name.substring(gpsIndex+1,name.length()-1);
				name = name.substring(0, gpsIndex);
				storeInfo+=date+"; ";
				storeInfo+=name;
				storeInfo+=";"+gps.replace(", ", " ")+"\n";
				System.out.print(storeInfo);
				xlsx.add(storeInfo);
			}
		}
		toTxtFile.getToTxtFile().stringsToTxt(xlsx, path+"/new total.txt");
	}
}
