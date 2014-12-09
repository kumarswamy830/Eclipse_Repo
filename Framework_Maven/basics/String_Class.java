package basics;

public class String_Class {

	
	public static void main(String[] args) {
		
		
		
		String s1=new String("Hello World!  ");
		
		String s2=new String("Good Morning");
		
        
		if(s1.equals(s2)){
			
			System.out.println("Pass");
			
		} else {
			
			System.out.println("Fail");
        }
	
	     String s3=s1.concat(s2);
	     
	     System.out.println(s3);
	     
	     System.out.println(s3.substring(5));
	     
	     System.out.println(s3.substring(5,11));
	     
	     
	     System.out.println("Length of the String is  "+s3.length());
	     
	     System.out.println("Charater at specified location: "+s3.charAt(4));
	     
	     System.out.println("Location of spefied character: "+s3.indexOf('o'));
	     
         System.out.println(s3.toLowerCase());
	     
	     System.out.println(s3.toUpperCase());
	     
	     String s4="  J a v a   ";
	     
	     System.out.println(s4);
	     
	     System.out.println(s4.replaceAll(" ", ""));
	     
	     String arr="Hello world, Good morning";
	     
	     String[] split=arr.split(",");
	     
	       for(String s:split){
	    	   
	    	   System.out.println(s);
	       }
	
	}

}
