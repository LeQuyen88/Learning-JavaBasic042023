package JavaBasic.com.DieuKien;

public class DieuKienIfElseIf {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;
        String name = "FPT";

        if(number1 > 30){
            System.out.println("thỏa mãn điều kiện 1");

        } else if (number1 >= 20) {
            System.out.println("thỏa mãn điều kiện 2");
        } else if (number1 >= 5) {
            System.out.println("thỏa mãn điều kiện 3");
        }else {
            System.out.println("không thỏa mãn điều kiện nào cả");
        }

        int diemTB = 9;
        if (diemTB >= 8 ){
            System.out.println("Học sinh giỏi");
        } else if (diemTB >= 7 && diemTB < 8) {
            System.out.println("Học sinh Khá");
            
        } else if (diemTB >= 5 && diemTB < 5) {
            System.out.println("Học sinh Trung Bình");
        }else {
            System.out.println("Học sinh Yếu");

        }
    }
}
