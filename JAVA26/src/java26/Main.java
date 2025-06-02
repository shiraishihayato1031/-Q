package java26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("コンソールに文字を入力してください");

        String input = scanner.nextLine();  // 例: ライオン:2.1:80,ゾウ:3.2:40,...
        String[] animalDataArray = input.split(",");

        Animal[] animals = new Animal[animalDataArray.length];

        for (int i = 0; i < animalDataArray.length; i++) {
            String[] parts = animalDataArray[i].split(":");
            String name = parts[0];
            double length = Double.parseDouble(parts[1]);
            int speed = Integer.parseInt(parts[2]);

            animals[i] = new Animal(name, length, speed);
        }

        for (Animal animal : animals) {
            animal.printInfo();
        }

        scanner.close();
    }
}