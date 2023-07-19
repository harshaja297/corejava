package pack;
import java.util.*;
class MyName// MY NAME IN STARS
{
	
	public static void space() {
		System.out.print("    ");
	}
	
	public static void pattern(int randomNumber) {
	//	System.out.print(TextDec.REDBG+"  "+TextDec.CYANBG);
		System.out.print(arraysOfBG[randomNumber]
				+"  "+TextDec.BLACKBG);
	}
	
	public static void bg() {
		System.out.print("  ");
	}
	public static void duration() throws InterruptedException{
		Thread.sleep(1);
	}
	
	public static String arraysOfColors[]= {TextDec.BOLDBLACK, TextDec.BOLDBLUE, TextDec.BOLDRED, TextDec.BOLDGREEN, TextDec.BOLDYELLOW, TextDec.BOLDCYAN,TextDec.BOLDPURPLE,TextDec.BLACK, TextDec.BLUE, TextDec.RED, TextDec.GREEN, TextDec.YELLOW, TextDec.CYAN,TextDec.PURPLE,TextDec.LIGHTBLACK, TextDec.LIGHTBLUE, TextDec.LIGHTRED, TextDec.LIGHTGREEN, TextDec.LIGHTYELLOW, TextDec.LIGHTCYAN,TextDec.LIGHTPURPLE};
	public static String arraysOfBG[] = {TextDec.BLUEBG, TextDec.CYANBG,TextDec.LIGHTWHITEBG,TextDec.WHITEBG, TextDec.LIGHTCYANBG, TextDec.LIGHTBLUEBG, TextDec.REDBG, TextDec.YELLOWBG, TextDec.PURPLEBG, TextDec.GREENBG, TextDec.LIGHTGREENBG, TextDec.LIGHTPURPLEBG, TextDec.LIGHTYELLOWBG, TextDec.LIGHTREDBG};
	public static void main(String[]args)throws Exception{
		int n=7,i=0,j=0;

		 Random rand= new Random();
//		 System.out.println(arraysOfColors.length);
		 
		 
		 
		for ( i=0;i<n ;i++ )
		{

		// for H
			for (j=0;j<n ;j++ )
			{
				duration();
				if (j==0||i==n/2||j==n-1)
				{
				int randomNumber= rand.nextInt(arraysOfBG.length-1);
				pattern(randomNumber);	
		//		System.out.print(arraysOfColors[randomNumber]+"* ");
				if (j==n-1)
					{
					MyName.space();
					
					}
				}
				else
				{
					bg();
					if (j==n-1)
					{
						MyName.space();

					}
				}
			}
			

			//for A
			for (j=0;j<n ;j++ )
			{
				duration();
				if(j==(n/2)-i||j==(n/2)+i||j==0&&i>=n/2||j==n-1&&i>=n/2||i==n/2)
				{
					int randomNumber= rand.nextInt(arraysOfBG.length-1);
					pattern(randomNumber);
	//			System.out.print(arraysOfColors[randomNumber]+"* ");
				if (j==n-1)
					{
					MyName.space();
					
					}
				}
				else
				{
					bg();
				if (j==n-1)
					{
					
					MyName.space();
					
					}
				}
			}
			//for R
			for (j=0;j<n ;j++ )
			{
				duration();
				if(i==0||i==n/2||j==0||j==n-1&&i<=n/2||i==j&&i>=n/2)
				{
					int randomNumber= rand.nextInt(arraysOfBG.length-1);
					pattern(randomNumber);
		//		System.out.print(arraysOfColors[randomNumber]+"* ");
				if (j==n-1)
					{
					
					MyName.space();
					}
				}
				else
				{
					bg();
				if (j==n-1)
					{
					MyName.space();
					
					}
				}
			}
			//for S
			for (j=0;j<n ;j++ )
			{
				duration();
				if(i==0||i==n/2||i==n-1||j==0&&i<=n/2||j==n-1&&i>=n/2)
				{
					int randomNumber= rand.nextInt(arraysOfBG.length-1);
					pattern(randomNumber);
		//		System.out.print(arraysOfColors[randomNumber]+"* ");
				if (j==n-1)
					{
					MyName.space();
						
					}
				}
				else
				{
					bg();
				if (j==n-1)
					{
					MyName.space();
					
					}
				}
			}
			// for H
			for (j=0;j<n ;j++ )
			{
				duration();
				if (j==0||i==n/2||j==n-1)
				{
					int randomNumber= rand.nextInt(arraysOfBG.length-1);
					pattern(randomNumber);
			//	System.out.print(arraysOfColors[randomNumber]+"* ");
				if (j==n-1)
					{
					MyName.space();
					
					}
				}
				else
				{
					bg();
				if (j==n-1)
					{
					MyName.space();
					
					}
				}
			}

			//for A
			for (j=0;j<n ;j++ )
			{
				duration();
				if(j==(n/2)-i||j==(n/2)+i||j==0&&i>=n/2||j==n-1&&i>=n/2||i==n/2)
				{
					int randomNumber= rand.nextInt(arraysOfBG.length-1);
					pattern(randomNumber);	
	//			System.out.print(arraysOfColors[randomNumber]+"* ");
				if (j==n-1)
					{
					MyName.space();
					
					}
				}
				else
				{
					bg();
				if (j==n-1)
					{
					MyName.space();
					
					}
				}
			}
			//for V
			for (j=0;j<n ;j++ )
			{
				duration();
				if(i+j==(n-1)+(n/2)||j==n-1&&i<=n/2||i-j==(n-1)-(n/2)||j==0&&i<n/2)
				{
					int randomNumber= rand.nextInt(arraysOfBG.length-1);
					pattern(randomNumber);
			//	System.out.print(arraysOfColors[randomNumber]+"* ");
				if (j==n-1)
					{
					MyName.space();
					}
				}
				else
				{
					bg();
				if (j==n-1)
					{
					MyName.space();
					}
				}
			}
			//for A
			for (j=0;j<n ;j++ )
			{
				duration();
				if(j==(n/2)-i||j==(n/2)+i||j==0&&i>=n/2||j==n-1&&i>=n/2||i==n/2)
				{
					int randomNumber= rand.nextInt(arraysOfBG.length-1);
					pattern(randomNumber);
			//	System.out.print(arraysOfColors[randomNumber]+"* ");
				if (j==n-1)
					{
					MyName.space();
					}
				}
				else
				{
					bg();
				if (j==n-1)
					{
					MyName.space();
					
					}
				}
			}
			//for R
			for (j=0;j<n ;j++ )
			{
				duration();
				if(i==0||i==n/2||j==0||j==n-1&&i<=n/2||i==j&&i>=n/2)
				{
					int randomNumber= rand.nextInt(arraysOfBG.length-1);
					pattern(randomNumber);
			//	System.out.print(arraysOfColors[randomNumber]+"* ");
				if (j==n-1)
					{
					MyName.space();
					}
				}
				else
				{
					bg();
				if (j==n-1)
					{
					MyName.space();
					}
				}
			}
			//for D
			for (j=0;j<n ;j++ )
			{
				duration();
				if(j==0||i==0&&j<=n/2||i==n-1&&j<=n/2||i+j==(n/2)+(n-1)&&j>=n/2||j==(n/2)+i)
				{
					int randomNumber= rand.nextInt(arraysOfBG.length-1);
					pattern(randomNumber);
			//	System.out.print(arraysOfColors[randomNumber]+"* ");
				if (j==n-1)
					{
					MyName.space();
					}
				}
				else
				{
					bg();
				if (j==n-1)
					{
					MyName.space();
					}
				}
			}
			// for H
			for (j=0;j<n ;j++ )
			{
				duration();
				if (j==0||i==n/2||j==n-1)
				{
					int randomNumber= rand.nextInt(arraysOfBG.length-1);
					pattern(randomNumber);
			//	System.out.print(arraysOfColors[randomNumber]+"* ");
				if (j==n-1)
					{
					MyName.space();
					}
				}
				else
				{
					bg();
				if (j==n-1)
					{
					MyName.space();
					}
				}
			}

			//for A
			for (j=0;j<n ;j++ )
			{
				duration();
				if(j==(n/2)-i||j==(n/2)+i||j==0&&i>=n/2||j==n-1&&i>=n/2||i==n/2)
				{
					int randomNumber= rand.nextInt(arraysOfBG.length-1);
					pattern(randomNumber);
		//		System.out.print(arraysOfColors[randomNumber]+"* ");
				if (j==n-1)
					{
					MyName.space();
					}
				}
				else
				{
					bg();
				if (j==n-1)
					{
					MyName.space();
					}
				}
			}
			// for N
			for (j=0;j<n ;j++ )
			{
				duration();
				if (j==0||j==n-1||i==j)
				{
					int randomNumber= rand.nextInt(arraysOfBG.length-1);
					pattern(randomNumber);	
			//	System.out.print(arraysOfColors[randomNumber]+"* ");
				if (j==n-1)
					{
					MyName.space();
					}
				}
				else
				{
					bg();
				if (j==n-1)
					{
					MyName.space();
					}
				}
			}
		System.out.println();			
		}


			
	}

	}
