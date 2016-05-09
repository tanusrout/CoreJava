package trout.corejava.methods;

public class VariableArgs {

	public static void main(String[] args) {
		VariableArgs vr = new VariableArgs();
		System.out.println(vr.variableArgs(4, 4));
		System.out.println(vr.variableArgs(3,4,5,6,7,8,43,44));

	}
	public int variableArgs(int i,int j){
		System.out.println("This is 2 args");
		return i+j;
	}
	
	public int variableArgs(int...array){
		int temp = 0;
		System.out.println("This is Variable Args example");
		for(int val : array){
			temp+= val;
			}
		return temp;
	}

}
