/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Bai_4_Delta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tạo đối tượng từ bàn phím
		Scanner scanner = new Scanner(System.in);
		
		//Nhập a,b,c
		System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        
        //Tính Delta
        double Delta = Math.pow(b,2) - 4 * a * c;
        
        //Xuất kết qUẢ
        System.out.printf("Delta = %.2f\n", Delta);
        
        // Tính và xuất căn delta
        if (Delta >= 0) {
            double CanDelta = Math.sqrt(Delta);
            System.out.printf("Căn delta = %.2f\n", CanDelta);
        } else {
            System.out.println(" Vì delta âm, nên phương trình vô nghiệm.");
        }
        
        scanner.close();

	}

}
