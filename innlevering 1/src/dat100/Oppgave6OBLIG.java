package dat100;

public class Oppgave6OBLIG {

	public static void main(String[] args) {
		int n=4;

		int svar= fakulitet(n);
		System.out.println(n+"! = "+svar);
	}

	private static int fakulitet(int n){
		int op=1;
		for (int i=1;i<=n;i++) {
			op*=i;
		}
		return op;
	}
}