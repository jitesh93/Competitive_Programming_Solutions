import java.util.Scanner;

class CPTTRN1 {
	public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			int t=in.nextInt();
			while(t-->0){
				int l=in.nextInt();
				int c=in.nextInt();
				for(int i=0;i<l;i++){
					for(int j=0;j<c;j++){
						if((i%2==0 && j%2==0) || (i%2!=0 && j%2!=0)){
							System.out.print("*");
						}
						else{
							System.out.print(".");
						}
					}
					System.out.println();
				}
				System.out.println();
			}
			in.close();
	}
}
