package in.com.cg.stream;
//write class 
import java.io.*;
public class WriteFile 
{
	private String path;//path 
	private boolean append_to_file = false;
	
	public WriteFile(String file_path, boolean append_value)//function to write
	{
		path=file_path;
		append_to_file=append_value;
	}
	
	public void writeToFile(String textline) throws IOException//function to write on file
	{
		FileWriter write=new FileWriter(path, append_to_file);
		PrintWriter print_line = new PrintWriter(write);
		
		print_line.printf("%s"+"%n", textline);
		print_line.close();
	}
}
