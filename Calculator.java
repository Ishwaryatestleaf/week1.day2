package week1.day2;

public class Calculator {
	public static void main(String[] args) {
		// ClassName objectName = new ClassName();
		Calculator CC= new Calculator();
		CC.MyCalculator();
		int Add=CC.addTwoNumber(4,6);
		System.out.println(Add);
		int Sub=CC.subTwoNumbers(9,2);
		System.out.println(Sub);
		double Multiply=CC.multiplyTwoNumbers(6,8);
		System.out.println(Multiply);
		float Divide=CC.divideTwoNumbers(3,8);
		System.out.println(Divide);
		
}
	//access modifier return type method(arugements) {action}
		
public void MyCalculator() {
}
public int addTwoNumber(int a,int b) {
	return a+b;
}
public int subTwoNumbers(int a,int b) {
	return a-b;
}
public double multiplyTwoNumbers(double a,double b) {
    return a*b;
}
public float divideTwoNumbers(float a,float b) {
    return a/b;
}
} 


