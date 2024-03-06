
public class Decrement2 {

	public static void main(String[] args) {
		// 加算子、減算子
		// 後置減算子
		
		// a--・・・変数を表示。その後に変数から1を引く
		// 初めに、aに代入された「10」を表示。
		// その後にa(=10)から1を引き「9」になる。
		// 但し、その下にSystem.out.println表示がない為に何も表示されない。
		int a = 10;
		System.out.println(a-- +"\n");
		
		// 続けて、a--と記述すると、このように1つずつ数を減少させて表示できる。
		int a2 = 10;
		System.out.println(a2--);
		System.out.println(a2--);
		System.out.println(a2--);
		System.out.println(a2--);

	}

}
