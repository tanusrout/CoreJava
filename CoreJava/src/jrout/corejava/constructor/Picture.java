package jrout.corejava.constructor;

public class Picture {
	String pictureName;
	String typeOfPicture; //sports or education related
	int size;
	
	public Picture(){  //default constructor
	
			pictureName = "TestPicture";
			typeOfPicture = "Sports";
	}
	
	public Picture(String pictureName){
		this.pictureName = pictureName;
		
	}
	
	public Picture(String pictureName,String typeOfPicture){
		this.pictureName = pictureName;
		typeOfPicture = typeOfPicture;
		
	}
	public Picture(String pictureName,String typeOfPicture,int sizeVal){
		this(pictureName , typeOfPicture);
		//this.size = sizeVal;
		size = sizeVal;
		//this(pictureName , typeOfPicture);//if we swap the 2 lines Constructor call must be the first statement in a constructor
	}
}
 