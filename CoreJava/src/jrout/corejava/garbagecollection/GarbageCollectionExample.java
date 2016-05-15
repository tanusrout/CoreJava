package jrout.corejava.garbagecollection;
import jrout.corejava.constructor.Piano;

public class GarbageCollectionExample {

	public static void main(String[] args) {
		 
		int index = 0;
		for(;;){
			Piano p = new Piano("Yamaha"+ index++);
		}

	}

}
