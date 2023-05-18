package JavaBasic.com.LearnCollection;

import java.util.ArrayList;

public class LearArrayList {
        public static void main(String[] args) {
                //khai báo array list
                ArrayList<String> arrayList = new ArrayList<String>();
                // Thêm phần tử vào array list
                arrayList.add("Selenium");
                arrayList.add("Java");
                arrayList.add("Selenium");
                arrayList.add(3, "Extent Report");//phương thức này Dùng để thêm vào với vị trí chỉ định


                // Dùng hàm remove
                arrayList.remove("Selenium");
                arrayList.remove(1);

                // Duyệt array list - Dùng for cơ bản
                for (int i = 0; i < arrayList.size(); i++) {
                        System.out.println(arrayList.get(i));
                }
                System.out.println("================================================================");
                // Dùng hàm add all
                ArrayList<String> arrayList2 = new ArrayList<String>();
                arrayList2.add("PHP");
                arrayList2.add("Java");
                // Truyền lệnh Add All array list 2 vào array list 1
                arrayList.addAll(arrayList2);
                // Duyệt array list - Dùng for cơ bản
                for (int i = 0; i < arrayList.size(); i++) {
                        System.out.println(arrayList.get(i));
                }
                System.out.println("================================================================");
                //Tìm kiếm phần tử trong array list
                System.out.println("Tìm kiếm phần tử:" + arrayList.contains("Java"));
                
                System.out.println("================================================================");
                // chuyển Array list về  dang aray
                Object[] mang = arrayList.toArray();
                for (int i = 0; i < mang.length; i++) {
                        System.out.println(mang[i]);
                }
        }
}
