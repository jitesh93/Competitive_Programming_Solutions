import java.util.Scanner;

class CPTTRN3 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
			int l=in.nextInt();
			int c=in.nextInt();
			for(int i=0;i<(3*l)+1;i++) {
				for(int j=0;j<(3*c)+1;j++) {
					if(i%3!=0) {
						if(j%3==0) {
							System.out.print("*");
						}
						else {
							System.out.print(".");
						}
					}
					else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
