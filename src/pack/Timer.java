package pack;

public class Timer {//for Otp read
	

	public static void main(String[] args) throws Exception {
		boolean b= true;
		int timeLimit= 5;//enter How many Seconds
		while (b) {	
			Thread.sleep(1000);
			int timer= timeLimit--;			
			if (timer<=3) {
				
					System.out.println(timer);
					if(timer==1) {
						Thread.sleep(1000);
						System.out.println("Time out");
						b=false;
					}
			}
		}
	}
}
