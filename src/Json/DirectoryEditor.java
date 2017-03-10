package Json;

import java.util.ArrayList;
import java.util.Scanner;

public class DirectoryEditor {
	// loop waiting for user input
	public static void main(String[] args) {
		
		Scanner letsgo = new Scanner(System.in);
		String input = "";
		boolean quit = false;
		DirectoryProxy proxy = new DirectoryProxy();
		ArrayList<Employee> eList = new ArrayList<Employee>();
		String[] sList;
		
		while (!quit) {
			System.out.println("-> ");
			input = letsgo.nextLine().toUpperCase();
			
			if (input.equals("ADD")) {
//				
				do{
					
					input = letsgo.nextLine();
					
					if(input.equals("END")){
						System.err.println("Ending session...");
					}
					else{
						sList = input.split(" ");
						
						if (sList.length == 4) {
							eList.add(new Employee(sList[0], sList[1], sList[2], sList[3]));
						} else {
							System.out.println("Incorrect input");
						}
						
					}
					
				}while(!input.equals("END"));
				
				proxy.add(eList);
				proxy.g_export();
				
				
//				while (!input.equals("END")) {
//					input = letsgo.nextLine();
//					sList = input.split(" ");
//					
//					if (sList.length == 4) {
//						eList.add(new Employee(sList[0], sList[1], sList[2], sList[3]));
//					} else {
//						System.out.println("Incorrect input");
//					}
//				}
				// proxy.add(eList);
				// proxy.g_export("Output.txt");
				
			} else if (input.equals("CLR")) {
				proxy.clear();
			} else if (input.equals("PRINT")) {
				proxy.print();
			}
		}
	}

}