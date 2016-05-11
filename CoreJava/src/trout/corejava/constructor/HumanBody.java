package trout.corejava.constructor;

public class HumanBody {
	private String name;
	private int height;

	private HumanHead HumanHead;
	private HumanLeg leftLeg;
	private HumanLeg rightLeg;
	private HumanHand leftHand;
	private HumanHand rightHand;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}
	


	public void setHeight(int height) {
		this.height = height;
	}

	public HumanHead getHumanHead() {
		return HumanHead;
	}

	public void setHumanHead(HumanHead humanHead) {
		HumanHead = humanHead;
	}

	public HumanLeg getLeftLeg() {
		return leftLeg;
	}

	public void setLeftLeg(HumanLeg leftLeg) {
		this.leftLeg = leftLeg;
	}

	public HumanLeg getRightLeg() {
		return rightLeg;
	}

	public void setRightLeg(HumanLeg rightLeg) {
		this.rightLeg = rightLeg;
	}

	public HumanHand getLeftHand() {
		return leftHand;
	}

	public void setLeftHand(HumanHand leftHand) {
		this.leftHand = leftHand;
	}

	public HumanHand getRightHand() {
		return rightHand;
	}

	public void setRightHand(HumanHand rightHand) {
		this.rightHand = rightHand;
	}

	public void humanDetails(){
		System.out.println("HumanName ="  + this.getName());
		System.out.println("HumanHeight= " + this.getHeight() );
		System.out.println("HumanLeftHand ="+ this.getLeftHand().getName() +" "+ this.getLeftHand().getThumbFingerColor());
		System.out.println("HumanRightHand = " + this.getRightHand().getName() + " "+this.getRightHand().getThumbFingerColor());
		System.out.println("HumanLeftLeg = "  + this.getLeftLeg().getSize());
		System.out.println("HumanLeftLeg = " + this.getRightLeg().getSize());
		System.out.println("HumanHead = " + this.getHumanHead().getShape());
		
		
	}
	}
