
public class Count_Repeated_char {

	public static void main(String[] args) {
		String s ="Hello Bhuvana";
		int count=0;
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s.length();j++) {
			if(s.charAt(i)==s.charAt(j)) {
				count+=1;
				
			}
		}
		}
		
		System.out.println(count);
		

	}

}
