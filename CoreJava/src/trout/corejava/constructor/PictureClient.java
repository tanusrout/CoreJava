package trout.corejava.constructor;

public class PictureClient {

	public static void main(String[] args) {
		
		Picture pc = new Picture("SimplePicture");
		pc.typeOfPicture = "Sports";
		System.out.println("pictureName = "  + pc.pictureName);
		System.out.println(pc.pictureName + " \n" + pc.typeOfPicture  );
		Picture pc1 = new Picture("simplePicture", "Sports" , 3);

	}

}
