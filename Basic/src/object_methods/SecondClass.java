package object_methods;

public class SecondClass {

	public static void main(String[] args) {

		calculator obj1 = new calculator();

		obj1.sum();
		obj1.sub();

		System.out.println("name is: " + obj1.name);
		System.out.println("hobby is: " + obj1.hobby);
	}

}
