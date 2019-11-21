
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

//웹크롤링을 통해 얻어낸 CSV형식의 파일을 txt확장자로 파일 저장.
//txt파일로 저장한 파일을 엑셀에서 데이터 텍스트로 불러와 유니코드 문자열로 저장
//UTF-16LE사용

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
