
public class Switch02 {

	public static void main(String[] args) {
		// もし、”ある数”(a)が0の場合、“aは0に等しい“と表示。もしくは、”ある数”(a)が1の場合、”aは1に等しい”と表示。それ以外の場合は、”aは0でも1でもない”と表示する。

 int a = 5;

 switch(a){
 case 0:
	 System.out.println("aは0に等しい");
	 break;
 case 1:
	 System.out.println("aは1に等しい");
	 break;
 default:
	 System.out.println("aは0でも1でもない");
 }
 }

}
