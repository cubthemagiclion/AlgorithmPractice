package src;
import java.util.*;

public class GenerateDocument {

	public GenerateDocument() {
		// TODO Auto-generated constructor stub
	}
	public boolean generateDocument(String characters, String document) {
		Hashtable<Character, Integer> res = new Hashtable<>();
		for(int i = 0; i<characters.length(); i++) 
			res.put(characters.charAt(i), res.getOrDefault(characters.charAt(i), 0)+ 1);
		
		for(int i = 0; i<document.length(); i++) 
			res.put(document.charAt(i), res.getOrDefault(document.charAt(i), 0) - 1);
		
		for(Map.Entry<Character, Integer> entry:res.entrySet()) {
			if(entry.getValue() < 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		String a = "Bste!hetsi ogEAxpelrt";
		String b = "AlgoExpert is the Best!";
		GenerateDocument k = new GenerateDocument();
		k.generateDocument(a, b);
		// TODO Auto-generated method stub

	}

}
