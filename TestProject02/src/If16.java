
public class If16 {

	public static void main(String[] args) {
		// もし”ある数”(a)が0より大きいとき、”ある数”(a)が2と等しければ、Aと表示する。そうでない場合で、”ある数”(a)が3と等しいとき、Bと表示する。それ以外の場合は、Cと表示する
int a = 10;

if(a > 0)
	if(a == 2){
		System.out.println("A");
	}else if(a == 3){
		System.out.println("B");
	}else{
		System.out.println("C");
	}	
	}

}
