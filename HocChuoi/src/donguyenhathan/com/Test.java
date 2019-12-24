package donguyenhathan.com;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//Còn 1 loại nữa là biểu thức chính quy
		String s="Nguyễn Thị Long Lanh";
		//Để kiểm tra số ký tự trong chuỗi
		int n= s.length();
		System.out.println("Số ký tự = "+n);
		//Đếm số ký tự in hoa, in thường
		int soKTHoa=0;
		int soKTThuong=0;
		int soKhoangTrang=0;
		for(int i=0; i<s.length();i++)
		{
			char c=s.charAt(i); //Lấy Kt thứ i trong chuỗi s ra
			if(Character.isUpperCase(c))
				soKTHoa++;
			if(Character.isLowerCase(c))
				soKTThuong++;
			if(Character.isSpaceChar(c))
				soKhoangTrang++;
		}
		System.out.println("Số ký tự in hoa= "+soKTHoa);
		System.out.println("Số ký tự in thường= "+soKTThuong);
		System.out.println("Số ký tự khoảng trắng= "+soKhoangTrang);
		//Hàm kiểm tra ký tự thông thường
		int soKTLetter=0;
		for(int i=0; i<s.length();i++)
		{
			char c=s.charAt(i);
			//Letter A-z
			if(Character.isLetter(c))
				soKTLetter++;
		}
		System.out.println("Số ký tự thông thường: "+soKTLetter);
		
		//Ta thử áp dụng kiểm tra chuỗi sau người ta
		//Nhâp tên có đúng hay không
		//Biết rằng tên đúng là tên: chứa ký tự thông thường
		//và khoảng trắng mà thôi
		boolean ktHopLe=true;
		for(int i=0; i<s.length();i++)
		{
			char c= s.charAt(i);
			//Đối với toán hoặc nó chạy từ trái qua phải và ngưng nếu bên trái dấu ngoặc đúng;
			//Nếu bên trái sai thì típ tục kiểm tra biểu thức bên phải
			if(!(Character.isLetter(c)||Character.isSpaceChar(c))) //Chứng minh phản chứng
			{
				ktHopLe=false;
				break;
			}
		}
		if(ktHopLe)
			System.out.println("Chuỗi \"" + s + "\" hợp lệ");
		else
			System.out.println("Chuỗi \"" + s + "\" không hợp lệ");
		
		//Tìm chuỗi là 1 trong những hàm quan trọng thường dùng
		s="Sài Gòn người ta bán Bông Gòn";
		int vt= s.indexOf("Gòn");//-->Trả về vtri đầu tiên xuất hiện của Gòn
		System.out.println("Vị trí đầu tiên của Gòn = "+vt);
		int vt2=s.lastIndexOf("Gòn");
		System.out.println("Vị trí cuối cùng của Gòn = "+vt2);
		
		//Hàm ta gặp nhiều nhất đó là hàm Tách Chuỗi
		//Muốn tách chuỗi được thì chuỗi đó phải có Cấu Trúc
		//có cấu trúc: là có quy luật giống nhau cho mọi chuỗi đầu vào
		String s2="K194114;Nguyễn Thị Hạnh;hanntK194114@st.uel.edu.vn";
		//Để ngoặc vuông trc sau đều dc
		String[] arr=s2.split(";");
		//length là thuộc tính: là những gì thuộc về đối tượng
		//Length() là phương thức
		for(int i=0; i<arr.length;i++)
		{
			String str= arr[i]; //Gọi là index
			System.out.println(str);
		}
		//nối chuỗi:
		//Trong Java và C# giống nhau, là có 2 cách chính để nối chuỗi
		//Cách 1 là dùng dấu + để nối chuỗi --> Đây là cách sai lầm nhất
		//Khi chúng ta phải xử lý chuỗi liên tục và nhiều
		//Nó chỉ phù hợp khi ta nối 1 vài chuỗi và lâu lâu mới nói
		//Cách 2: Dùng đối tương StringBuilder
		//phù hợp cho mọi TH nối chuỗi, tuy nhiên nó hơi phức tạp
		//nên khi nối ít ta dùng cách 1	
		//nên khi đọc (cào) dữ liệu từ trên mạng về hoặc tải dữ liệu từ file
		//Cấm được dùng dấu +
		//Mỗi lần dùng 1 dấu cộng thì hệ điều hành cấp phát 1 ô nhớ 
		//để lưu chuỗi mới --> Nếu ta chạy liên tục không ngừng --> chịu nổi ko
		//điều này làm cho phần mềm chạy cực chậm
		String s3="Nguyễn Thị";
		String s4="An";
		String s5=s3+" "+s4;
		System.out.println(s5);
		
		//Minh họa về dùng StringBuilder
		StringBuilder builder= new StringBuilder();
