import java.util.Scanner;
public class StringPanagram {
public static void main(String[] args) {
	//String input
	Scanner s=new Scanner(System.in);
	System.out.println("Please enter a string");
	String str=s.nextLine().toLowerCase();;
	//convert string to char array
	char c[]=str.toCharArray();
	int count=0;
	for(char i='a';i<='z';i++) {
		boolean isPanagram=false;
		for(char j=0;j<c.length;j++) {
			if(i==c[j]) {
				isPanagram=true;
				break;
			}
		}
		if(isPanagram==true) {
			count++;
		}
	}
	if(count==26) {
		System.out.println("given string is panagram");
	}
	else {
		System.out.println("sring is not a panagram");
	}
}

}
