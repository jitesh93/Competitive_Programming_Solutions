import java.util.Scanner;

class CPTTRN4 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0) {
			int l=in.nextInt();
			int c=in.nextInt();
			int h=in.nextInt();
			int w=in.nextInt();
			int x=0,y=0;
			for(int i=0;i<(l+1)+(h*l);i++) {
				for(int j=0;j<(c+1)+(w*c);j++) {
					if(x==0) {
						System.out.print("*");
					}
					else {
						if(y==0) {
							System.out.print("*");
						}
						else {
							System.out.print(".");
						}
						y++;
						if(y>w) {
							y=0;
						}
					}
				}
				System.out.println();
				x++;
				if(x>h) {
					x=0;
				}
				y=0;
			}
			System.out.println();
		}
	}
}
