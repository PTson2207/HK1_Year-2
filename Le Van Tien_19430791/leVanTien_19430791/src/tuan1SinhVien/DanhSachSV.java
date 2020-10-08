package tuan1SinhVien;

import java.security.PrivateKey;
import java.util.Scanner;

public class DanhSachSV {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Đây là bảng thông tin sinh viên");
		
		SinhVien sv1 = nhapCung1();
		SinhVien sv2 = nhapMem();
		SinhVien sv3 = new SinhVien(19430791,9,(float) 8.5," hoàng");
		
		xuatTieuDeCot();
		System.out.println();
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
		
	}
	
	static void xuatTieuDeCot() {
		String s = "";
		s+= String.format("%15s%25s%10s%10s%10s", "Mã Sinh Viên","Họ và Tên","Điểm LT","Điểm TH","Điểm TB");
		System.out.println(s);
	}
	
	static SinhVien nhapCung1() {
		SinhVien sv1 = new SinhVien(19430791,5,7,"Lê Văn Tiến");
		return sv1;
	}
	
	static SinhVien nhapMem() {
		Scanner sc = new Scanner(System.in);
		SinhVien SV= new SinhVien();
		System.out.printf("Nhap MSSV cua SV: ");
		int mssv= sc.nextInt();
		sc.nextLine();
		System.out.printf("Nhap HoTen cua SV: ");
		String hoten= sc.nextLine();
		System.out.printf("Nhap DiemLT cua SV: ");
		float diemlt= sc.nextFloat();
		System.out.printf("Nhap DiemTH cua SV: ");
		float diemth= sc.nextFloat();
		SV.setMaSinhVien(mssv);
		SV.setHoTen(hoten);
		SV.setDiemLT(diemlt);
		SV.setDiemTH(diemth);
		return SV;
	}
}