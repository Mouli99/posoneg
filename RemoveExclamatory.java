public class Kata {

	     public static void main(String []args){
	        String a=remove("Hii..!!!",2);
	        System.out.println(a);
	     }
	  public static String remove(String s, int n){
	  String a="";
	  for(int i=s.length()-1;i>=0;i--){
	  a+=s.charAt(i);
	  }
	  for(int i=0;i<n;i++){
	  a=a.replaceFirst("!","");
	  }
	  String b="";
	  for(int i=a.length()-1;i>=0;i--){
	  b+=a.charAt(i);
	  }
	  return b;
	  }
	}
