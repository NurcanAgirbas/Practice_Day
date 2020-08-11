package day_02;

public class CharAtExample {

	public static void main(String[] args) {
		// 

       String pickName="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       char ch1=pickName.charAt(9);
       char ch2=pickName.charAt(0);
       char ch3=pickName.charAt(21);
       char ch4=ch2;
       System.out.println(ch1+ " "+ch2+ " "+ch3+ " "+ch4);
       
       // print java without space using the same char variable
       System.out.println(ch1+ ""+ch2+ch3+ch4);
	}

}
