package jrout.corejava.constructor;

import jrout.corejava.constants.ApplicationConstants;

public class PianoClient {

	public static void main(String[] args) {

		Piano yamaha = new Piano("Yamaha");
		Piano casio = new Piano("Casio");

		PianoClient pc = new PianoClient();
		pc.changeColor(yamaha, 15);
		pc.changeColor(casio, 5);
		
	

	}

	/**
	 * If Piano is Yamaha and cost is more than 50 then make it yellow gold
	 * else 
	 * 	make it Gold
	 * 
	 * if cost is < 10 then make it black
	 * 
	 * @param yamaha
	 * @param cost
	 */
	public void changeColor(Piano piano, int cost) {
		if (piano.brand == "Yamaha" && cost > 50){
			piano.color = "Yellow Gold";
			
		}if (cost > 10) {
			piano.color = "Gold";
		} else {
			piano.color = "Black";
		}
	
	System.out.println(piano.brand);
	System.out.println(piano.color);
	
	Picture pict = new Picture();
	System.out.println(pict.pictureName);
	System.out.println(pict.typeOfPicture);
	
	Piano personalPiano = new Piano("Casio","Gold","MyCasio" , 8);
	//System.out.println(personalPiano.brand + " " + personalPiano.color + " " + personalPiano.name + " " + personalPiano.size);
	
	System.out.println("I stay in USA Capital:" + ApplicationConstants.USA_Capital);
	personalPiano.printDetails();
	}
	
	
	
	
}
