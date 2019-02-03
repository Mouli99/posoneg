import java.util.Arrays;

public class Kata {

	     public static void main(String []args){
	    	 double[] x = new double[] {0.0, 0.18, 0.36, 0.54, 0.72, 1.05, 1.26, 1.47, 1.92, 2.16, 2.4, 2.64, 2.88, 3.12, 3.36, 3.6, 3.84};
	         int a=gps(20, x);
	         System.out.println(a);
	     }
	     public static int gps(int s, double[] x) {
	    	 double[] x1=new double[x.length-1];
	    	 for(int i=0,j=1;i<x.length-1;i++,j++) {
	    		 double a=x[j]-x[i];
	    		 double b=(a*3600)/s;
	    		 x1[i]=b;
	    	 }
	    	 Arrays.sort(x1);
	    	 for(int i=0;i<x1.length;i++) {
	    		 System.out.println(x1[i]);
	    	 }
	    	 int c=(int)x1[x1.length-1];
	    	 return c;
	}
}
