package myproject;

public class Break_and_Continue {
	public static void main(String[] args) {
		//break
		for (int i=0;i<=10;i++) {
			System.out.println(i);
			if(i == 6) {
				break;
			}
		}
		//continue
		for (int i=0;i<=10;i++) {
			System.out.println(i);
			if(i == 6) {
				continue;
			}
		}
	}
}
