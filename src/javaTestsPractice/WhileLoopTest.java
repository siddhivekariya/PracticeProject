package javaTestsPractice;

public class WhileLoopTest {

	public static void main(String[] args) {
		
		System.out.println("This is while loop");
		
		int i = 1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
			if(i==5) {
				System.out.println("we got 5");
				break;
			}
		}

	}

}
