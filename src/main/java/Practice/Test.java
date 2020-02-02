package Practice;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		LinkedList1 list=new LinkedList1();
		
		
		
				
		boolean flag=true;
		
		
		while(flag)
		{
		System.out.println("");
		System.out.println("1. Add item to the list at the start");
		System.out.println("2. Add item to the list at the last");
		System.out.println("3. Add item to the list at the position");
		System.out.println("4. Delete first item from the list");
		System.out.println("5. Delete last item from the list");
		System.out.println("6. Delete item from the list with gien position");
		System.out.println("7. View List");
		System.out.println("8. Exit");
		System.out.println("Enter your choice");

		int choice=sc.nextInt();
		int position,val;
		
		
		switch(choice)
		{
		case 1:
			System.out.println("Enter value of the List item");
			val=sc.nextInt();
			list.insertAtFirst(val);
			break;
			
		case 2:
			System.out.println("Enter value of the List item");
			val=sc.nextInt();
			list.insertAtLast(val);
			break;
			
			
		case 3:
			System.out.println("Please enter the position");
			position=sc.nextInt();
			System.out.println("Please enter value of List item");
			val=sc.nextInt();
			list.insertAtPos(val, position);
			break;
			
		case 4:
			list.deleteFirst();
			break;
		case 5:
			list.deleteLast();
			break;
		case 6:
			System.out.println("Please enter position");
			position=sc.nextInt();
			list.deleteAtPos(position);
			break;
					
		case 7:
			list.viewList();
			break;
		case 8:
			flag=false;
			break;
			
		default:
			System.out.println("Invalid Choice....");
				
		}
		
		
		
		}
		
		
		
	}

}
