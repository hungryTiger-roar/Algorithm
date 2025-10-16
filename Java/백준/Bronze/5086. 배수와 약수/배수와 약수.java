import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean temp = true;
		
		while (temp) {
			
			int firstNum = sc.nextInt();
			int secondNum = sc.nextInt();
			
			if(firstNum == 0 && secondNum ==0) {
				temp = false;
				break;
			}
			
			if(secondNum % firstNum == 0) // 약수
			{
				System.out.println("factor");
			} else if (firstNum % secondNum == 0) // 배수
			{
				System.out.println("multiple");
			} else { // 둘 다 아닌 경우
				System.out.println("neither");
			}
		} 
	}
}