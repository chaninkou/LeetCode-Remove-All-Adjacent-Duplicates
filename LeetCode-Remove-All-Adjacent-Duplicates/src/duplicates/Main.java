package duplicates;

public class Main {
	public static void main(String[] args){
		String input = "abbaca";
		
		System.out.println("Input: " + input);
		
		RemoveDuplicatesSolution solution = new RemoveDuplicatesSolution();
		
		System.out.println("Output: " + solution.removeDuplicates(input));
	}
	
}
