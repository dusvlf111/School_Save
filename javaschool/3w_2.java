import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {


        Scanner sc = new Scanner(System.in);


        System.out.println("첫번째 원의 중심과 반지름 입력>>");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int r1 = sc.nextInt();

        System.out.println("두번째 원의 중심과 반지름 입력>>");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int r2 = sc.nextInt();

        double xx = Math.pow((x1-x2), 2);
        double yy = Math.pow((y1-y2), 2);
        double xy = Math.sqrt((xx+yy));
         
        int rr = r1+r2;

        if (xy <= rr)
            System.out.println("두원은 서로 겹칩니다");
        else
            System.out.println("안겹침");

    }
}
