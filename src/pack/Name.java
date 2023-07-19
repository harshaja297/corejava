package pack;

public class Name {

	public static void main(String[] args) {
		
		int n= 5;
		//D
		for(int i = 0; i<n ; i++ ) {
			for(int j = 0; j<n; j++) {
				if(j==0 || i==0 || j== n-1 || i==n-1 )
				System.out.print(TextDec.WHITE+TextDec.BOLDGREEN+"* ");
				else
					System.out.print("  ");
			}
			//H
			System.out.print(" ");
			for(int j = 0; j<n; j++) {
				if(j==0||j== n-1 || i== (n-1)/2)
				System.out.print("* ");
				else
					System.out.print("  ");
			
			
		}//o
			System.out.print(" ");
			for(int j = 0; j<n; j++) {
				if(j==0 || i==0 || j== n-1 || i==n-1)
				System.out.print("* ");
				else
					System.out.print("  ");
			
			
		}//N
			
			System.out.print(" ");
			for(int j = 0; j<n; j++) {
				if(j==0 || i==j|| j==n-1)
				System.out.print("* ");
				else
					System.out.print("  ");
			
		
	}
			System.out.print("  ");
			for(int j = 0; j<n; j++) {
				if(i==0||j==(n-1)/2||i==n-1)
				System.out.print("* ");
				else
					System.out.print("  ");
	
}
			System.out.println(" ");
			
}
	}	}
