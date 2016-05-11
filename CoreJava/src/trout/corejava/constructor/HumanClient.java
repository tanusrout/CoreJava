package trout.corejava.constructor;

public class HumanClient {

	public static void main(String[] args) {
		
		
		HumanHead humanHead = new HumanHead("Oval");
		HumanLeg leftLeg = new HumanLeg("leftLeg" , 4);
		HumanLeg rightLeg = new HumanLeg("rightLeg" , 5);
		HumanHand leftHand = new HumanHand("lefthand" , "blue");
		HumanHand rightHand = new HumanHand("rightHand" , "pink");
		 
		
		HumanBody humanBody = new HumanBody();
		humanBody.setName("Jayram");
		humanBody.setHeight(5);
		humanBody.setHumanHead(humanHead);
		humanBody.setLeftLeg(leftLeg);
		humanBody.setRightLeg(rightLeg);
		humanBody.setLeftHand(leftHand);
		humanBody.setRightHand(rightHand);
		
		humanBody.humanDetails();
	}

}
