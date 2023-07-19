package pack;

import java.util.*;
class Friend
{
	public static Scanner s= new Scanner(System.in);
	String name;
	int age;
	String type;
	static int friendCount=0;
	static List<Friend> friends= new ArrayList<Friend>();
	static int i;
	static Friend [] f= new Friend[100];//array Declaration
	static int dummyCount;

	static{
		sep();
		System.out.println(TextDec.BOLDPURPLE+"WELCOME TO CRUD FRIEND");
	}
	{//non static multiline Instialisers 

	}
	public static void sep(){
		System.out.println("------------------------------------------------");
	}

	public static Friend testUpdate(){
		
		friendCount--;
		Friend up= getFriend();
		return up ;
	}
	
	Friend(){
		
		if(dummyCount==0){
		System.out.println("Enter your Friend name : ");
		this.name=s.nextLine();
		System.out.println("Enter your Friend Type : ");
		this.type=s.nextLine();
		//String dummy= s.next();//dummy input
		System.out.println("Enter your Friend age : ");
		this.age=s.nextInt();
		friendCount++;
		dummyCount++;
		}
		else{
		System.out.println("Enter your Friend name : ");
		String dummy1= s.nextLine();//dummy input to skip
		this.name=s.nextLine();
		System.out.println("Enter your Friend Type : ");
		//String dummy2= s.nextLine();//dummy input
		this.type=s.nextLine();
		System.out.println("Enter your Friend age : ");
		this.age=s.nextInt();
		friendCount++;
		}	
	}
	Friend(String n, String t, int a){
		name= n;
		type= t;
		age= a;
		friendCount++;
		dummyCount++;
	}
	
	public static Friend getFriend(){//always get Instance method Should be static 
		return new Friend();
	}

	public static void count(){

		System.out.println("You have "+friendCount+" Friends ");

	}

	public static void getDetailsOfFriends(){

		if(friendCount==0){
			System.out.println("no details to Show");
		}
		else{
			

		System.out.println("Details Are : ");
		for (i= 0;i<friends.size() ;i++ )//size
		{
			//Thread.sleep(80);//Doubt Why i cant use in methods
			System.out.println((i+1)+"."+friends.get(i).toString());// Very very very very Important
		}
		}
	}

	public static Friend removeFriend(){
		
			friendCount--;
			System.out.println("indexes and Values are : ");
			sep();
			for (int i= 0, m=friends.size()-1;i<friends.size() ;i++ )//size
				{
				System.out.println((friends.get(i).hashCode()-m+1)+"."+friends.get(i).name);// Very very very very Important
				m--;//someHow Managed
				}
			//System.out.println("Testtting  "+friends.size());
			sep();
			System.out.println("Enter index to remove friend : ");
			sep();
			int rem=s.nextInt();
			sep();
			System.out.println(TextDec.BOLDRED+friends.get(rem-1).name+" Friend Removed Successfully ");	
			return friends.get(rem-1);// Very very very very Important

	}

	public static void FriendsList(){
	
		for (int i= 0, m=friends.size()-1;i<friends.size() ;i++ )//size
		{
			System.out.println(friends.get(i).hashCode()-m+"."+friends.get(i).name);// Very very very very Important
			m--;//someHow Managed
		}
	}

	public static void updateFriend(){
		
			System.out.println("Select index to Update ");
			sep();
			for (int i= 0, m=friends.size()-1;i<friends.size() ;i++ )//size
			{
				System.out.println(friends.get(i).hashCode()-m+"."+friends.get(i).name);// Very very very very Important
				m--;//someHow Managed
			}
				sep();
				int up = s.nextInt();
				sep();
				friends.set((up-1),testUpdate());
				sep();
				
				System.out.println(friends.get(up-1).name+" Friend Updated Successfully "); 

	}

	public static void sort(String accordingTo){
		
		switch (accordingTo){
		case "name":{
		Comparator<Friend> comName = new Comparator<Friend>(){
		public int compare(Friend i, Friend j){
			if (i.name.charAt(0)>j.name.charAt(0))
			return 1;
			else 
			return -1;
		}
	};//as this is Anonymous Class implementation so ;is used
			Collections.sort(friends, comName);
			break;
		}
		case "age":{
		Comparator<Friend> comAge = new Comparator<Friend>(){
		public int compare(Friend i, Friend j){
			if (i.age>j.age)
			return 1;
			else 
			return -1;
		}
	};//as this is Anonymous Class implementation so ;is used
			Collections.sort(friends ,comAge);		
			break;
		}
		default:{
			break;
		}
		}
	}
	public static void isPresent(String n){
		
		String res= "not Present";
		
		for (i= 0;i<friends.size() ;i++ )//size
		{
			if (friends.get(i).name.equals(n))
			{
				res= "Present";
				break;
			}			
		}
		sep();
		System.out.println(res);
	}


