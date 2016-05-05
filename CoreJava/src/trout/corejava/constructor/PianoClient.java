package trout.corejava.constructor;

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
	}
}
