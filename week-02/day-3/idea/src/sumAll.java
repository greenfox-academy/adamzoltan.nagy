/**
 * Created by Adam on 2017. 03. 23..
 */
public class sumAll {
  public static void main(String[] args) {
    int [] ai = {3, 4, 5, 6, 7};
    int sum = 0;
    for (int i = 0; i < ai.length; i++) {
      sum = sum + ai[i];
    }
    System.out.println(sum);
  }
}