	@Override
	public String toString(){

		sep();
		return TextDec.BOLDBLUE+"Name : "+name+", Age : "+age+", Type : "+type;
	}
	@Override
	public int hashCode(){
		return friendCount;
	} 

}
public class CrudFriend extends Friend 
{
	

	public static Scanner s= new Scanner(System.in);
	public static void main(String []args)throws Exception{
		//int i= 0;
		boolean b= true;
		do
		{
			sep();
			System.out.println(TextDec.BOLDLIGHTPURPLE+"1.GetNewFriend");
			System.out.println("2.GetFriendList");
			System.out.println("3.UpdateFriendList");
			System.out.println("4.RemoveFriend");
			System.out.println("5.IsFriendPresent");
			System.out.println("6.GetFriendCount");
			System.out.println("7.FetchDetailsOfFriends");
			System.out.println("8.SortingFriend");
			System.out.println("9.Exit");
			sep();
			String ch= s.next();

			switch (ch)
			{
			case "1":{
				sep();
				System.out.println("GetFriend Selected");
				sep();
				friends.add(Friend.getFriend());
				sep();
				System.out.println(TextDec.BOLDGREEN+"Friend Added Successfully ");
				//i++;
				break;
			}
				case "2":{
				sep();
				System.out.println("FriendList Selected");
				sep();
				Friend.FriendsList();
				//i++;
				break;
			}
				case "3":{
				sep();
				System.out.println("UpdateFriend Selected");
				sep();
				Friend.updateFriend();
				//i++;
				break;
			}
			case "4":{
				sep();
				System.out.println("RemoveFriend Selected");
				sep();
				friends.remove(Friend.removeFriend());
				//i++;
				break;
			}
			case "5":{
				sep();
				System.out.println("IsFriendPresent Selected");
				sep();
				System.out.println("Enter Friend Name to Check whether Present ");
				sep();
				String n=s.next();
				Friend.isPresent(n);
				break;
			}
			case "6":{
				sep();
				System.out.println("GetFriendCount Selected");
				sep();
			//	String dummy=s.next();
				Friend.count();
				break;
			}
			case "7":{
				sep();
				System.out.println("GetDetailsOfFriends Selected");
				sep();
				System.out.println("Fetching... ");
				Thread.sleep(2000);
				sep();
				Friend.getDetailsOfFriends();
				break;
			}
			case "8":{
				sep();
				System.out.println("SortFriends Selected");
				sep();
				System.out.println("Select");
				sep();
				System.out.println("1.SortAccordingToName");
				System.out.println("2.SortAccordingToAge");
				sep();
				int input= s.nextInt();
				switch (input)
				{
				case 1:{
				sep();
				System.out.println("SortAccordingToName Selected");
				sort("name");
				sep();
				System.out.println("Processing...");
				sep();
				Thread.sleep(2000);
				System.out.println(TextDec.BOLDGREEN+"Sorted According to Name SuccessFully..");
				break;
				}
				case 2:{
				sep();
				System.out.println("SortAccordingToAge Selected");
				sort("age");
				sep();
				System.out.println("Processing...");
				sep();
				Thread.sleep(2000);
				System.out.println(TextDec.BOLDGREEN+"Sorted According to Age SuccessFully..");
				break;
				}
				default:{
					break;
				}
				}
				break;
			}
			case "9":{
				sep();
				System.out.println(TextDec.BOLDRED+"ThankYou");
				b=false;
				break;
			}
			case "new":{
			sep();
			System.out.println(TextDec.BOLDGREEN+"Sample Table Invoked");
			friends.add(new Friend("Harsha","StreetFriend",21));
			friends.add(new Friend("sam","SchoolFriend",13));
			friends.add(new Friend("tom","TutionFriend",21));
			friends.add(new Friend("tim","CollegeFriend",31));
			friends.add(new Friend("sal","QspFriend",45));
			friends.add(new Friend("phil","QspFriend",10));
			friends.add(new Friend("mary","CollegeFriend",32));
			friends.add(new Friend("tom","TutionFriend",21));
			friends.add(new Friend("john","StreetFriend",37));
			friends.add(new Friend("gill","SchoolFriend",40));
			friends.add(new Friend("kim","CollegeFriend",24));
			friends.add(new Friend("phil","QspFriend",10));
			friends.add(new Friend("jim","TutionFriend",70));
			friends.add(new Friend("john","StreetFriend",37));
			friends.add(new Friend("kim","CollegeFriend",24));
			friends.add(new Friend("mel","CollegeFriend",18));
			friends.add(new Friend("sam","SchoolFriend",13));
			break;
			}
			default :{sep();
				System.out.println(TextDec.BOLDRED+"Invalid input");
				break;
			}
			}
		}
		while (b);
	}
}