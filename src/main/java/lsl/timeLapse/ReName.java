package lsl.timeLapse;

import java.io.File;

public class ReName {
	public static void main(String[] args) {

		String fileLocation = "E:\\temp\\Camera";
		String fileLocation2 = "E:\\temp\\Camera2";

		File file = new File(fileLocation);
		File[] listFiles = file.listFiles();

		for (int i = 1; i <= listFiles.length; i++) {

			listFiles[i - 1].renameTo(new File(fileLocation2 + "\\" + i + ".jpg"));
			System.out.println(i);
		}
	}
}
