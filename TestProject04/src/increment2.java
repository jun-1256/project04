
public class increment2 {

	public static void main(String[] args) {
		// 加算子、減算子
		// 後置加算子
		// a++ ・・・変数を表示。その後に変数に1 を加える
		// 初めに、aに代入された「10」を表示。
		// その後にa(=10)に1を加え「11」になる。
		// 但し、その下にSytem.out.println表示がない為に何も表示されない。
		int a = 10;
		System.out.println(a++ +"\n");
		
		// 続けて、a++と記述すると、このように1つずつ数を増加させて表示できる。
		int a2 = 10;
		System.out.println(a2++);
		System.out.println(a2++);
		System.out.println(a2++);
		System.out.println(a2++);
		
	}

}
