import java.util.*;
public class Dishes{
	public static void main(String[]args) {

		Scanner input = new Scanner(System.in);
		System.out.print("What kind of diet do you have? ");
		String dishes = input.next();	

		if(dishes.equals("vegitarian")){
			System.out.println("A dinner idea for tonight could be lentil soup. ");
		} else if(dishes.equals("vegan")) {
			System.out.println("A dinner idea for tonight could be sweet potato curry. ");
		} else if(dishes.equals("keto")) {
			System.out.println("A dinner idea for tonight could be Jambalaya. ");
		} else {
			System.out.println("I haven't been programed to recognize that diet. You will forever be hungy. ");
		}
	}
}