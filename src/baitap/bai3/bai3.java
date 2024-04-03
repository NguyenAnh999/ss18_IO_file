package baitap.bai3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class bai3 {
    public static void main(String[] args) {
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
        List<String> arrStr=new ArrayList<>();
        String text;String maxStr="";
        try {
            text = reader1.readLine();
            while (text != null) {
                System.out.println(text);
                String[] arr =text.split(" ");
                for (int i = 0; i < arr.length; i++) {
                    arrStr.add(arr[i]);
                }
                text = reader1.readLine();
            }
            for (String s : arrStr) {
                if (s.length()>maxStr.length()){
                    maxStr=s;
                }
            }
            System.out.println("chuoi lon nhat la " +maxStr);
            for (String s : arrStr) {
                if (s.length()==maxStr.length()){
                    System.out.println(s==maxStr?"":"va chuoi "+s);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
