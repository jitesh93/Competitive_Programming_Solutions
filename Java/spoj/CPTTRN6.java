import java.util.Scanner;

class CPTTRN6 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0) {
			int l=in.nextInt();
			int c=in.nextInt();
			int h=in.nextInt();
			int w=in.nextInt();
			int x=0,y=w;
			for(int i=0;i<l+(h*(l+1));i++) {
				y=w;
				for(int j=0;j<c+(w*(c+1));j++) {
					if(x==h) {
						if(j==y) {
							System.out.print("+");
							y=y+(w+1);
						}
						else {
							System.out.print("-");
						}
					}
					else {
						if(j==y) {
							System.out.print("|");
							y=y+(w+1);
						}
						else {
							System.out.print(".");
						}
					}
				}
				System.out.println();
				x++;
				if(x>h) {
					x=0;
				}
			}
			System.out.println();
		}
		in.close();
	}
}
