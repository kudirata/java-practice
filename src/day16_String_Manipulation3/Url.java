package day16_String_Manipulation3;

import java.util.Scanner;

public class Url {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//www.amazon.com
				//com, net, edu, org, gov
				
				//- check it contains the ending dot right before the extension
				//- assign String domain and 
				//String extension.
				//- print them
				 //   "Domain:" amazon
				  //  "Extension:" com 
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter url:");
		String url = scan.next();
		
		//- check that it starts with www.
		
		if (url.startsWith("www.")) {
			System.out.println("www. is present");
			
		}else   {
			System.out.println("Invalid url format");
			return;
		}
		
		//- check it contains the ending dot right before the extension
		// find out length of url
		// do -4 from last charAT xter
		// compare if it '.'
		
		int dotIndex = url.length() - 4;
		
		if (url.charAt(dotIndex) == '.' ) {
			System.out.println(" . is there before extension");
		}else {
			System.out.println(" . might be misplaced");
		}
		
		
		// get domain string extension
		
		String domain = url.substring(4, dotIndex);
		System.out.println("Domain: "+ domain);
		String extension = url.substring(dotIndex + 1, url.length());
		
		System.out.println("Extension: "+ extension);
		
		
		
	}

}
