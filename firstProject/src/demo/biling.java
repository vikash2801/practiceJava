package demo;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class biling {

	private static Scanner in;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inputString = in.nextLine(); 	
		List<String> inputData = Arrays.stream(inputString.split(",")).collect(Collectors.toList());
		String customerName = inputData.get(0);
		long mobileNumber = Long.parseLong(inputData.get(1));
		String address = inputData.get(2);
		int items =Integer.parseInt(inputData.get(3));
		float cost = Float.parseFloat(inputData.get(4));
//		System.out.println("Name :  "+customerName+  ", Mobile :  "+mobileNumber+ ", Address :  "+address+ ", Items :  "+items+ ", Bill Amount :  $"+(items*cost));		
		in.close();
		
			//Multiline input and output
// 		Scanner in = new Scanner(System.in);
 //		String customerName = in.next();
// 		long mobileNumber = in.nextLong();
// 		String address = in.next();
// 		int items = in.nextInt();
// 		float cost = in.nextFloat();
			
         System.out.println("Name        :   "+customerName);
         System.out.println("Mobile      :   "+mobileNumber);
         System.out.println(("Address    :   "+address));
         System.out.println("Items       :   "+items);
         System.out.println("Bill Amount :   "+(items*cost));
		

	}

}