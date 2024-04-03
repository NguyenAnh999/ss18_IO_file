package baitap.bai2;

import java.io.*;

public class bai2 {
    public static void main(String[] args) {
        copyFileByte("text.txt","newtext.txt");
        System.out.println("copy thanhf coong");
    }


    public static boolean copyFileByte(String input, String output) {
        File inputFile = new File(input);
        File outputFile = new File(output);
        if (!inputFile.exists()) {
            throw new RuntimeException("file ko ton khai");
        }
        FileInputStream ins = null;
        FileOutputStream ous = null;
        try {
            ins = new FileInputStream(inputFile);
            ous = new FileOutputStream(outputFile);
            int c;
            while ((c = ins.read()) != -1) {
                ous.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } finally {
            if (ins != null) {
                try {
                    ins.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (ous != null) {
                try {
                    ous.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return true;
    }

}
