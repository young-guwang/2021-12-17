# 시간 
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String x;
		int y;
	
		x = s.nextLine();
		y = s.nextInt();
		
		StringTokenizer T = new StringTokenizer(x," ");
		
		int nh = Integer.parseInt(T.nextToken());
		int nm = Integer.parseInt(T.nextToken());
		int ns = Integer.parseInt(T.nextToken());
		
		nh = nh+(y/60/60);
		nm = nm +(y/60);
		ns = ns+(y%60);
		
		if (ns>=60) {
			ns = ns-60;
			nm++;}
		
		if(nm>=60) {
			int wfwf = nm/60;
			nm = nm % 60;
			nh = nh+ wfwf;
		}
		
		System.out.println(nh+" "+nm+" "+ns);
	}
}

