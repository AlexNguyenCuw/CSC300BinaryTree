import java.util.Random;


public class Driver 
{
	public static void main(String[] args) 
		{
			Random r = new Random();
			BinaryTree bt = new BinaryTree();
			for(int i = 0; i < 100; i++)
			{
				bt.add(r.nextInt());
				bt.avlBalance();
			}
			System.out.println(bt.isBalanced());
			bt.displayInOrder();
		}
	
}
