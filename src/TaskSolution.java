import java.util.HashMap;
import java.util.*;

public class TaskSolution {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(5, "пять");
        hashMap.put(6, "шесть");
        hashMap.put(7, "семь");
        hashMap.put(8, "восемь");
        hashMap.put(9, "девять");
        hashMap.put(10, "десять");
        hashMap.put(11, "одиннадцать");
        hashMap.put(12, "двенадцать");
        hashMap.put(13, "тринадцать");
        hashMap.put(14, "четырнадцать");
        hashMap.put(15, "пятнадцать");

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            if (entry.getValue().contains("цать")) {
                System.out.println(entry.getKey());
            }
        }
    }
}
