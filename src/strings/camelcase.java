package strings;

public class camelcase {

	public static void main(String[] args) {
		String str="nani  qwert ui";
		String[] words=str.split(" ");
		StringBuilder res=new StringBuilder() ;
		for(int i=0;i<words.length;i++) {
		String word=words[i];
			if(!word.isEmpty()) {
			if (i!=' ') {
                    res.append(word.toLowerCase());
                }
			else {
				res.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase());
			}
			}
		}
		System.out.println(res);
			}

}
