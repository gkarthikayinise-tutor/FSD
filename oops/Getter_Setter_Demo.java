package oops;

public class Getter_Setter_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gpay g=new Gpay();
		System.out.println(g.getAcc_balance());
		g.setAcc_holder_email("karthi@gmail.com");
		System.out.println(g.getAcc_holder_email());
	}

}



class HDFC {
	private long acc_num=1011345;
    private String acc_holder_name = "Karthi";
    private String acc_holder_email="karthi123@gmail.com";
    private double acc_balance = 5000000;

    public String getAcc_holder_name() {
        return acc_holder_name;
    }

    public String getAcc_holder_email() {
        return acc_holder_email;
    }

    public void setAcc_holder_email(String acc_holder_email) {
        this.acc_holder_email = acc_holder_email;
    }
    
    public long getAcc_num(){
    	return acc_num;
    }

    public double getAcc_balance() {
        return acc_balance;
    }

    void showbalance(){
    	System.out.println(acc_balance);
    }
}

class Gpay extends HDFC{}
