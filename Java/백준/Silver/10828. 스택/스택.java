import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0; i<N; i++)
		{
			String[] input = sc.nextLine().split(" ");
			
			if(input[0].equals("push"))
			{
				al.add(Integer.parseInt(input[1]));
			}
			else if(input[0].equals("pop"))
			{
				if(al.size()>0)
				{
					System.out.println(al.get(al.size()-1));
					al.remove(al.size()-1);
				}
				else
				{
					System.out.println(-1);
				}
			}
			else if(input[0].equals("size"))
			{
				System.out.println(al.size());
			}
			else if(input[0].equals("empty"))
			{
				if(al.size()>0)
				{
					System.out.println(0);
				}
				else
				{
					System.out.println(1);
				}
			}
			else if(input[0].equals("top"))
			{
				if(al.size()>0)
				{
					System.out.println(al.get(al.size()-1));
				}
				else
				{
					System.out.println(-1);
				}
			}
		}
	}
}