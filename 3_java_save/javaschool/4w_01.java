package solution1;
import java.util.Scanner;
import java.util.Arrays;

public class aa {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		
		
		// 리스트에 가위바위보를 넣는다 
		// 나온 값을 변수에 넣는다
		// 같을때, 가위 바위, 바위 보 , 보 가위
		// 케이스가 정확히 나뉘므로 케이스를 쓴다
		// 가위 0, 바위 1, 보2, 그만
		
		String str[] = {"가위", "바위", "보"};
		
		
		System.out.println( "컴퓨터와 가위,바위,보를 시작 합니다");
		System.out.print( "가위 바위 보 >> ");
		String man = scanner.next();
		
		
		int	human = Arrays.asList(str).indexOf(man);
		int computer = (int)(Math.random()*3);
		
		// 사람과 컴퓨터 숫자 변환
		
		if (computer == human)
			System.out.println("비김");
		//같을때 제외
		
		scanner.close();
			
	    int i = computer + human;

	    switch (i) {
	    case 1:         // 가위 바위
			if(human> computer)
				System.out.println( "인간:가위, 봇:바위 ----인간이 이김");
			else if(human < computer)
				System.out.println( "인간:바위, 봇:가위 ----봇이 이김");
	        break;
	        
	    case 2:            // 가위 보
			if(human> computer)
				System.out.println( "인간:가위, 봇:보 ----봇이 이김");
			else if(human < computer)
				System.out.println( "인간:보, 봇:가위 ----인간이 이김");
	    	break;
	    	
	    case 3:            // 바위 보
			if(human> computer)
				System.out.println( "인간:보, 봇:바위 ----인간이 이김");
			else if(human < computer)
				System.out.println( "인간:바위, 봇:보 ----봇이 이김");
	    	break;
	    default:        // 그만이나 틀린값일때
	    	System.out.println("게임을 종료합니다");
	    	break;         
	    }
	    
	    
	}	
}
