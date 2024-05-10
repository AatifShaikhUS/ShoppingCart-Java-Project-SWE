import java.util.*;
public class Shoppingcart{
public static void main(String[] args) {

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
}
}