package JavaBasic.com.Mang;

public class MangMotChieu {
        public static void main(String[] args) {
                // khai báo mảng (số 20 là độ dài mảng)
                int SoNguyen[] = new int[20];
                //Thêm gias trị vào mảng thủ công từng vị trí
                // Mảng bao giờ cũng bắt đầu từ vị trí từ 0
                SoNguyen[0] = 5;
                SoNguyen[2] = 10;
                SoNguyen[19] = 30;
                //In giá trị trong mảng theo thủ công từng vị trí ==> kết quả in ra là 0 là do không được gán giá trị vào mảng
                // System.out.println(SoNguyen[0]);
                //System.out.println(SoNguyen[1]);
                // System.out.println(SoNguyen[2]);
                // System.out.println(SoNguyen[3]);
                // System.out.println(SoNguyen[19]);
                System.out.println("Độ dài mảng: " + SoNguyen.length);

                //Duyệt phần tử trong mảng với vòng lặp For
                for (int i = 0; i < SoNguyen.length; i++)
                //for (int i =0 ; i < 20 ; i++)
                {
                        System.out.println(SoNguyen[i]);
                }
                // Thêm giá trị vào mảng thông qua vòng lặp for
                for (int i = 2; i < SoNguyen.length; i++) {
                        SoNguyen[i] = 10;
                }
                // Duyệt phần tử trong mảng với vòng lặp for vừa thêm tại dòng 26
                for (int i = 0; i < SoNguyen.length; i++) {
                        System.out.println(SoNguyen[i]);
                }

        }

}

