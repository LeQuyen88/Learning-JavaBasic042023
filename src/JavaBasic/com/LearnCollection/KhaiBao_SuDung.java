package JavaBasic.com.LearnCollection;

import java.util.*;

public class KhaiBao_SuDung {
        public static void main(String[] args) {
                //Khai báo array list
                ArrayList<String> arrayList = new ArrayList<String>();
                arrayList.add("Selenium");
                arrayList.add("Appium");
                arrayList.add("Playwright");
                arrayList.add("PHP");
                for (int i = 0; i < arrayList.size(); i++) {
                        System.out.println(arrayList.get(i));
                }
                System.out.println("--------------------------------");
                // Ví dụ thứ 2 về khai báo HashSet
                Set<String> stringSet = new HashSet<String>();
                stringSet.add("PHP");
                stringSet.add("C++");
                stringSet.add("Java");
                stringSet.add("PHP");
                for (String str : stringSet) {
                        System.out.println(str);
                }
                System.out.println("======================================");
                // Ví dụ khai báo kiểu Map <K , V> K là key , V là value
                Map<String, String> stringMap = new HashMap<>();
                stringMap.put("Company", "FIS");
                stringMap.put("address", "Số 10-phạm văn bạch");
                stringMap.put("address", "Tòa keangnam");
                // dưới này dùng key , nên khi truy xuất dữ liệu thì cũng phải dùng key để truy xuất trực tiếp dữ liệu băg key
                System.out.println(stringMap.get("address"));


        }
}
