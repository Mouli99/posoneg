import java.util.Arrays;

public class Kata {

	     public static void main(String []args){
	    	 String[] s1 = new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
	         String[] s2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
	         int a=mxdiflg(s1, s2); // 13
	         System.out.println(a);
	         
	     }
	    
	     public static int mxdiflg(String[] a1, String[] a2) {
	    	 if(a1.length==0 ||a2.length==0) {
	    		 return -1;
	    	 }
	    	 int[] s1 = new int[a1.length];
	    	 for(int i=0;i<a1.length;i++) {
	    		 s1[i]=a1[i].length();
	    	 }
	    	 
	    	 int[] s2 = new int[a2.length];
	    	 for(int i=0;i<a2.length;i++) {
	    		 s2[i]=a2[i].length();
	    	 }
	         Arrays.sort(s1);
	         Arrays.sort(s2);
	    	 int a=s1[0]-s2[s2.length-1];
	    	 int b=s2[0]-s1[s1.length-1];
	    	 if(a<0) {
	    		 a=-(a);
	    	 }
	    	 if(b<0) {
	    		 b=-(b);
	    	 }
	    	 if(a>b) {
	    		 return a;
	    	 }
	    	 return b;
	     }
}
