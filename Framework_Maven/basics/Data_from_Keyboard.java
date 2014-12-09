package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Data_from_Keyboard {

	
	public static void main(String[] args) throws IOException {
		
		
		InputStreamReader obj=new InputStreamReader(System.in);
		
		BufferedReader br=new BufferedReader(obj);
		
        System.out.println("Enter  Emp ID: ");
		
		String str=br.readLine();
		
		Integer x=Integer.parseInt(str);
		
		System.out.println("Emp ID :   "+x);
		
        System.out.println("Enter  Name: ");
		
		String s=br.readLine();
		
		System.out.println("Emp Name : "+s);
		
		System.out.println("Enter gender: ");
		
		char ch=(char)br.read();
		
		System.out.println("Gender: "+ch);
		
        
	}

}
