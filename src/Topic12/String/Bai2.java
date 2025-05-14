package Topic12.String;

public class Bai2 {
    public static void main(String[] args) {
        String text = "Automation Testing 345 Tutorials Online 789";

        //số lượng ký tự "a" có trong chuỗi
        int soLuongKyTuA = 0;
        char kyTuTaiViTriI;
        for (int i = 0 ; i < text.length() ; i++){
            kyTuTaiViTriI = text.charAt(i);
            if (kyTuTaiViTriI == 'a' || kyTuTaiViTriI == 'A'){
                soLuongKyTuA ++;
            }
        }
        System.out.println(soLuongKyTuA);

        //chuỗi có chứa "Testing" không
        boolean checkTesting = text.contains("Testing");
        System.out.println(checkTesting);

        //Kiểm tra chuối có bắt đầu bằng "Automation" không
        boolean tuDauTien = text.startsWith("Automation");
        System.out.println(tuDauTien);

        //Kiểm tra chuỗi có kết thúc bằng từ "Online" không
        boolean tuCuoiCung = text.startsWith("Online");
        System.out.println(tuCuoiCung);

        //Lấy vị trí của từ "Tutorials" có trong chuỗi
        int viTri;
        viTri = text.indexOf("Tutorials");
        System.out.println(viTri);

        // Thay thế từ "Online" bằng "Ofline"
        String newtext = text.replace("Online", "Ofline");
        System.out.println(newtext);

        //Đếm số lượng ký tự là số có trong chuỗi
        int soLuongKyTuSo = 0;
        String kyTuChu;
        for (int i = 0 ; i < text.length() ; i++){
            if (Character.isDigit(text.charAt(i))){
                soLuongKyTuSo ++;
            }
        }
        System.out.println(soLuongKyTuSo);
        }
    }
