
public class If12 {

	public static void main(String[] args) {
		//もし、”ある数”(age)が20未満なら、未成年と表示。そうでない場合で、20以上で80以下であれば、成人と表示。それ以外の場合は、高齢者と表示する。
  int age =35;

  if(age < 20){
	System.out.println("未成年");
 }else if(age >= 20 && age <= 80 ){
	 System.out.println("成人");
 }else{
	System.out.println("高齢者");
 }
 }

  }
