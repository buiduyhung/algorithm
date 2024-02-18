/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/**
 *
 * @author hungb
 */
public class code {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi chữ cái Latin: ");
        String inputString = scanner.nextLine();
        System.out.println("Số lượng chữ cái Tiếng Việt có thể tạo thành trong chuỗi là: " + countVietnameseLetters(inputString));
    }
    
    public static int countVietnameseLetters(String inputString) {
        Set<String> vietnameseLetters = new HashSet<>();
        vietnameseLetters.add("aw");
        vietnameseLetters.add("aa");
        vietnameseLetters.add("dd");
        vietnameseLetters.add("ee");
        vietnameseLetters.add("oo");
        vietnameseLetters.add("ow");
        vietnameseLetters.add("w");

        int count = 0;
        int i = 0;
        while (i < inputString.length()) {
            if (i < inputString.length() - 1) {
                String pair = inputString.substring(i, i + 2);
                if (vietnameseLetters.contains(pair)) {
                    count++;
                    i += 2;
                    continue;
                }
            }
            i++;
        }
        return count;
    }
}
