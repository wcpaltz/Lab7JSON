package Json;

import java.io.*;
import java.util.Collection;
import java.util.ArrayList;

public class MainDirectory implements Directory {
	
	ArrayList database;
	//TODO: Have MainDirectory read file input from a serial.txt I have yet to create
	
	public MainDirectory(){
		database = new ArrayList<Employee>();
	}

	@Override
	public void add(Collection<Employee> c) {
		database.addAll(c);
		//TODO: Sort the list
	}

	@Override
	public void print() {
		
		for(int i = 0; i < database.size(); i++){
			System.out.println(database.get(i));
		}
		
	}

	@Override
	public void clear() {
		database = new ArrayList<Employee>();
	}
	
	public void g_import(){
		
		try{
			
			FileReader file = new FileReader("serial.txt");
			BufferedReader readFile = new BufferedReader(file);
			
			String str = "";
			
			while((str = readFile.readLine()) != null){
			
			}
			
		}catch(Exception e){
			System.out.println("File not found.");
		}
		
	}
	
}
