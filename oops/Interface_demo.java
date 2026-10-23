package oops;

public class Interface_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


interface RTO{
	void BS6();
	void DualDiscBreaks();
	void AirBags();
}

class HondaCity implements RTO{
	void RootsHorn(){}
	
	void SonyMediaPlayer(){}
	
	public void BS6(){}
	
	public void DualDiscBreaks(){}
	public void AirBags(){}
}