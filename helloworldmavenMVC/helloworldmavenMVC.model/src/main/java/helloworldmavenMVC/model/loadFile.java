package helloworldmavenMVC.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class loadFile {

	private String message;
	
	public loadFile(){
		readFile();
	}
	
	
	private void readFile(){
		FileInputStream fis = null;
		
		try{
			
			String result = "";
			
			fis = new FileInputStream(new File("hello.txt"));
			
			byte[] buf = new byte[8];
			
			while((fis.read(buf)) >= 0){
				
				for(byte bit : buf){
					result += (char)bit;
				}
				
				buf = new byte[8];
			}
			
			this.message = result;
			
			fis.close();
			
		}catch (FileNotFoundException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      }	
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
}
