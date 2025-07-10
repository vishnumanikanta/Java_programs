package strings;

public class pascal_case {

	public static void main(String[] args) {
	String str="nani  qwert ui";
	String[] words=str.split(" ");
	StringBuilder res=new StringBuilder() ;
for(String word:words) {
	if(!word.isEmpty()) {
		res.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase());
		
	}
	
}
System.out.println(res);
	}

}


// think it as string has spaces split by using splitmethod assign to the words string res as string buikder
// use append to upper andd lower case case 