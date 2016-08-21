import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		try {
			str = br.readLine();
			getRandom(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
