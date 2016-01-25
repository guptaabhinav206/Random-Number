import java.util.Random;
import static java.lang.System.*;

class Main {

	public static void main(String[] args) {
	
		String str = "Abhinav";
		getRandom(str);
	}
	
	// Generating random number between 6 and 15 (both exclusive)
	public static void getRandom(String name){
		
		Random r = new Random();
		int low = 7;  
		int high = 15;
		int ans = r.nextInt(high-low) + low;
		
		out.println(name+" "+ans);
		
	}

}
