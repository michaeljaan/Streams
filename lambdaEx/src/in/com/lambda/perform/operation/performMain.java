package in.com.lambda.perform.operation;

public class performMain {

	public static void main(String[] args) {
		
		LambdaExpression lambda = new LambdaExpression();
		performOperation op;
		performOperation op1;
		
		op=lambda.checkEvenOdd();
		int ret=lambda.checker(op, 124);
		System.out.println((ret==0)?"Even":"Odd");
		
		op1=lambda.checkPlaindrome();
		int ret1=lambda.checker(op1, 121);
		System.out.println((ret1==0)?"Palindrome": "Not Palindrome");
		
		op=lambda.checkPrime();
		int ret2=lambda.checker(op, 243);
		System.out.println((ret==0)?"Prime": "Not Prime");
		
	}

}
