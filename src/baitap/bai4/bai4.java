package baitap.bai4;

import java.io.*;

public class bai4 {
    public static void main(String[] args) {
        copyFileCharacter("text.txt","newtextreverse.txt");
        System.out.println("copy thanh coong");
    }


    public static boolean copyFileCharacter(String input, String output) {
        File inputFile = new File(input);
        File outputFile = new File(output);
        if (!inputFile.exists()) {
            throw new RuntimeException("file ko ton khai");
        }
        BufferedReader bfr = null;
        BufferedWriter bfw = null;
        StringBuilder text= new StringBuilder();
        try {
            bfr = new BufferedReader(new FileReader(inputFile));
            bfw = new BufferedWriter(new FileWriter(outputFile));

            int c;
            while ((c = bfr.read()) != -1) {
                text.append((char) c);
            }
            System.out.println(text);
            bfw.write(String.valueOf(text.reverse()));

           bfw.flush(); // day tu buffer ra file
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } finally {
            if (bfr != null) {
                try {
                    bfr.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (bfw != null) {
                try {
                    bfw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return true;
    }


}
