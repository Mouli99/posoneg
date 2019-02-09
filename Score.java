
public class Kata {
	public static void main(String[] args) {
		int a = points(new String[] {"1:0","2:0","3:0","4:4","2:2","3:3","1:4","2:3","2:4","3:4"});
		System.out.println(a);
	}

	 public static int points(String[] games) {
	      //implement me
	      int count=0;
	      for(int i=0;i<games.length;i++){ 
	      String a=games[i];
	      String[] list =a.split(":"); 
	      int x=Integer.parseInt(list[0]);
	      int y=Integer.parseInt(list[1]);
	      if(x>y) {
	    	count+=3;  
	      }
	      else if(x<y) {
	    	 
	      }
	      else if(x==y) {
	    	  count+=1;
	      }
	      }
	      return count;
	    }
}
