package ch13.collection;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class PropertiesEx02 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "한글");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		try {
			prop.store(new FileOutputStream("exercise/ch13/collection/output.txt"), "Properties Example");
			prop.storeToXML(new FileOutputStream("exercise/ch13/collection/output.xml"), "Properties Example");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
