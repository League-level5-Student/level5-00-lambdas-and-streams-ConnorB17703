package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
		
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s) -> {
			String reverse = "";
			for(int i = s.length()-1; 0<=i; i--){
				reverse += s.charAt(i);
			}
			System.out.println(reverse);
			
		}, "backwards");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s) -> {
			String mix ="";
			for(int i = 0; i < s.length(); i++){
				if(i%2 == 0){
					Character c = Character.toUpperCase(s.charAt(i));
					mix += c;
				}
				else{
					mix += s.charAt(i);
				}
				
			}
			System.out.println(mix);
			
		}, "capitalization");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)-> {
			String newString = "";
			for(int i =0; i<s.length(); i++){
				if(i != 0){
					newString += ".";
					newString += s.charAt(i);
				}
				else{
					newString += s.charAt(i);
				}
				//System.out.println(newString);
			}
			
			System.out.println(newString);
			
		}, "period");
		
		
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s) -> {
			String newString = "";
			for(int i =0; i<s.length(); i++){
				if(s.charAt(i) != 'a' && s.charAt(i) != 'A' && s.charAt(i) != 'e' && s.charAt(i) != 'E' && s.charAt(i) != 'i' && s.charAt(i) != 'I' && s.charAt(i) != 'o' && s.charAt(i) != 'O' && s.charAt(i) != 'u' && s.charAt(i) != 'U'){
					newString += s.charAt(i);
				}
				
				
			}
			System.out.println(newString);
		
		}, "vowels");
		
		
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
