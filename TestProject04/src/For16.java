
public class For16 {

	public static void main(String[] args) {
		// ある数(i)が偶数の場合「☆」、奇数の場合「★」を表示する。これをある数(i)が0以上5以下の間、繰り返す。
    for(int i = 0; i <=5; i++){
    	String b = i % 2 == 0?"☆":"★";
    	System.out.println(b);
    }
	}

}
