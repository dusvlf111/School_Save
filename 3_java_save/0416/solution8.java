import java.util.Scanner;
class Book {
	String name, number;
	public Book(String name,String number) {
		this.name = name;
		this.number = number;
	}
}

public class solution8 {
	public static void main(String[] args) {
		Book [] book = new Book[2];

		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();

		for(int i=0; i<num; i++){
			System.out.print(" name + phone_Number:	 ");
			String name = scanner.next();
			String number = scanner.next();

			book[i] = new Book(name, number);
		}

		while(true){
			String inname = scanner.next();
			ii = book.IndexOf(inname);
			if(ii != -1){
				System.out.print(inname +" number is" +book[ii][1]);
			}
			else if(inname=="그만"){
				break;
			}
			else{
				System.out.print(inname +" is none ");
			}

		}

	}
}
