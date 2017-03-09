package Json;

import java.util.Collection;
import java.util.ArrayList;
import com.google.gson.Gson;

public class DirectoryProxy implements Directory{

	MainDirectory main;
	//TODO: Have DirectoryProxy export the updated string list in JSON and 
	Gson g;
	ArrayList emps;
	
	public DirectoryProxy(){
		g = new Gson();
		emps = new ArrayList<Employee>();
		main = new MainDirectory();
	}
	
	
	@Override
	public void add(Collection<Employee> c) {
		emps.addAll(c);	
	}

	@Override
	public void print() {
		main.print();
	}

	@Override
	public void clear() {
		main.clear();
	}
	
//	public void g_export(String fileName){
//		
//	}

}
