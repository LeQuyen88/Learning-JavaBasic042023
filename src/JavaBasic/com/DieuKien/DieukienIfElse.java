package JavaBasic.com.DieuKien;

public class DieukienIfElse {
    public static void main(String[] args) {
        // Điều kiện If
        int age = 30;
        String name = "Auto";
        String message = "Add Category successful.";

        if (age>20){
            System.out.println("Tuổi lớn hơn 20");
        }

        if(age > 20 && name.equals("Auto")) // Dùng hàm "equals" để so sánh bằng (không nên dùng dấu ==), ở đây dùng 2 loại toan tử logic và quan hệ
        {
            System.out.println("Thỏa mãn điều kiện");
        }

        if(age > 20 && name.equals("manual")) // Dùng hàm "equals" để so sánh bằng (không nên dùng dấu ==)
        {
            System.out.println("Thỏa mãn điều kiện"); // không in ra gì hết do không thỏa mãn điều kiện
        }
        if(age > 20 && (name.equals("manual") || message.contains("success"))) // Dùng thêm hàm "contains" để so sánh chứa , ở đây dùng 2 loại toan tử logic và quan hệ
        {
            System.out.println("Thỏa mãn điều kiện"); // in ra ket quả do thỏa mãn 1 trong 2 đk về msg.
        }

        // Vi Du về IF ELSE

        int number = 13;
        if (number % 2 == 0)
        {
            System.out.println("số " + number + "là số chan");
        }
        else {
            System.out.println("số " + number + "là số lẻ");
        }



        }
}
