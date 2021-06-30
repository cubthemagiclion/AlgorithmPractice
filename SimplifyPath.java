package src;
import java.util.*;

public class SimplifyPath {

	public SimplifyPath() {
		// TODO Auto-generated constructor stub
	}
    public String simplifyPath(String path) {
        //corner case
    	Stack<String> s = new Stack<>();
    	if(path == "" || path.length() == 0)
    		return "";
    	for(String c : path.split("/")) {
    		if(c.equals("..")) {
    			if(!s.isEmpty())
    				s.pop();
    			continue;
    		}
    		if(c.equals(".") || c.equals("/") || c.equals(""))
    			continue;
    		s.push(c);
    	}
    	String result = "";
    	while(!s.isEmpty())
    		result = "/" + s.pop() + result;
    	return !result.isEmpty() ? result : "/";
    }
	public static void main(String[] args) {
		String b = "/home/";
		SimplifyPath a = new SimplifyPath();
		System.out.print(a.simplifyPath(b));
		// TODO Auto-generated method stub

	}

}
