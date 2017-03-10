package Json;

import java.io.*;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class MainDirectory implements Directory {
	
	Gson g = new Gson();
	ArrayList database;
	ArrayList outputList;
	
	public MainDirectory(){
		database = new ArrayList<Employee>();
		outputList = new ArrayList<String>();
	}

	@Override
	public void add(Collection<Employee> c) {
		database.addAll(c);
	}

	@Override
	public void print() {
		
		for(int i = 0; i < database.size(); i++){
			outputList.add(database.get(i).toString());
		}
		
		Collections.sort(outputList);
	}

	@Override
	public void clear() {
		database = new ArrayList<Employee>();
	}
	
	public void g_import(){
		
		try{
			
			FileReader file = new FileReader("serial.txt");
			BufferedReader readFile = new BufferedReader(file);
			
			String s = "";
			String in = "";
			
			while((s = readFile.readLine()) != null){
				in += (s + "\n");
			}
			
			readFile.close();
			
			database = (g.fromJson(in, new TypeToken<Collection<Employee>>(){}.getType()));
			
		}catch(Exception e){
			System.err.println("File not found.");
		}
		
	}
	
}
