import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata {

	public static void main(String[] args) {
		String a = travel(
				"123 Main Street St. Louisville OH 43071,432 Main Long Road St. Louisville OH 43071,786 High Street Pollocksville NY 56432,"
						+ "54 Holy Grail Street Niagara Town ZP 32908,3200 Main Rd. Bern AE 56210,1 Gordon St. Atlanta RE 13000,"
						+ "10 Pussy Cat Rd. Chicago EX 34342,10 Gordon St. Atlanta RE 13000,58 Gordon Road Atlanta RE 13000,"
						+ "22 Tokyo Av. Tedmondville SW 43098,674 Paris bd. Abbeville AA 45521,10 Surta Alley Goodtown GG 30654,"
						+ "45 Holy Grail Al. Niagara Town ZP 32908,320 Main Al. Bern AE 56210,14 Gordon Park Atlanta RE 13000,"
						+ "100 Pussy Cat Rd. Chicago EX 34342,2 Gordon St. Atlanta RE 13000,5 Gordon Road Atlanta RE 13000,"
						+ "2200 Tokyo Av. Tedmondville SW 43098,67 Paris St. Abbeville AA 45521,11 Surta Avenue Goodtown GG 30654,"
						+ "45 Holy Grail Al. Niagara Town ZP 32918,320 Main Al. Bern AE 56215,14 Gordon Park Atlanta RE 13200,"
						+ "100 Pussy Cat Rd. Chicago EX 34345,2 Gordon St. Atlanta RE 13222,5 Gordon Road Atlanta RE 13001,"
						+ "2200 Tokyo Av. Tedmondville SW 43198,67 Paris St. Abbeville AA 45522,11 Surta Avenue Goodville GG 30655,"
						+ "2222 Tokyo Av. Tedmondville SW 43198,670 Paris St. Abbeville AA 45522,114 Surta Avenue Goodville GG 30655,"
						+ "2 Holy Grail Street Niagara Town ZP 32908,3 Main Rd. Bern AE 56210,77 Gordon St. Atlanta RE 13000",
				"OH 43071");
		System.out.println(a);
	}

	public static String travel(String r, String zipcode) {
		if(zipcode.length()<8) {
			return zipcode+":/" ;
		}
		String res="";
		List<String> cityList = Arrays.asList(r.split(","));
		List<String> addressList = new ArrayList<String>();
		List<String> nameList = new ArrayList<String>();
		for (int i = 0; i < cityList.size(); i++) {
			if (cityList.get(i).contains(zipcode)) {
				
				addressList.add(cityList.get(i));
			}
		}
		for (int i = 0; i < addressList.size(); i++) {
			//System.out.println(addressList.get(i));
		}
		res+=zipcode+":";//System.out.print(zipcode+":");
		for(int i=0;i<addressList.size();i++) {
			String a=addressList.get(i);
			nameList=Arrays.asList(a.split(" "));
			for(int i1=1;i1<nameList.size()-2;i1++) {
				
				res+=nameList.get(i1);//System.out.print(nameList.get(i1));
				if(i1<nameList.size()-3) {
					res+=" ";//System.out.print(" ");
				}
				
			}
			if(i<addressList.size()-1) {
			res+=",";//System.out.print(",");
			}
			
		}
		res+="/";//System.out.print("/");
		for(int i=0;i<addressList.size();i++) {
			String a=addressList.get(i);
			nameList=Arrays.asList(a.split(" "));
			for(int i1=0;i1<1;i1++) {
				
				res+=nameList.get(i1);//System.out.print(nameList.get(i1));
				/*
				 * if(i1<nameList.size()-1) { System.out.print(" "); }
				 */
				
			}
			if(i<addressList.size()-1) {
			res+=",";//System.out.print(",");
			}
			
		}
		
		
		return res;
	}

}
