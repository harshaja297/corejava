package pack;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

class Bill{
	

	int orderNo;
	String hotelName;
	String date;
	double totalPrice;

	public int getOrderNo() {
		return orderNo;
	}
	public String getHotelName() {
		return hotelName;
	}
	public String getDate() {
		return date;
	}
	public double getTotalPrice() {
		return totalPrice;
	}

	public static void sepl() {
		System.out.println("-------------------------------------------------");
	}
	Bill(){}
	Bill(int on, String hn, String d, double tp){
		orderNo= on;
		hotelName= hn;
		date= d;
		totalPrice= tp;
	}
	public static String sep() {
		return"-------------------------------------------------";
	}
	 static Food [] foods= {new Food("biriyani", "spicy","good", 320),
			 new Food("tikkamasala", "spicy","average", 180),
			 new Food("prawnFry", "sour","bad", 420),
			 new Food("naan", "plain","good", 40),
			 new Food("muttonbiriyani", "spicy","good", 40)};
	
	public void genBill(){
		//task
		File file =new File("D:\\Bill.txt");//file mem allo
		try {
			file.createNewFile();//created
			Writer fw= new FileWriter(file,true);
			fw.write(getHotelName()+"\n"+sep()+"\nOrder Number:"+getOrderNo()+"\nDate        :"+getDate()+" \nTotal Price :"+getTotalPrice()+"\n"+sep()+"\n");
			
			fw.flush();//mandatory
			System.out.println("done");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static double addPrice() {
		double a=0;
		
		for( int index= 0; index<foods.length; index++) {
		 a= a+	Bill.foods[index].price;
		}
	return a;
	}

}

 class Food {
	 
	 String name, taste, aboutFood ;
	 double price;
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public String getAboutFood() {
		return aboutFood;
	}
	public void setAboutFood(String aboutFood) {
		this.aboutFood = aboutFood;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	Food(){}//
	Food(String n, String t , String af,double p){
		name= n;//null//biryani
		taste= t;
		price= p;//0.0
		aboutFood= af;
	}

	
}
