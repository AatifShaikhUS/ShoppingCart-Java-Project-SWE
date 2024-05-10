import java.util.*;
public class Shoppingcart{
public static void main(String[] args) {

    method ob = new method();
    // add dele view cart
    Scanner sc = new Scanner(System.in);
    System.out.println("\t\t------Welcome to Super Mart: -----");
    System.out.println("Enter the Size of Basket: ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    String[] items = new String[size];
    int choice;
    String searchitem;

    for (int i = 0; i < arr.length; i++) {
        System.out.println("Enter the Item Name and item prize for item : "+(i+1));
        // item[i] = sc.nextLine();
        items[i] = sc.next();
        arr[i] = sc.nextInt();
       
        
    }
    System.out.println("Items and its Prizes are: ");
    for(int i=0; i < arr.length; i++){
        System.out.println(items[i]+" : "+arr[i]);
    }
    do {
        System.out.println("\nMENU: \nEnter  \n 1 for Add Item & Prize \n 2 for Delete Prize & Item \n 3 for View Cart. \n 4 Search Item. \n 5 for Total bill \n 0 for End the program. ");
           choice = sc.nextInt();
           // if(choice == 1){
               switch(choice){
                   case 1:
                   System.out.println("Enter the index no ");
                   int idx =  sc.nextInt();
                   System.out.println("Enter the product price ");
                   int price = sc.nextInt();
                   System.out.println("Enter the product name ");
                    String proname = sc.next();
                   arr = ob.AddPrize(arr, idx, price);
                   items = ob.AddItem(items, idx, proname);
                   System.out.println("The product and prixe are added.: ");
                   break;

                   case 2:
                   System.out.println("Enter the item index ");
                   int id = sc.nextInt();
                   arr = ob.Deleteprize(arr, id); 
                   items = ob.DeleteItem(items, id);
                   System.out.println("\nProduct are successfully Deleted. :  ");
                   break;

                   case 3:
                   System.out.println("\nView Cart: ");
                   
                       for (int i = 0; i < arr.length; i++) {
                           System.out.println(items[i]+" : "+arr[i]);
                       }    
                       break;
                   
                   case 4:
                   System.out.println("Enter the item name to be search :");
                   searchitem = sc.next();
                   ob.SearchItem(items, searchitem);
                   break;

                   case 5:
                   System.out.println("\nTotal Bill $"+(ob.TotalAmount(arr)));
                   break;
                   
             
                   case 0:
                   System.out.println("Thank You for Your Patient.");
                   break;

                   default:
                   System.out.print("\nSorry! you entered wrong choice.");
                   break;
               }
               
       } while (choice!=0);
           System.out.println("Thanks For Choosing Us \n Come Back for More Special Discounts..");
   }
}