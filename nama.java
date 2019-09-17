import java.util.Scanner;
public class nama {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String nama1, alamat;
		int tahun;
		System.out.print("Masukkan nama: ");
		nama1=input.nextLine();
		System.out.print("Masukkan alamat: ");
		alamat=input.nextLine();
		System.out.print("Masukkan umur: ");
		tahun=input.nextInt();
		System.out.println();
		
		
		System.out.println("Saudara: "+nama1);
		System.out.println("Tinggal di: "+alamat);
		System.out.println("Berumur: "+tahun+" tahun");
	}
}