package Use;
import java.util.Scanner;
import Fun.Triangle;
public class display {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����Ҫ��ӡ����������");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
	    Triangle YangHui=new Triangle(n);
		YangHui.print();
	}

}
