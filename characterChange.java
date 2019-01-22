import java.util.Arrays;


class StringRemove {
    static String findChildren(final String text) {
    	char tempArray[]=text.toCharArray();
    	
    	for(int i=0;i<tempArray.length;i++) {
    		if(tempArray[i]<97) {
    		tempArray[i]+=32;
    	}
    	}
    	if(tempArray.length!=0) {
    	Arrays.sort(tempArray);
    	int a=(int) tempArray[0];
    	
    	for(int i=0;i<tempArray.length;i++) {
       		if(a!=(int)tempArray[i]) {
    		int j=(int)tempArray[i];
    		tempArray[i]-=32;
    		a=j;
    		}
    	}
    	tempArray[0]-=32;
    	return new String(tempArray);
    	}
    	return "";
    }
    public static void main(String[] args) {
    	String a=findChildren("");
    	System.out.println("String is "+a);
    }
}
