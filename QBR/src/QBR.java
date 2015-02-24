import java.util.Scanner;

public class QBR {
	Scanner data_input = new Scanner(System.in);

	public static void main(String[] args) {
		double comp;
		double Yards;
		double ATT;
		double INT;
		double TD;
		Scanner data_input = new Scanner(System.in);
		System.out.print("Number of Touchdowns: ");
		TD = data_input.nextDouble();
		System.out.print("Number of Interceptions: ");
		INT = data_input.nextDouble();
		System.out.print("Number of Passes Attempted: ");
		ATT = data_input.nextDouble();
		System.out.print("Number of Yards: ");
		Yards = data_input.nextDouble();
		System.out.print("Number of Completions: ");
		comp = data_input.nextDouble();
		data_input.close();
		float a;
		a = (float) ((((comp / ATT) * 100) - 30) * 0.05);
		System.out.println(a);
		float b;
		b = (float) (((Yards / ATT) - 3) * .25);
		System.out.println(b);
		float c;
		c = (float) (((TD / ATT) * 100) * 0.2);
		System.out.println(c);
		float d;
		d = (float) (2.375 - (((INT / ATT) * 100) * 0.25));
		System.out.println(d);
		double Total_rate;
		Total_rate = ((a + b + c + d) / 6) * 100;
		System.out.println(a + b + c + d);
		System.out.println((a + b + c + d) / 6);
		System.out.println("The quarter back overall rating is: " + Total_rate);
	}
}