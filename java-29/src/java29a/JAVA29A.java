package java29a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import java29b.JAVA29B;

public class JAVA29A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 都道府県データの初期化
        Map<Integer, JAVA29B> dataMap = new HashMap<>();
        dataMap.put(0, new JAVA29B("北海道", "札幌市", 83424));
        dataMap.put(1, new JAVA29B("青森県", "青森市", 9646));
        dataMap.put(2, new JAVA29B("岩手県", "盛岡市", 15275));
        dataMap.put(3, new JAVA29B("宮城県", "仙台市", 7282));
        dataMap.put(4, new JAVA29B("秋田県", "秋田市", 11638));
        dataMap.put(5, new JAVA29B("山形県", "山形市", 9323));
        dataMap.put(6, new JAVA29B("福島県", "福島市", 13784));
        dataMap.put(7, new JAVA29B("茨城県", "水戸市", 6097));
        dataMap.put(8, new JAVA29B("栃木県", "宇都宮市", 6408));
        dataMap.put(9, new JAVA29B("群馬県", "前橋市", 6362));
        dataMap.put(10, new JAVA29B("埼玉県", "さいたま市", 3798));

        // 入力受け取り
        System.out.println("番号をカンマ区切りで入力してください（例：8,5,9）：");
        String numberInput = scanner.nextLine();

        System.out.println("昇順 or 降順 を入力してください（asc または desc）：");
        String sortOrder = scanner.nextLine().trim().toLowerCase();

        // 入力解析
        String[] numbers = numberInput.split(",");
        List<JAVA29B> selectedList = new ArrayList<>();

        for (String numStr : numbers) {
            try {
                int index = Integer.parseInt(numStr.trim());
                if (dataMap.containsKey(index)) {
                    selectedList.add(dataMap.get(index));
                } else {
                    System.out.println("番号 " + index + " は存在しません。");
                }
            } catch (NumberFormatException e) {
                System.out.println("無効な番号：" + numStr);
            }
        }

        // ソート
        if ("asc".equals(sortOrder)) {
            selectedList.sort(Comparator.comparingDouble(JAVA29B::getArea));
        } else if ("desc".equals(sortOrder)) {
            selectedList.sort(Comparator.comparingDouble(JAVA29B::getArea).reversed());
        } else {
            System.out.println("無効なソート順です。'asc' または 'desc' を指定してください。");
            return;
        }

        // 出力
        for (JAVA29B p : selectedList) {
            p.printInfo();
        }
    }
}