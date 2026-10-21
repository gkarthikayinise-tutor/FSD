package fundametal;

public class King { 
	int total_members_of_king_fam=4;
	public void idea(){
		System.out.println(" Planning for WAR ");
	}
	public static void main(String[] args) {
		
		King kk123=new King();
		kk123.idea();
		
		Family1 fam1=new Family1();
		fam1.house();
		
		Family2 fam2=new Family2();
		fam2.house();

	}

}

class Family1{
	String idea="New building Plan";
	
	public void house(){
		System.out.println("we wanna approval for building 2BHK");
	}
}

class Family2{
	String idea="New car buying Plan";
	
	public void house(){
		System.out.println("we wanna approval for buying a car");
	}
}