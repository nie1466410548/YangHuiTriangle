package Fun;

public class Triangle {

	int n;
	int [][]YangHui;
	public  Triangle(int N) {
		n=N;
		YangHui=new int[n][n];
		int i,j;
		for(i=1;i<n;i++) {
			YangHui[i][0]=YangHui[i][i]=1;
			for(j=1;j<i;j++) {
				YangHui[i][j]=YangHui[i-1][j-1]+YangHui[i-1][j];
			}
		}
	}
	
	public void print() {
		int i, j;
		for(i = 0; i < n; i++) {
			// ǰ��ո����
			for(j = n - i - 1; j > 0; j--) {
				System.out.print("  ");
			}
			// ÿ����ռ3����ÿ����֮���1��
			for(j = 0; j < i; j++) {
				System.out.printf("%3d ", YangHui[i][j]);
			}
			// ���1����������
			System.out.printf("%3d\n", YangHui[i][j]);
		}		

	}
}
