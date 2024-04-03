package baitap.bai6;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class bai6 {
    public static void main(String[] args) {
        String fileName = "C:\\JavaCodeOff\\session18-file\\src\\input.txt"; // Tên file văn bản cần đọc

        // Bước 1: Đọc nội dung từ tệp văn bản
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                contentBuilder.append(line).append(" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String content = contentBuilder.toString();

        // Bước 2: Tính toán tần suất xuất hiện của từng từ
        Map<String, Integer> wordFrequency = new HashMap<>();
        String[] words = content.split("\\s+");
        for (String word : words) {
            word = word.toLowerCase(); // Chuyển đổi từ sang chữ thường để phân biệt chữ hoa/chữ thường
            if (wordFrequency.containsKey(word)) {
                wordFrequency.put(word, wordFrequency.get(word) + 1);
            } else {
                wordFrequency.put(word, 1);
            }
        }

        // Bước 3: Xác định từ được sử dụng nhiều nhất
        int maxFrequency = 0;
        String mostUsedWord = "";
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostUsedWord = entry.getKey();
            }
        }

        // Bước 4: Hiển thị từ được sử dụng nhiều nhất
        System.out.println("Từ được sử dụng nhiều nhất là '" + mostUsedWord + "' với tần suất xuất hiện là " + maxFrequency);
    }
}
