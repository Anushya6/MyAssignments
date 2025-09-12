package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingusingCollection {

	public static void main(String[] args) {
		
		String [] s= {"HCL","Wipro","Aspire Systems","CTS"};

	
	     List<String>list=new ArrayList<String>();
	    
	     
	     for (int i = 0; i < s.length; i++) {
	    	 list.add(s[i]);  
	    	 Collections.sort(list);
	    	 Collections.reverse(list);
			
		}
	     for (String string : list) {
	    	 System.out.print(string+" ");
			
		}
	    
	     

	     
	    
		
	}
		 
			
		}
		 
	    
			
		
	
		
		

	


