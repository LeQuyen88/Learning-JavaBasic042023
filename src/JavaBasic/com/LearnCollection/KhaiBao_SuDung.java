package JavaBasic.com.LearnCollection;

import java.util.ArrayList;

public class KhaiBao_SuDung {
    public static void main(String[] args) {
        //Khai báo array list
        ArrayList<String>  arrayList = new ArrayList<String>();
        arrayList.add("Selenium");
        arrayList.add("Appium");
        arrayList.add("Playwright");
        for (int i =0 ; i <arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }

    }
}
