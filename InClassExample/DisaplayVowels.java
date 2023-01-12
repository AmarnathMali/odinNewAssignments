package InClassExample;

public class DisaplayVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "education";
         displayVowels(str);
	}

	public static void displayVowels(String str) {
		// TODO Auto-generated method stub
		for(int i = 0; i < str.length(); i++) {
		    char ch = str.charAt(i);
		    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		    	System.out.print(ch+", ");
		    }
		}
	}

}
