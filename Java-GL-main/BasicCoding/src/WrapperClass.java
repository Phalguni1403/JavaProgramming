public class WrapperClass {

	public static void main(String[] args) {

//primitive data type to wrapper type
		int numberone = 10;
		double numbertwo = 30.3;
//converting into wrapper type
		Integer object = Integer.valueOf(numberone);
		Double object1 = Double.valueOf(numbertwo);

		if (object instanceof Integer) {
			System.out.println("integer instance of");
		}
		if (object1 instanceof Double) {
			System.out.println("double instance of");
		}
	}
}