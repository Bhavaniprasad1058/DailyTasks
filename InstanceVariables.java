package Tasks;

public class InstanceVariables {
    
	int a=20;
	String name;
	//intializing the instance variable
	{ this.name="prasad";}
	public static void main(String[] args) {
          //object creation
		InstanceVariables instVar =new InstanceVariables();
		System.out.println(instVar.name);
		System.out.println(instVar.a);
	}

}
