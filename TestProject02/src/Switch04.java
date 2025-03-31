
public class Switch04 {

	public static void main(String[] args) {
		// もし、”ある変数”(a)が”赤”の場合、“赤組です“と表示。もしくは、”ある変数”(a)が”白”の場合、”白組です”と表示。それ以外の場合は、”エラーです”と表示する。

String a = "青";

switch(a){
case"赤":
	System.out.println("赤組です");
	break;
case"白":
	System.out.println("白組です");
	break;
default:
	System.out.println("エラーです");
	}
	}
}
