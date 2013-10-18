package general;


class TestObj {
	
	public static void main(String[] args) {
		//System.out.println("reverse: " + rev("hello"));
		System.out.println(reverseString("hello"));
	}

	public static String reverseString(String s){
		//System.out.println(s);
	    if (s.length() == 0) 
	         return s;
	    
	    return reverseString(s.substring(1)) + s.charAt(0);
	}
}
