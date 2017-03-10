package Json;

import java.util.Collection;
import java.io.*;
import java.util.ArrayList;
import com.google.gson.Gson;

public class DirectoryProxy implements Directory{

	MainDirectory main;
	//TODO: Have DirectoryProxy export the updated string list in JSON and 
	Gson g;
	ArrayList proxyList;
	BufferedWriter writer = null;
	
	public DirectoryProxy(){
		g = new Gson();
		proxyList = new ArrayList<Employee>();
		main = new MainDirectory();
	}
	
	
	@Override
	public void add(Collection<Employee> c) {
		proxyList.addAll(c);	
	}

	@Override
	public void print() {
		main.g_import();
		main.print();
	}

	@Override
	public void clear() {
		main.clear();
	}
	
	public void g_export(){
		
		String out = g.toJson(proxyList);
		
		try {
			
			PrintWriter writer = new PrintWriter("serial.txt", "UTF-8");
			writer.println(out);
			writer.close();
			
		}catch(Exception e){
			System.err.println("Problem occurred with export.");
		}
		
	}

}
