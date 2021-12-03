package company;

public class Count_ing {
public static void main(String[] args) {
	String[] s1={"Reading","Studing","Booking","singing","dancing"};
	int count=0;
	for (int i = 0; i < s1.length; i++) {
		String s2=s1[i];
	if(s2.substring(s2.length()-3).contains("ing"))
	{
		count++;
	}
	}
	System.out.println(count);
	
	
}
}
