package trout.corejava.constructor;

public class Hand {
	String name;
	String thumbFingerColor;
	String indexFingerColor;
	String middleFingerColor;
	String ringFingerColor;
	String littleFingerColor;
	
	public Hand(String name, String one, String two , String three, String four, String five) {
		this.name = name;
		this.thumbFingerColor = one;
		this.indexFingerColor = two;
		this.middleFingerColor = three;
		this.ringFingerColor = four;
		this.littleFingerColor = five;
	}
	
	public void printDetails(){
		System.out.println("Name is "+name);
		System.out.println("ThumbFinger Color "+ thumbFingerColor);
		System.out.println("indexFinger Color" + indexFingerColor);
		System.out.println("middleFinger Color" + middleFingerColor);
		System.out.println("ringFinger Color" + ringFingerColor);
		System.out.println("littleFinger Color" + littleFingerColor);
	}
}
