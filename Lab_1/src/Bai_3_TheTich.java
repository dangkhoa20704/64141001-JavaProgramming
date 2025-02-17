/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */

public class Bai_3_TheTich {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tạo đối tượng từ bàn phím
		Scanner scanner = new Scanner(System.in);
		
		//Nhập cạnh cảu khối lập phương
		System.out.print("Nhập cạnh: ");
		double canh = scanner.nextDouble();
		
		//Tính thể tích khối lập phương
		double TinhTheTich1 = canh * canh * canh;
		double TinhTheTich2 = Math.pow(canh,3);
		
		//Xuất kết quả 
		System.out.printf("Thể tích 1: %.2f\n", TinhTheTich1);
		System.out.printf("Thể tích 2: %.2f\n", TinhTheTich2);
		
		scanner.close();
	}

}
