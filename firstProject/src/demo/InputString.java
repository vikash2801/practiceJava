package demo;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//========================taking limited string as input
		/*String s1 = in.next();		
		
		//========================taking whole line of string as input
		String s2 = in.nextLine();
		
		System.out.println(s1);
		System.out.println(s2);
		*/
		
		//==========================taking numbers in form of string
		/*String s3 = in.nextLine();
		String[] result = s3.split(",");
		for(int i=0;i<result.length; i++) {
			System.out.print(Integer.parseInt(result[i].trim()) + 10 + " ");
		} */
		
		//============================taking random values in List<string>
		/*String s4 = in.nextLine();
		List<String> newList = Arrays.stream(s4.split(",")).collect(Collectors.toList());
		int firstNum = Integer.parseInt(newList.get(0));
		String secondString = newList.get(1);
		float thirdFloat = Float.parseFloat(newList.get(2));
		
		System.out.println("firstNum : " + firstNum);
		System.out.println("secondString : " + secondString);
		System.out.println("thirdFloat : " + thirdFloat);
		*/
		
		//===========================taking random values in String[] 
		
		String s5 = in.nextLine();
		String[] strArr = s5.split(",");
		int helloNum = Integer.parseInt(strArr[0].trim());
		String helloString = strArr[1].trim();
		float helloFloat = Float.parseFloat(strArr[2].trim());
		
		System.out.println("helloNum : " + helloNum);
		System.out.println("helloString : " + helloString);
		System.out.println("helloFloat : " + helloFloat);
		
		in.close();
	}

}
