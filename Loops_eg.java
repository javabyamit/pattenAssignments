package loops;

public class Loops_eg {

	public static void main(String[] args) {
		// int i; int n = 5;
		
	/*	for(int j =0; j<n; j++) {
			for(i=0;i<n;++i) {
				if( i==0||i==4|| j==0|| j==4){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				}
			
				System.out.println( );
		} */
		
		
		/*  for( i = 0; i<n;i++) {
				System.out.print("*");
				
			}
		*/
		
		
		//while loops
		
		/*int i=0; int n =5;
		while(i<n) {
			
			System.out.print("*");
			i++;
		}
		*/
		
		//do-while loops
		
		/*int i=0; int n=5;
		
		do{
			System.out.print("*");
			i++;
		}while(i<n);
		
		*/
		
		
			
				// Square box:- i==0||i==(n-1) || j==0 ||j==(n-1)
				//H:- i==(n-1)/2 ||j==0 ||j==(n-1
				//===================================================
				//T:- i==0 || j==(n-1)/2 
				//=================================================
				//E:- j==0|| i==0 || i==(n-1)||i==(n-1)/2
				//====================================================
				//A:- j==0 && i>0||i==0 && j>0 && j<(n-1)/2||
				//	  i==(n-1)/2 && j<=(n-1)/2 || j==(n-1)/2 && i>0
				
				//===================================================
				// D:- i==0 && j<(n-1) ||j==0 || 
				//	   i==(n-1) && j<(n-1)||
				//     j==(n-1) && i>0 && i<(n-1)
				//==================================================
				//O;- errror i==0 && j>0 && j<(n-1) || j==0 && i>0 ||
				//			 i==(n-1)&& j<(n-1)|| j==(n-1) && i>0 && i<(n-1)
				//==============================================
				//B :-i==0 && j<(n-1)/2  ||
				//	i==(n-1)/2 && j<(n-1)/2||
				//	i==(n-1) && j<(n-1)/2||
				//	j==0|| j==(n-1)/2 && i>0 && i<(n-1)/2 ||
				//	j==(n-1)/2 && i>(n-1)/2 && i<(n-1)
				//I:- i==0 || j==(n-1)/2	||i==(n-1)
				//===========================================
				//O:-i==0 && j>0 && j<(n-1)/2||
				//   i==(n-1)/2 && j>0 && j<(n-1)/2||
				 //  j==0 && i>0 && i<(n-1)/2|| 
				 //  j==(n-1)/2 && i>0 && i<(n-1)/2
				//=========================================================
				//G:-(i==0 &&j>0 && j<(n-1)||
				// 	(j==0 && i>0 && i<(n-1))||
				//	(i==(n-1) && j>0 && j<=(n-1)/2)||
				//	(i==(n-1)/2 &&j>=(n-1)/2 && j<(3*n)/4)||
				//	(j==(n-1)/2 && i>(n-1)/2 )||
				//	(j==(3*n)/4 && i>=(n-1)/2))
				//==============================================================
			
				//I

			int i,j,n=13;
			
			for(i = 0; i<n;i++){
				for(j=1;j<n;j++) {
					
					if(i==0 || j==(n-1)/2	||i==(n-1)
								) {
						System.out.print("=");
						}else {
							System.out.print(" ");
						}
				}
				System.out.print("  ");
				
				//N
				for(j=0;j<n;j++) {
					if(j==0 && i<=n-1||
						i==j && j<(n-1)||
						j==(n-1)
								) {
						System.out.print("_");
						}else {
							System.out.print(" ");
						}
				}
				
				
				System.out.print("  ");
				//E
				for(j=0;j<n;j++) {
					if(j==0&& j<=(n-1)|| i==0 && j<(3*n)/4 ||
					   i==(n-1)&& j<(3*n)/4||i==(n-1)/2 && j<(3*n)/4
								) {
						System.out.print("=");
						}else {
							System.out.print(" ");
						}
				}
		
				
				//U
				for(j=0;j<n;j++) {
					if(j==0&& i<(n-1)||
						i==(n-1)&&j>0&& j<(n-1)||
						j==(n-1) && i<(n-1) 
								) {
						System.out.print("-");
						}else {
							System.out.print(" ");
						}
				}
				
				
				System.out.print("  ");
				
				
				//R
				for(j=0;j<n;j++) {
					if(	i==0 && j<(3*n)/4 ||
						j==0 && i<=(n-1) ||
						i==(n-1)/2 && j<(3*n)/4 ||
						i-j==(n-1)/2 ||
						j==(3*n)/4 && i>0 &&i<(n-1)/2
							) {
						System.out.print("=");
						}else {
							System.out.print(" ");
						}
				}
				
				
				System.out.print("  ");
				//O
				for(j=0;j<n;j++) {
					if(i==0 && j>0 && j<(n-1)||
					   i==(n-1) && j>0 && j<(n-1)||
					   j==0 && i>0 && i<(n-1)|| 
					   j==(n-1) && i>0 && i<(n-1)
								) {
						System.out.print("-");
						}else {
							System.out.print(" ");
						}
				}
				
				
				System.out.print("  ");
				
				//N
				for(j=0;j<n;j++) {
					if(j==0 && i<=n-1||
						i==j && j<(n-1)||
						j==(n-1)
								) {
						System.out.print("=");
						}else {
							System.out.print(" ");
						}
				}
				
				
				System.out.print(" ");
				
				for(j=0;j<n;j++) {
					if( i+j==(n-1)/2  ||
							i-j==(n-1)/2||j-i==(n-1)/2||
							i+j==(n)+((n-1)/2)-1||
							i==0||j==0||j==(n-1)||i==(n-1)||
							i==j||i+j==(n-1)
							) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						}
				}
				System.out.print(" ");
				
				
				//======================================================================
				System.out.print("  ");
				
				
			System.out.println();
		}
			
		
	}

}
