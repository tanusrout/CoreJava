package trout.corejava.constructor;

public class Piano {
	String name;
	String color;
	String brand;
	int size;

	public Piano(String brandx){
		brand = brandx;	
		System.out.println(brand + "got Created");
	}
	
	public Piano(String brandValue,String colorValue,String nameVal,int sizeVal){
		 brand = brandValue;
		 color = colorValue;
		name = nameVal;
		size = sizeVal;
	}
	
		public void  printDetails(){
			System.out.println(brand + " \n" + color + "\n " + name + "\n " + size);
		
	}

		protected void finalize() throws Throwable{
			System.out.println("I am been Destroyed" + brand);
		}
}
