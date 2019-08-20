public class RunLeftEncoding {
	public static String encode(String txt){
		String ret = "";
		int cpt = 1;
		char last = txt.charAt(0);
		for(int i=1;i<txt.length();i++){
			char current = txt.charAt(i);
			if(current==last){
				cpt++;
				if(i==txt.length()-1)
					ret += cpt+""+current;
			}
			else{
				ret += cpt+""+last;
				cpt=1;
				if(i==txt.length()-1)
					ret += cpt+""+current;
			}
			last = current;
		}
		return ret;
	}
	
	public static String decode(String txt){
		String ret = "";
		String nb = "";
		for(int i=0;i<txt.length();i++){
			char current = txt.charAt(i);
			if(Character.isDigit(current)){
				nb += current;
			}
			else{
				if(!nb.equals("")){
					for(int j=0;j<Integer.valueOf(nb);j++)
						ret += current; 
					nb = "";
				}
			}
		}
		return ret;
	}
	
	
	public static void main(String[] args) {
		System.out.println(encode("ACCCCCXXXXXXXXXXXXDDDDDDDDDDDDDDD"));
		System.out.println(decode("1T30s"));
	}
}