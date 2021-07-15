
public class Encrypoter {

	public Encrypoter() {
		// TODO Auto-generated constructor stub
	}
	  public static String caesarCypherEncryptor(String str, int key) {
			String result = "";
				for(char c : str.toCharArray()) {
					int number = (int)c + key;
					if(number > (int)'z')
						number = (number - (int)'a') % 26 + 97;
					char back = (char) number;
					result += ("" + back);
				}
		    return result;
	  }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "xyz";
		Encrypoter b = new Encrypoter();
		System.out.print(b.caesarCypherEncryptor(a, 2));
	}

}
