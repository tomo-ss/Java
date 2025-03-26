
public class If11 {

	public static void main(String[] args) {
		// もし、”ある数”(age)が20未満なら、未成年と表示。そうでない場合で、80より大きければ、高齢者と表示。それ以外の場合は、成人と表示。

	int age =35;
	if(age < 20){
		System.out.println("未成年");
	}else if(age > 80){
	    System.out.println("高齢者");
	}else{
		System.out.println("成人");
	}
	}
}
