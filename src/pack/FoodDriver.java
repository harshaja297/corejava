package pack;

public class FoodDriver {
//int on, String hn, String d, double tp
	public static void main(String[] args) {
		
		Bill b1= new Bill(1, "Buhari", "20/05/2023", Bill.addPrice());
		b1.genBill();

		Bill b2= new Bill(2, "ananda bhavan", "20/05/2023", Bill.addPrice());
		b2.genBill();
		//System.out.println(Bill.addPrice());
		
	}
}
