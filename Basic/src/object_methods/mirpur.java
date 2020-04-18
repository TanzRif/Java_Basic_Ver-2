package object_methods;

public class mirpur {
	int x = 10;
	int y = 30;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mirpur obj1 = new mirpur();
		System.out.println(obj1.x);
		obj1.bcic();
		//if method is static no need to create objective.
	}

	public void bcic() {

		int x = 2;
		int y = 3;
		int z = x + y;

		System.out.println("good " + z);

	}

	
}
