package InClassExample;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reverse = "";
		String str = "hello guys i am learning";
		String []reverse1 = str.split(" ");
		for(int i = reverse1.length-1; i >= 0; i-- ) {
			reverse += reverse1[i]+" ";
		}
		System.out.println(reverse);
	}

}
