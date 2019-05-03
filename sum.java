import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    System.out.println("Enter several numbers. To display the sum, enter the word 'sum'");
    
    BufferedReader numbers = new BufferedReader(new InputStreamReader(System.in));

    int sum = 0; // set the sum to 0 at the beginning

    while (true) { /*read numbers from the keyboard until String "sum" is read*/
      String s = numbers.readLine();
      if (s.equals("sum")) /*stop reading numbers, when String "sum" was entered*/
        break;
      else { 
        int n = Integer.parseInt(s);//read numbers from the keyboard
        sum += n;//add entered number to the sum
      }
    }
    System.out.println(sum);//display final sum 
  }
}
