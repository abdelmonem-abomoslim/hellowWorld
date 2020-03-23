package test;


public class Test {

	public static void main(String[] args) {
		
		String sentence = "The quick brown fox jumps over the lazy dog.";
		boolean isPangram = true;
		char[] alpha = new char[26];
		char[] alphaU = new char[26];
			for(int i = 0; i < 26; i++){
			    alpha[i] = (char)(97 + i);
			    alphaU[i] = (char)(65 + i);
			    //System.out.println(alpha[i]);
			    if(!sentence.contains(String.valueOf(alpha[i])) && !sentence.contains(String.valueOf(alphaU[i]))) {
			    	isPangram = false;
			    	System.out.println("sentence doesn't contain "+String.valueOf(alpha[i])+" or "+ String.valueOf(alphaU[i]));
			    }
			}
			
			if(isPangram)
				System.out.println("sentence is Pangram");
	}

}
