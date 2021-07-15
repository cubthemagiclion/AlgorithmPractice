
public class RunLengthEncoding {

	public RunLengthEncoding() {
		// TODO Auto-generated constructor stub
	}
	  public String runLengthEncoding(String string) {
			int left = 0;
			char pre = string.charAt(left);
			String res = "";
			for(int i = 1; i < string.length(); i++) {
				if (!(string.charAt(i) == pre)) {
					int num = i - left;
					while (num > 9) {
						res += ("9" + pre);
						num -= 9;
					}
					res += (num + "" + pre);
					left = i;
				}
				pre = string.charAt(i);
			}
			
					int num = string.length() - left;
					while (num > 9) {
						res += ("9" + pre);
						num -= 9;
					}
					res += (num + "" + pre);

	    return res;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
