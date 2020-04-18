package com.dla;

public class TEst {
	
	public static void main(String[] args){
		
		String name ="Prakhar";
		occur(name);
		
	}
  public static void occur(String str) {
	  
	  char omar[]=str.toCharArray();
	  int flag=0;
	  for(int i=0;i<str.length();i++) {
		  flag=0;
		  for(int j=0;j<str.length();j++) {
			  
			  if(j<i && omar[i]==omar[j])
			  {
				  break;
			  }
			    if( omar[i] == omar[j])
			    	flag++;
			   if(j==str.length()-1)
				   System.out.println("Character "+omar[i]+" appears "+flag+"times");      
		  }
		  
	  }
  }

}
