public class Add {
 public static void main (String[] args) {
  int sum=0;
  System.out.println(args);
  for (int i=0; i<args.length; i++) {
   try {
    int n = Integer.parseInt(args[i]); // 인자를 정수로 변환
    sum = sum + n;
   } catch(NumberFormatException e) {
    // 정수로 변환할 수 없는 인자는 NumberFormatException 예외가 발생하며 합산에서 제외
   } 
  } 
  System.out.println(sum); 
 }
}