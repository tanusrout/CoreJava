package trout.corejava.constructor;

public class HumanHand {
	private String name;
	private String thumbFingerColor;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getThumbFingerColor() {
		return thumbFingerColor;
	}

	public void setThumbFingerColor(String thumbFingerColor) {
		this.thumbFingerColor = thumbFingerColor;
	}
	public HumanHand(String name,String thumbFingerColor) {
		this.name = name;
		this.thumbFingerColor = thumbFingerColor;
	}
}
