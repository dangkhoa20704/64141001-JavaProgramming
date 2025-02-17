/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Bai_2_ChuviDT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tạo đối tượng từ bàn phím
		Scanner scanner = new Scanner(System.in);
		
		//Nhập chiều dài và chiều rộng
		System.out.print("Nhập chiều rộng: ");
		double rong = scanner.nextDouble();
		
		System.out.print("Nhập chiều dài: ");
		double dai = scanner.nextDouble();
		
		//Tính chu vi, diện tich và cạnh nhỏ nhất
		double Chuvi = (dai + rong) * 2;
		double DienTich = dai * rong;
		double CanhNhoNhat = Math.min(dai, rong);
		
		//Xuất ra màn hình
		System.out.printf("Chu vi: %.2f\n", Chuvi);
		System.out.printf("Diện tích: %.2f\n", DienTich);
		System.out.printf("Cạnh nhỏ nhất: %.2f\n", CanhNhoNhat);
		
		scanner.close();
	}

}
