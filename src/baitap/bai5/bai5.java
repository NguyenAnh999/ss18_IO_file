package baitap.bai5;

import java.io.*;
import java.util.Arrays;

public class bai5 {
//    Cho một file csv lưu danh sách các quốc gia gồm các thuộc
//    tính id, code, name. Trong đó CSV là một tập tin văn bản
//    bình thường, nó lưu trữ dữ liệu theo từng cột, và chia nó
//    bằng dấu phân cách (thường là dấu phẩy “,“).
    public static void main(String[] args) {
        File file = new File("C:\\JavaCodeOff\\session18-file\\src\\baitap\\bai5\\bai5.text");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int c;
            String str;
            while ((str=bufferedReader.readLine())!=null){
                String[] arr = str.split(",");
                System.out.println(Arrays.toString(arr));
            }
            fileReader.close();
        } catch (IOException e) {
            System.out.println("loi link");;
        }catch (Exception e){
            System.out.println("loi");;

        }


    }
}
