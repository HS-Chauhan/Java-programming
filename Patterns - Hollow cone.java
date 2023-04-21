public class hollowCone{
  
  public static void main(String[] args){
        
      int n=5;
			for(int row=1;row<=n;row++) {
				for(int col=1;col<=row-1;col++) {
					System.out.print(" ");
				}
				for(int col=1;col<=(2*n)-(2*row)+1;col++) {
					if(row==1) {
						System.out.print("*");
					}
					else if(col==1 || col==(2*n)-(2*row)+1) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
    
  }
}  
