package general;
import java.util.Arrays;

public class NextHighest {

	public static void main(String[] args) {
		System.out.println("next highest integer is: " + nextH(15432));
		System.out.println("next highest integer is: " + nextH(798334));
		System.out.println("next highest integer is: " + nextH(11111));
		System.out.println("next highest integer is: " + nextH(1));
	}

	public static int nextH(int i) {
		int org = i; //original number
		
		//converting number to array of digits
		int[] num = new int[(i + "").length()];
		
		if(num.length ==1){
			return org;
		}
		
		int z = (i + "").length() - 1;
		while (i > 0) {
			num[z] = i % 10;
			i = i / 10;
			z--;
		}

		int len = num.length;

		int lastIndex = len - 1;
		int lastDigit = num[lastIndex];
		int before = 1;
		
		while (lastIndex >= 0) {
			/*System.out.println("in first while: lastDigit before lastIndex"+
					lastDigit+" "+before+" "+lastIndex);*/
			lastDigit = num[lastIndex];
			while (lastIndex - before >= 0) {				
				/*System.out.println("in second while: lastDigit before lastIndex"+
						lastDigit+" "+before+" "+lastIndex);*/
				if (lastDigit > num[lastIndex - before]) { //found first position to swap
					/*System.out.println("before swappin'    last and before:  "+ 
							lastDigit+" "+num[lastIndex - before]);*/
					num[lastIndex - before] = num[lastIndex - before] + num[lastIndex];
					num[lastIndex] = num[lastIndex - before] - num[lastIndex];
					num[lastIndex - before] = num[lastIndex - before] - num[lastIndex];
					//after swappin'
					/*System.out.println("after swappin' "+
							num[0]+""+num[1]+""+num[2]+""+num[3]+""+num[4]+""+num[5]+"");*/
					//sorting rest of the digits in ascending order to get *least* possible number
					Arrays.sort(num, (lastIndex - before)+1, len);
					
					String sb = "";
					for(int x=0; x<num.length; x++){
						sb = sb + ""+ num[x];
					}
					//System.out.println(sb);
					return Integer.valueOf(sb);
				} else {
					before++;
				}
			}
			lastIndex--;

		}
		return org;
	}

}
