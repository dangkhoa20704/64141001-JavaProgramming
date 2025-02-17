/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Bai_1 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Tạo đối tượng Scanner để đọc dữ liệu
			Scanner scanner = new Scanner(System.in);
			
			//Nhập họ và tên
			System.out.print("Họ và tên: ");
			String hoTen = scanner.nextLine();
			
			//Nhập điểm trung bình
			System.out.print("Điểm TB: ");
			double diemTB = scanner.nextDouble();
			
			//Xuất ra màn hình
			System.out.printf("%s, %f điểm",hoTen,diemTB);
			
			scanner.close();
		 
	}

}
