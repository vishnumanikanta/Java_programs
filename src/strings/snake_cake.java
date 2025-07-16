package strings;

public class snake_cake {

	public static void main(String[] args) {
		String str="nani  qwert ui";
		String[] words = str.trim().split("\\s+");
		StringBuilder res=new StringBuilder() ;
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			if(!word.isEmpty()) {
			
				res.append(words[i].toLowerCase());
				 if (i != words.length - 1) {
                   res.append("_");
                }
			 
			
			}
		}
		System.out.println(res);
			

	}

}
