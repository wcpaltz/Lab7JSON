package Json;

import java.util.Collection;
import java.util.ArrayList;
import com.google.gson.Gson;

public class DirectoryProxy implements Directory{

	MainDirectory main;
	
	Gson g;
	ArrayList emps;
	
	public DirectoryProxy(){
		g = new Gson();
		emps = new ArrayList<Employee>();
		//TODO: initialize MainDirectory
	}
	
	
	@Override
	public void add(Collection<Employee> c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	
	public void g_import(String fileName){
		
	}
	
	public void g_export(String fileName){
		
	}

}
