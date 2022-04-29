package week1.day2;

public class Learnmethod {
	public static void main(String[] args) {
		// ClassName objectName = new ClassName();
		Learnmethod obj = new Learnmethod();
		//obj.methodName();
		obj.printcarname();
		int CarNumber = obj.getCarNumber();
		System.out.println(CarNumber);

		String model = obj.getCarModel();
		System.out.println(model);

		int multiply = obj.multiplyTwoNumber(5,9);
		System.out.println(multiply);
		}
		//access modifier return type method(arugements) {action}
		public  void printcarname() {
		System.out.println("kia");

		}
		public int getCarNumber() {
		int CarNumber =9765;
		return CarNumber;
		}
		public String getCarModel() {
		return "kia seltos";

		}
		public int multiplyTwoNumber(int a,int b) {
		return a*b;

		}


		}