//		for(int i=0; i<100000;i++)
//		{
//			builder.append("i= ");
//			builder.append("Hàn");
//			builder.append(i);
//			builder.append("\n");
//		}
//		System.out.println(builder.toString());
		
		
		//Một số hàm trích lọc chuỗi quan trọng thường gặp
		//Giả sử ta có chuỗi sau:
		String path="D:/nhac/damma/doithong2mo.mp3";
		//Câu 1: Hãy trích lọc lấy tên bài hát: doithong2mo.mp3
		//Câu 2: Hãy trích lọc lấy tên bài hát: doithong2mo
		int vitriSecCuoiCung= path.lastIndexOf("/");
		//rõ ràng: chữ [d] ở ngay đằng sau dấu sẹc
		String tenBaiHatCoDuoiMoRong= path.substring(vitriSecCuoiCung+1);
		System.out.println(tenBaiHatCoDuoiMoRong);
		int viTriChamCuoiCung= tenBaiHatCoDuoiMoRong.lastIndexOf(".");
		String tenBaiHatKoMoRong= tenBaiHatCoDuoiMoRong.substring(0, viTriChamCuoiCung);
		System.out.println(tenBaiHatKoMoRong);
		
		String ten="Đỗ    nguYễn nHẬT    HÀN  ";
		String tenMoi= toiUuChuoi(ten);
		System.out.println(ten+" ==> có " +ten.length() + " ký tự");
		System.out.println(tenMoi+" ==> có " +tenMoi.length() + " ký tự");
		
		System.out.println("Nhập tên bạn: ");
		Scanner sc= new Scanner(System.in);
		String tenBan= sc.next();
		System.out.println(toiUuChuoi(tenBan));
	}
	
	/**
	 * Hàm này dùng để tối ưu chuỗi Danh Từ
	 * Khi người dùng nhập 1 tên bất kỳ, phần mềm phải tự động:
	 * 1) Xóa khoảng trắng dư thừa bên trái và bên phải chuỗi
	 * 2) Ký tự đầu tiên của các từ Viết hoa
	 * Ví dụ: 
	 * "    nGUyễn      ThỊ  nỞ"
	 * ta phải tự động đưa về: "Nguyễn Thị Nở"
	 * @param s
	 * @return
	 */
	static String toiUuChuoi(String s)
	{
		//Xóa khoảng trắng dư thừa bên trái và bên phải chuỗi:
		s=s.trim(); //Xóa trụi lủi khoảng trắng dư thừa bên trái và bên phải
		//Loại bỏ các khoảng trắng dư thừa ở giữa các từ:
		String[] arrWord= s.split(" ");
		s=""; //Cho rỗng để tái sử dụng lại
		for(int i=0; i<arrWord.length;i++)
		{
			String word= arrWord[i];
			if(word.length()>0)
			{
				String newWord=word.toLowerCase();
				char []arrKt= newWord.toCharArray();
				arrKt[0]=Character.toUpperCase(arrKt[0]);
				newWord= new String(arrKt);
				s+=newWord+" ";
			}
		}
		return s.trim();
	}

}
