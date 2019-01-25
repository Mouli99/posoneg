import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringRemove {
	 public static int findShort(String s1) {
		 String[] a=s1.split(" ",s1.length());
		 int i=0;
		 int[] intArr=new int[s1.length()];
		 for(String b:a) {
			 int len=b.length();
			 intArr[i]=len;
			 i++;
			// System.out.println(len);
		 }
		 Arrays.sort(intArr);
		 for(int i1=0;i1<intArr.length;i1++) {
			 //System.out.println(intArr[i1]);
			 if(intArr[i1]>0) {
				 return intArr[i1];
			 }
			
		 }
		 return 0;
		 
	        }
	     
	 
public static void  main(String[] args) {
int a=findShort("turns out random test cases are easier than writing out basic ones");
System.out.println(a);
}
}
