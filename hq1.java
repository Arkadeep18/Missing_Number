
public class hq1 {

	public static void main(String[] args) {
	
		for(int a=1;a<=5;a++) {
			for(int  b=5;b>=1;b--) {
				if(a==b)
				{
					System.out.print("* ");
				}else {
					System.out.print(b+" ");
				}
			}
			System.out.println();
		}

	}

}