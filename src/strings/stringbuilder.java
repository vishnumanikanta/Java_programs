package strings;

public class stringbuilder {

	public static void main(String[] args) {
	StringBuilder sb =new StringBuilder("nani");
	System.out.println(sb);
//	charat
	System.out.println(sb.charAt(2));
//	set charat
	sb.setCharAt(0, 'M');
	System.out.println(sb);
//	insert
	sb.insert(0, 'm');
	System.out.println(sb);
//	delete
	sb.delete(0, 1);
	System.out.println(sb);
	
//	append
	sb.append("68");
	System.out.println(sb);
	System.out.println(sb.length());
	
//	reverse
	
	for(int i=0; i<sb.length()/2;i++) {
		int front=i;
		int back=sb.length()-1-i;
		char frontchar=sb.charAt(front);
		char backchar=sb.charAt(back);
		sb.setCharAt(front, backchar);
		sb.setCharAt(back, frontchar);
		
	}
	System.out.println(sb);
	}

	
}
