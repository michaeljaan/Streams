package in.com.cg.stream;
//main program to generate random number
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.io.File;
import java.io.IOException;
//import com.stream.writeFile.WriteFile;

public class RandomGenerator 
{
	public static void main(String args[]) throws IOException{
		
		Random random =new Random();//create an object of type random
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the path");
		String file_path=scanner.nextLine();//imput the path of the file to be written
		WriteFile write_file=new WriteFile(file_path, true);
		for(int i=0;i<100;i++)
		{
			write_file.writeToFile(""+random.nextInt(50));//write random number into the file
			System.out.println("\n");
		}
		
		Scanner s=new Scanner(new File(file_path));
		Set<Integer> set=new TreeSet<>();//create object of type set
		
		while(s.hasNextInt())
		{
			set.add(s.nextInt());
		}
		s.close();
		
		set.stream().distinct().sorted().forEach(System.out::println);//output the set.
	}
}
