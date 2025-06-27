package bit_manuplation;

public class get_bit {
//get the 3rd bit postion==2 of an nuber n 0101
	public static void main(String[] args) {
	int n=5;
	int pos=2;
	int bitMask=1<<pos; //000l left shift 2 =0100
	if((bitMask&n)==0) {//0100 &0101 that is 5=0000 so it print 0 as output
		System.out.println(":not zero");
		
	}
	else {
		System.out.println(":zero");
	}
	}

}
