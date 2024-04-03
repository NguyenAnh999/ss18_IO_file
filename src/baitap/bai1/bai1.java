package baitap.bai1;

import java.io.*;
import java.util.Arrays;

public class bai1 {
    //Đề bài: Viết chương trình đọc nội dung từ file text và hiển thị số lượng từ trong file đó.
    public static void main(String[] args) {
//           B1: tạo file text có sẵn dữ liệu văn bản (data có thể là đề bài này)
//           B2: Tạo hàm đọc file trên và trả ra String.
//           B3: convert String ở bước 2 thành mảng string, mỗi từ là 1 phần tử
//           B4: length của mảng trên chính là số lượng từ trong file.
//           B2: Tạo hàm đọc file trên và trả ra String.
        File inputFile = new File("text.txt");

        if (!inputFile.exists()) {
            try {
                inputFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileReader reader = null;
        BufferedReader reader1 = null;
        try {
            reader = new FileReader("text.txt");
            reader1 = new BufferedReader(reader);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int count=0;
        String text;
        try {
            text = reader1.readLine();
            while (text != null) {
                System.out.println(text);
                String[] arr =text.split(" ");
                count += arr.length;
                text = reader1.readLine();
            }
            System.out.println("file cuar banj cos "+count+" phan tu");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}