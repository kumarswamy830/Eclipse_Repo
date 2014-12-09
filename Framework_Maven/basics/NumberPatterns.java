package basics;

public class NumberPatterns {

	public static void main(String[] args) {
		
		int i, j;
		 for (i = 0; i < 4; i++) {
			 
			 
		  for (j = 0; j <= i; j++) {
		   if (((i + j) % 2) == 0) {  // Decides on as to which digit to print.
		    System.out.println("0");
		   } else {
		    System.out.println("1");
		   }
		   System.out.println("\t");
		  }
		  System.out.println("\n");
		 }
		


	}

}
